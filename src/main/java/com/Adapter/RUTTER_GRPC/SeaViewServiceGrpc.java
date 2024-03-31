package com.Adapter.RUTTER_GRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition for the gRPC connection
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: SeaViewService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SeaViewServiceGrpc {

  private SeaViewServiceGrpc() {}

  public static final String SERVICE_NAME = "S6Protocol.SeaViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage,
      com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> getShakeHandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShakeHands",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage,
      com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> getShakeHandsMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> getShakeHandsMethod;
    if ((getShakeHandsMethod = SeaViewServiceGrpc.getShakeHandsMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getShakeHandsMethod = SeaViewServiceGrpc.getShakeHandsMethod) == null) {
          SeaViewServiceGrpc.getShakeHandsMethod = getShakeHandsMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShakeHands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("ShakeHands"))
              .build();
        }
      }
    }
    return getShakeHandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage,
      com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> getDisconnectClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisconnectClient",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage,
      com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> getDisconnectClientMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> getDisconnectClientMethod;
    if ((getDisconnectClientMethod = SeaViewServiceGrpc.getDisconnectClientMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getDisconnectClientMethod = SeaViewServiceGrpc.getDisconnectClientMethod) == null) {
          SeaViewServiceGrpc.getDisconnectClientMethod = getDisconnectClientMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisconnectClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("DisconnectClient"))
              .build();
        }
      }
    }
    return getDisconnectClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> getOpenNormalTracksStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenNormalTracksStream",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> getOpenNormalTracksStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> getOpenNormalTracksStreamMethod;
    if ((getOpenNormalTracksStreamMethod = SeaViewServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getOpenNormalTracksStreamMethod = SeaViewServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
          SeaViewServiceGrpc.getOpenNormalTracksStreamMethod = getOpenNormalTracksStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenNormalTracksStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("OpenNormalTracksStream"))
              .build();
        }
      }
    }
    return getOpenNormalTracksStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> getOpenOsdStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenOsdStream",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> getOpenOsdStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> getOpenOsdStreamMethod;
    if ((getOpenOsdStreamMethod = SeaViewServiceGrpc.getOpenOsdStreamMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getOpenOsdStreamMethod = SeaViewServiceGrpc.getOpenOsdStreamMethod) == null) {
          SeaViewServiceGrpc.getOpenOsdStreamMethod = getOpenOsdStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenOsdStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("OpenOsdStream"))
              .build();
        }
      }
    }
    return getOpenOsdStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> getOpenAisStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenAisStream",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> getOpenAisStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> getOpenAisStreamMethod;
    if ((getOpenAisStreamMethod = SeaViewServiceGrpc.getOpenAisStreamMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getOpenAisStreamMethod = SeaViewServiceGrpc.getOpenAisStreamMethod) == null) {
          SeaViewServiceGrpc.getOpenAisStreamMethod = getOpenAisStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenAisStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("OpenAisStream"))
              .build();
        }
      }
    }
    return getOpenAisStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> getOpenPngImageStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenPngImageStream",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> getOpenPngImageStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> getOpenPngImageStreamMethod;
    if ((getOpenPngImageStreamMethod = SeaViewServiceGrpc.getOpenPngImageStreamMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getOpenPngImageStreamMethod = SeaViewServiceGrpc.getOpenPngImageStreamMethod) == null) {
          SeaViewServiceGrpc.getOpenPngImageStreamMethod = getOpenPngImageStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenPngImageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("OpenPngImageStream"))
              .build();
        }
      }
    }
    return getOpenPngImageStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> getOpenWamosStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenWamosStream",
      requestType = com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage,
      com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> getOpenWamosStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> getOpenWamosStreamMethod;
    if ((getOpenWamosStreamMethod = SeaViewServiceGrpc.getOpenWamosStreamMethod) == null) {
      synchronized (SeaViewServiceGrpc.class) {
        if ((getOpenWamosStreamMethod = SeaViewServiceGrpc.getOpenWamosStreamMethod) == null) {
          SeaViewServiceGrpc.getOpenWamosStreamMethod = getOpenWamosStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWamosStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SeaViewServiceMethodDescriptorSupplier("OpenWamosStream"))
              .build();
        }
      }
    }
    return getOpenWamosStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeaViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceStub>() {
        @java.lang.Override
        public SeaViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaViewServiceStub(channel, callOptions);
        }
      };
    return SeaViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeaViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceBlockingStub>() {
        @java.lang.Override
        public SeaViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaViewServiceBlockingStub(channel, callOptions);
        }
      };
    return SeaViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeaViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaViewServiceFutureStub>() {
        @java.lang.Override
        public SeaViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaViewServiceFutureStub(channel, callOptions);
        }
      };
    return SeaViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *Unary Calls
     * </pre>
     */
    default void shakeHands(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShakeHandsMethod(), responseObserver);
    }

    /**
     */
    default void disconnectClient(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectClientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    default void openNormalTracksStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenNormalTracksStreamMethod(), responseObserver);
    }

    /**
     */
    default void openOsdStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenOsdStreamMethod(), responseObserver);
    }

    /**
     */
    default void openAisStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenAisStreamMethod(), responseObserver);
    }

    /**
     */
    default void openPngImageStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenPngImageStreamMethod(), responseObserver);
    }

    /**
     */
    default void openWamosStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenWamosStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SeaViewService.
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static abstract class SeaViewServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SeaViewServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SeaViewService.
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class SeaViewServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SeaViewServiceStub> {
    private SeaViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Calls
     * </pre>
     */
    public void shakeHands(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShakeHandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnectClient(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public void openNormalTracksStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenNormalTracksStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openOsdStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenOsdStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openAisStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenAisStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openPngImageStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenPngImageStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openWamosStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenWamosStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SeaViewService.
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class SeaViewServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SeaViewServiceBlockingStub> {
    private SeaViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Calls
     * </pre>
     */
    public com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse shakeHands(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShakeHandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse disconnectClient(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> openNormalTracksStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenNormalTracksStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> openOsdStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenOsdStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> openAisStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenAisStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> openPngImageStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenPngImageStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> openWamosStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenWamosStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SeaViewService.
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class SeaViewServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SeaViewServiceFutureStub> {
    private SeaViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> shakeHands(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShakeHandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> disconnectClient(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHAKE_HANDS = 0;
  private static final int METHODID_DISCONNECT_CLIENT = 1;
  private static final int METHODID_OPEN_NORMAL_TRACKS_STREAM = 2;
  private static final int METHODID_OPEN_OSD_STREAM = 3;
  private static final int METHODID_OPEN_AIS_STREAM = 4;
  private static final int METHODID_OPEN_PNG_IMAGE_STREAM = 5;
  private static final int METHODID_OPEN_WAMOS_STREAM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHAKE_HANDS:
          serviceImpl.shakeHands((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT_CLIENT:
          serviceImpl.disconnectClient((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>) responseObserver);
          break;
        case METHODID_OPEN_NORMAL_TRACKS_STREAM:
          serviceImpl.openNormalTracksStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>) responseObserver);
          break;
        case METHODID_OPEN_OSD_STREAM:
          serviceImpl.openOsdStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>) responseObserver);
          break;
        case METHODID_OPEN_AIS_STREAM:
          serviceImpl.openAisStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>) responseObserver);
          break;
        case METHODID_OPEN_PNG_IMAGE_STREAM:
          serviceImpl.openPngImageStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>) responseObserver);
          break;
        case METHODID_OPEN_WAMOS_STREAM:
          serviceImpl.openWamosStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getShakeHandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage,
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>(
                service, METHODID_SHAKE_HANDS)))
        .addMethod(
          getDisconnectClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage,
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>(
                service, METHODID_DISCONNECT_CLIENT)))
        .addMethod(
          getOpenNormalTracksStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
              com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>(
                service, METHODID_OPEN_NORMAL_TRACKS_STREAM)))
        .addMethod(
          getOpenOsdStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
              com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>(
                service, METHODID_OPEN_OSD_STREAM)))
        .addMethod(
          getOpenAisStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage,
              com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>(
                service, METHODID_OPEN_AIS_STREAM)))
        .addMethod(
          getOpenPngImageStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage,
              com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>(
                service, METHODID_OPEN_PNG_IMAGE_STREAM)))
        .addMethod(
          getOpenWamosStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage,
              com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage>(
                service, METHODID_OPEN_WAMOS_STREAM)))
        .build();
  }

  private static abstract class SeaViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeaViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SeaViewServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeaViewService");
    }
  }

  private static final class SeaViewServiceFileDescriptorSupplier
      extends SeaViewServiceBaseDescriptorSupplier {
    SeaViewServiceFileDescriptorSupplier() {}
  }

  private static final class SeaViewServiceMethodDescriptorSupplier
      extends SeaViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeaViewServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SeaViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeaViewServiceFileDescriptorSupplier())
              .addMethod(getShakeHandsMethod())
              .addMethod(getDisconnectClientMethod())
              .addMethod(getOpenNormalTracksStreamMethod())
              .addMethod(getOpenOsdStreamMethod())
              .addMethod(getOpenAisStreamMethod())
              .addMethod(getOpenPngImageStreamMethod())
              .addMethod(getOpenWamosStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
