package com.producerClient;

import java.nio.file.Paths;

import javax.net.ssl.SSLException;

import com.google.common.base.Strings;
import com.google.protobuf.ByteString;
import com.Adapter.RUTTER_GRPC.SeaScanServiceGrpc;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse;
import static com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage.parseFrom;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;

public class ProducerClient {

	private String accessToken = null;

	private com.google.protobuf.ByteString byteString;
	private byte[] data;
	private HandshakeMessage handshake;

	// Process the ByteString as needed

	// Additional processing based on your requirements

	void setAccssToken(String token) {
		this.accessToken = token;
	}

	public void createClient() {
		System.out.println("Creating Client...");
		String targetUri = "group01.dxc8f6hbhuejfygu.canadaeast.azurecontainer.io:50052";

		SslContext sslContext = null;
		try {
			sslContext = GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
		} catch (SSLException e) {
			e.printStackTrace();
			return;
		}

		ClientInterceptor interceptor = new ClientInterceptor() {
			@Override
			public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
					CallOptions callOptions, Channel next) {
				return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
						next.newCall(method, callOptions)) {
					@Override
					public void start(Listener<RespT> responseListener, Metadata headers) {
						if (!Strings.isNullOrEmpty(accessToken)) {
							headers.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER),
									"Bearer " + accessToken);
						}
						super.start(responseListener, headers);
					}
				};
			}
		};

		ManagedChannel channel = NettyChannelBuilder.forTarget(targetUri).sslContext(sslContext).intercept(interceptor)
				.build();

		if (channel == null) {
			System.out.println("Connection failed: Channel could not be created.");
			return;
		}
		System.out.println("Channel created successfully!");
		SeaScanServiceGrpc.SeaScanServiceBlockingStub stub = SeaScanServiceGrpc.newBlockingStub(channel);
	    HandshakeMessage handshakeMessage = HandshakeMessage.newBuilder().build();
		HandshakeResponse s = stub.shakeHands(handshakeMessage);
		
//		readBinaryFileAndCreateHanshakeMessage();
//		HandshakeResponse s = stub.shakeHands(handshake);

		String nodeID = s.getNodeId();
		if (nodeID != null) {
			System.out.println("S6 node ID: " + nodeID);
			System.out.println("Connection established!");
		}
		// new SeaScanServiceOuterClass(channel);

	}

	public ProducerClient() {
		this.setAccssToken("No token");
		readBinaryFileAndCreateHanshakeMessage();
		createClient();
	}

	public static void main(String[] args) {
		ProducerClient p = new ProducerClient();
	}

	private void readBinaryFileAndCreateHanshakeMessage() {
		String filePath = "./src/main/java/com/producerClient/Rutter.Adapter.GRPC.PngImageMessage.144.bin";
//		data = new byte[1];
		try {
            // Read the binary data from the file
            data = Files.readAllBytes(Paths.get(filePath));
            ByteBuffer buffer = ByteBuffer.wrap(data);

            // Parse the HandshakeMessage from the binary data
            handshake = HandshakeMessage.parseFrom(buffer);

            // Process the parsed HandshakeMessage
//            System.out.println(handshake);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
