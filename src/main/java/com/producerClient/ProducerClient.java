package com.producerClient;

import javax.net.ssl.SSLException;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;
import com.google.common.base.Strings;
import com.Adapter.RUTTER_GRPC.SeaScanServiceGrpc;
import com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage;
import com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse;

import io.github.cdimascio.dotenv.Dotenv;
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

public class ProducerClient extends SeaScanServiceGrpc.SeaScanServiceImplBase  {
	
	
	Dotenv dotenv = Dotenv.load();

	// Retrieve the access token
	private String accessToken = dotenv.get("ACCESS_TOKEN");
	
//	private String accessToken = null;
	private String nodeID = "No Id";
	
//	void setAccssToken(String token) {
//		this.accessToken = token;
//	}
	
	public String getNodeID() {
		return nodeID;
	}
	
	public void createClient(){
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
	        public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
	                MethodDescriptor<ReqT, RespT> method,
	                CallOptions callOptions,
	                Channel next) {
	            return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
	                @Override
	                public void start(Listener<RespT> responseListener, Metadata headers) {
	                    if (!Strings.isNullOrEmpty(accessToken)) {
	                        headers.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + accessToken);
	                    }
	                    super.start(responseListener, headers);
	                }
	            };
	        }
	    };
	    
	    ManagedChannel channel = NettyChannelBuilder.forTarget(targetUri)
	            .sslContext(sslContext)
	            .intercept(interceptor)
	            .build();
	    
	    if (channel == null) {
	    	System.out.println("Connection failed: Channel could not be created.");
	    	return;
	    }
	    System.out.println("Channel created successfully!");
	    SeaScanServiceGrpc.SeaScanServiceBlockingStub stub = SeaScanServiceGrpc.newBlockingStub(channel);
	    HandshakeMessage handshakeMessage = HandshakeMessage.newBuilder().build();
	    HandshakeResponse s = stub.shakeHands(handshakeMessage);
	    // stub;
	    String nodeID = s.getNodeId();
	    this.nodeID = nodeID;	    
	    if	(nodeID != null) {	    	
	    	System.out.println("S6 node ID: " + nodeID);
	    	System.out.println("Connection established!");
	    }
	    // new SeaScanServiceOuterClass(channel);
	 // Create an instance of your extended stub class
	    //ProducerClient seaScanClient = new ProducerClient();
	    //seaScanClient.openAisStream(null);
	}
	
	public ProducerClient() {
//		this.setAccssToken("No token");

		
	}
	
	public static void main(String[] args) {
		ProducerClient p = new ProducerClient(); 
		p.createClient();
		StreamObserver<Empty> responseObserver = new StreamObserver<Empty>() {
			// ... implementation of onNext, onError, onCompleted methods ...
			@Override
            public void onNext(Empty empty) {
                // Handle each response from the server
                System.out.println("Received response from server");
            }

            @Override
            public void onError(Throwable throwable) {
                // Handle any errors from the server
                System.err.println("Error from server: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Handle completion of the stream
                System.out.println("Stream completed");
            }
        };
        p.openAisStream(responseObserver);

        // Call the OpenAisStream method and get the StreamObserver for sending messages
        StreamObserver<PngImageMessage> requestObserver = p.openPngImageStream(responseObserver);

	}
}