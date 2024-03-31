package com.producerClient;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.net.ssl.SSLException;

import com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage;
import com.Adapter.RUTTER_GRPC.SeaScanServiceGrpc;
import com.google.common.base.Strings;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.rutter.simulationrecord.SimulationTranscript;

import io.github.cdimascio.dotenv.Dotenv;
import io.grpc.CallOptions;

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
import io.grpc.stub.StreamObserver;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

public class PngImageMessageProvider {
	private ManagedChannel channel;
	private SeaScanServiceGrpc.SeaScanServiceStub asyncStub;
	
	// Load values from .env file
	Dotenv dotenv = Dotenv.load();
	
	private String accessToken = dotenv.get("ACCESS_TOKEN");

	
	String filesPath = "src/main/images/Rutter.Adapter.GRPC.PngImageMessage.";
	int pngFileNumber = 144;
	
	private SimulationTranscript simulationTranscript;

	public PngImageMessageProvider(SimulationTranscript transcript) {

		simulationTranscript = transcript;
    
		String targetUri = dotenv.get("SEA_SCAN_TARGET_URI");

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

		channel = NettyChannelBuilder.forTarget(targetUri).sslContext(sslContext).intercept(interceptor).build();

		asyncStub = SeaScanServiceGrpc.newStub(channel);

	}

	public void sendPngImageStream() {

		List<String> receivedUniqueIds = new ArrayList<>(); // List to store received unique IDs

		Iterator<PngImageMessage> pngImageIterator = generatePngImageMessagesIterator(30);

		StreamObserver<Empty> streamObserver = new StreamObserver<>() {
			
			@Override
			public void onNext(Empty empty) {
				System.out.println("Png Message sent from Producer Client!");
			}

			@Override
			public void onError(Throwable throwable) {
				System.out.println("Error occurred: " + throwable.getMessage());
			}

			@Override
			public void onCompleted() {
				System.out.println("Provider Client completed sending PNG messages to S6Node with unique IDs: " + receivedUniqueIds);
			}
		};

		StreamObserver<PngImageMessage> requestObserver = asyncStub.openPngImageStream(streamObserver);

		while (pngImageIterator.hasNext()) {
			PngImageMessage pngImageMessage = pngImageIterator.next();
			requestObserver.onNext(pngImageMessage);
//			System.out.println("Stream observer interface receives a pngImageMessage from the stream");

			// Add the unique ID to the list
			receivedUniqueIds.add(pngImageMessage.getSeascanSourceId());
			
			// Record message to SimulationTranscript.
			recordMessage(pngImageMessage);
			
		}

		requestObserver.onCompleted();
	}
	
	private void recordMessage(PngImageMessage message) {
		// TODO: FIX INCORRECT PARAMETERS FOR MESSAGEID, MESSAGE TYPE, MESSAGE SIZE, ORIGIN ID.
		String messageID = message.getSeascanSourceId();
		long transmitTime = System.currentTimeMillis();
		String messageType = "PNGImageMessage";
		int messageSize = 0;
		int originID = 0;
		boolean result = simulationTranscript.recordMessageSent(messageID, transmitTime, messageType, messageSize, originID);
		// Unlikely error where identical UUIDs are produced.
		if (!result) { System.err.println("ERROR: Sent message with the same ID as previously sent message."); }
	}

	private Iterator<PngImageMessage> generatePngImageMessagesIterator(long numberOfPngImageMessages) {
		// This method generates and returns an iterator for a stream of
		// PngImageMessages

		return new Iterator<PngImageMessage>() {
			private byte[] data;
			private ByteString pngByteString;
			private int currentIndex = 0;


			@Override
			public boolean hasNext() {
				return currentIndex < numberOfPngImageMessages;

			}

			@Override
			public PngImageMessage next() {
				final String uniqueId = UUID.randomUUID().toString();
				ByteBuffer buffer = null;
				String nextFilePath = filesPath + pngFileNumber + ".bin";

				try {
					data = Files.readAllBytes(Paths.get(nextFilePath));
					pngByteString = ByteString.copyFrom(data);
					

		            // Parse the HandshakeMessage from the binary data
				} catch (IOException e) {
					e.printStackTrace();
				}

				PngImageMessage pngImageMessage = PngImageMessage.newBuilder()
						.setPngData(pngByteString)
						.setSeascanSourceId(uniqueId)
						.build();
				
//	            try {
//					data = Files.readAllBytes(Paths.get(nextFilePath));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//	            buffer = ByteBuffer.wrap(data);
//				
//	            PngImageMessage pngImageMessage = null;
//				try {
//					pngImageMessage = PngImageMessage.parseFrom(buffer);
//				} catch (InvalidProtocolBufferException e) {
//					e.printStackTrace();
//				}


				currentIndex++;
//	            pngFileNumber++;

				return pngImageMessage;
			}
		};
	}

	public void shutdown() {
		channel.shutdown();

	}

}
