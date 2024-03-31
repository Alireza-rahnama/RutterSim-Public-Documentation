package com.producerClient;

import io.grpc.CallOptions;
import com.Adapter.RUTTER_GRPC.SeaViewServiceOuterClass;

import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.internal.Stream;
import io.grpc.ClientCall.Listener;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage;
import com.Adapter.RUTTER_GRPC.S6WebServiceGrpc;
import com.Adapter.RUTTER_GRPC.S6WebServiceGrpc.S6WebServiceStub;
import com.Adapter.RUTTER_GRPC.SeaScanServiceGrpc;
import com.Adapter.RUTTER_GRPC.SeaScanServiceGrpc.SeaScanServiceStub;
import com.Adapter.RUTTER_GRPC.SeaViewServiceGrpc;
import com.Adapter.RUTTER_GRPC.SeaViewServiceGrpc.SeaViewServiceBlockingStub;
import com.Adapter.RUTTER_GRPC.SeaViewServiceGrpc.SeaViewServiceStub;
import com.google.common.base.Strings;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.time.Duration;
import java.time.Instant;

import javax.net.ssl.SSLException;
import io.github.cdimascio.dotenv.Dotenv;
import com.Adapter.RUTTER_GRPC.*;
import com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage;
import com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage;

public class ConsumerClient extends SeaViewServiceGrpc.SeaViewServiceImplBase {
	private ManagedChannel channel;
//	private S6WebServiceStub asyncStub;

	private ManagedChannel channel2;
	private SeaScanServiceStub seaScanAsyncStub;
	private SeaViewServiceStub asyncStub;
	private SeaViewServiceBlockingStub seaViewBlockingStub;
	
	private String ConsumerClientuniqueId = UUID.randomUUID().toString();
	

	// Load values from .env file
	Dotenv dotenv = Dotenv.load();

	// Retrieve the access token
	private String accessToken = dotenv.get("ACCESS_TOKEN");

//	private Instant pngImageMessageGenerationStartTime;
//	private Instant pngImageMessageGenerationEndTime;

	String filesPath = "src/main/images/Rutter.Adapter.GRPC.PngImageMessage.";
	int pngFileNumber = 144;

	public ConsumerClient() {

		String targetUri = dotenv.get("S6WEB_SERVICE_TARGET_URI");
		String targetUri2 = dotenv.get("SEA_SCAN_TARGET_URI");
		String targetUriSeaView = dotenv.get("SEA_VIEW_SERVICE_TARGET_URI");

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

//		channel = NettyChannelBuilder.forTarget(targetUri).sslContext(sslContext).intercept(interceptor).build();
//		asyncStub = S6WebServiceGrpc.newStub(channel);

//		channel2 = NettyChannelBuilder.forTarget(targetUri2).sslContext(sslContext).intercept(interceptor).build();
//		seaScanAsyncStub = SeaScanServiceGrpc.newStub(channel2);

		channel = NettyChannelBuilder.forTarget(targetUriSeaView).sslContext(sslContext).intercept(interceptor).build();
		asyncStub = SeaViewServiceGrpc.newStub(channel);
		seaViewBlockingStub = SeaViewServiceGrpc.newBlockingStub(channel);


//		shakeHand(targetUriSeaView);

	}

	public void receivePngImageStream() {

		try {
			List<String> receivedUniqueIds = new ArrayList<>(); // List to store received unique IDs

			StreamObserver<PngImageMessage> responseObserver = new StreamObserver<PngImageMessage>() {
				@Override
				public void onNext(PngImageMessage message) {
					// Handle the received PngImageMessage
					String msg = "Png Message Received in Consumer Client has unique IDs: " + message.getSeascanSourceId();
					System.out.println(msg);
					receivedUniqueIds.add(message.getSeascanSourceId());
				}

				@Override
				public void onError(Throwable t) {
					// Handle any errors that occur
					System.out.println("PngImageStream error: " + t.getMessage());
				}

				@Override
				public void onCompleted() {
					// Handle stream completion
					System.out.println("Received messages at S6Node has unique IDs: " + receivedUniqueIds);
				}
			};

			// Make the RPC call and pass the response observer
			OpenImageStreamMessage openImageStreamMessage = OpenImageStreamMessage.newBuilder().setClientId(ConsumerClientuniqueId).build();
			asyncStub.openPngImageStream(openImageStreamMessage, responseObserver);

		} catch (Exception e) {
			// Handle exceptions that occur during the RPC call
			System.out.println("Error opening stream to S6Node: " + e.getMessage());
		}
	

//		List<String> receivedUniqueIds = new ArrayList<>(); // List to store received unique IDs
//
////		Iterator<PngImageMessage> pngImageIterator = generatePngImageMessagesIterator(3);
//
//		StreamObserver<PngImageMessage> streamObserver = new StreamObserver<>() {
//
//			@Override
//			public void onNext(PngImageMessage pngImageMessage) {
//				System.out.println("Received PngImageMessage with "+ pngImageMessage.getSeascanSourceId() + " UUID.");
//			}
//
//			@Override
//			public void onError(Throwable throwable) {
//				System.out.println("Error occurred: " + throwable.getMessage());
//
//			}
//
//			@Override
//			public void onCompleted() {
//				System.out.println("Server has completed sending responses");
//				System.out.println("Received response with unique IDs: " + receivedUniqueIds);
//			}
//		};
//
//		StreamObserver<PngImageMessage> requestObserver = seaScanAsyncStub.openPngImageStream(streamObserver);
//
//		OpenImageStreamMessage openImageStreamMessage = OpenImageStreamMessage.newBuilder().build();
//		asyncStub.openPngImageStream(openImageStreamMessage, streamObserver);
//
//		boolean streamIsOpen =true;
//
//		while (streamIsOpen) {
//			.
//			PngImageMessage pngImageMessage = openImageStreamMessage.parser().parseFrom;
//			streamObserver.onNext(pngImageMessage);
//			System.out.println("Stream observer interface receives a pngImageMessage from the stream");
//
//			// Add the unique ID to the list
//			receivedUniqueIds.add(pngImageMessage.getSeascanSourceId());
//
//		}
//
//		while (stream.getResponseStream().awaitReady()) {
//		    try {
//		        var message = streamObserver.next();
//		        // Process the message
//		    } catch (StatusRuntimeException ex) {
//		        // Handle exception
//		    }
//		}
//
//		streamObserver.onCompleted();
	}
	
	public void receivePngImageStream2() {
	    try {
	        StreamObserver<PngImageMessage> responseObserver = new StreamObserver<PngImageMessage>() {
	            @Override
	            public void onNext(PngImageMessage message) {
	                // Handle the received PngImageMessage
	                String msg = "Png Message Received! Source ID: " + message.getSeascanSourceId();
	                System.out.println(msg);
	            }

	            @Override
	            public void onError(Throwable t) {
	                // Handle any errors that occur
	                System.out.println("PngImageStream error: " + t.getMessage());
	            }

	            @Override
	            public void onCompleted() {
	                // Handle stream completion
	                System.out.println("Consumer Client PngImageStream completed receiving messages!");
	            }
	        };

	        OpenImageStreamMessage openMsg = OpenImageStreamMessage.newBuilder().build();
	        Iterator<PngImageMessage> streamIterator = seaViewBlockingStub.openPngImageStream(openMsg);
	        
	        System.out.println("Opening PngImageStream to S6Node");
	        
	        int streamIteratorSize = 0;
	        try {
	            while (streamIterator.hasNext()) {
	                PngImageMessage message = streamIterator.next();
	                String msg = "Consumer Client Received Png Message! Source ID: " + message.getSeascanSourceId();
	                System.out.println(msg);
	                streamIteratorSize++;
	            }
	        } catch (Throwable ex) {
	            System.out.println("PngImageStream cancelled. " + ex.getMessage());
	        }
	        System.out.println("streamIteratorSize: "+ streamIteratorSize);

	    } catch (Throwable ex) {
	        System.out.println("Error opening PngImageStream: " + ex.getMessage());
	    }
	}


	public void shakeHand(String targetUriSeaView) {

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

		ManagedChannel channel = NettyChannelBuilder.forTarget(targetUriSeaView).sslContext(sslContext)
				.intercept(interceptor).build();
		SeaViewServiceBlockingStub syncStub;

		HandshakeMessage handshakeMessage1 = HandshakeMessage.newBuilder().build();
		syncStub = SeaViewServiceGrpc.newBlockingStub(channel);
		HandshakeResponse s = syncStub.shakeHands(handshakeMessage1);

		// stub;
		String nodeID = s.getNodeId();
		if (nodeID != null) {
			System.out.println("S6 node ID for consumer client: " + nodeID);
			System.out.println("Connection to consumer client established!");
		} else {
			System.out.println("BOOOO");
		}
	}

	public void receiveAisToSeaviewMessageStream() {

		try {
			List<String> receivedUniqueIds = new ArrayList<>(); // List to store received unique IDs

			StreamObserver<AisToSeaviewMessage> responseObserver = new StreamObserver<AisToSeaviewMessage>() {
				@Override
				public void onNext(AisToSeaviewMessage message) {
					// Handle the received PngImageMessage
					String msg = "AIS Message Received in Consumer Client has unique IDs: " + message.getSeascanSourceId();
					System.out.println(msg);
					receivedUniqueIds.add(message.getSeascanSourceId());
				}

				@Override
				public void onError(Throwable t) {
					// Handle any errors that occur
					System.out.println("PngImageStream error: " + t.getMessage());
				}

				@Override
				public void onCompleted() {
					// Handle stream completion
					System.out.println("Received messages at S6Node has unique IDs: " + receivedUniqueIds);
				}
			};

			OpenAisStreamMessage openAisStreamMessage = OpenAisStreamMessage.newBuilder().setClientId(ConsumerClientuniqueId).build();
			asyncStub.openAisStream(openAisStreamMessage, responseObserver);

		} catch (Exception e) {
			// Handle exceptions that occur during the RPC call
			System.out.println("Error opening stream to S6Node: " + e.getMessage());
		}

//		streamObserver.onCompleted();
	}

	public void shutdown() {
		channel.shutdown();

	}

}
