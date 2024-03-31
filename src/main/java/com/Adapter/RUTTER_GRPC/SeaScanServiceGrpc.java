package com.Adapter.RUTTER_GRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;
 * / Service definition for connections comming from SeaScan
 * /
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: SeaScanService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SeaScanServiceGrpc {

  private SeaScanServiceGrpc() {}

  public static final String SERVICE_NAME = "S6Protocol.SeaScanService";

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
    if ((getShakeHandsMethod = SeaScanServiceGrpc.getShakeHandsMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getShakeHandsMethod = SeaScanServiceGrpc.getShakeHandsMethod) == null) {
          SeaScanServiceGrpc.getShakeHandsMethod = getShakeHandsMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShakeHands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("ShakeHands"))
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
    if ((getDisconnectClientMethod = SeaScanServiceGrpc.getDisconnectClientMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getDisconnectClientMethod = SeaScanServiceGrpc.getDisconnectClientMethod) == null) {
          SeaScanServiceGrpc.getDisconnectClientMethod = getDisconnectClientMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisconnectClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("DisconnectClient"))
              .build();
        }
      }
    }
    return getDisconnectClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage,
      com.google.protobuf.Empty> getOpenPngImageStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenPngImageStream",
      requestType = com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage,
      com.google.protobuf.Empty> getOpenPngImageStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage, com.google.protobuf.Empty> getOpenPngImageStreamMethod;
    if ((getOpenPngImageStreamMethod = SeaScanServiceGrpc.getOpenPngImageStreamMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getOpenPngImageStreamMethod = SeaScanServiceGrpc.getOpenPngImageStreamMethod) == null) {
          SeaScanServiceGrpc.getOpenPngImageStreamMethod = getOpenPngImageStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenPngImageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("OpenPngImageStream"))
              .build();
        }
      }
    }
    return getOpenPngImageStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage,
      com.google.protobuf.Empty> getOpenAisStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenAisStream",
      requestType = com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage,
      com.google.protobuf.Empty> getOpenAisStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage, com.google.protobuf.Empty> getOpenAisStreamMethod;
    if ((getOpenAisStreamMethod = SeaScanServiceGrpc.getOpenAisStreamMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getOpenAisStreamMethod = SeaScanServiceGrpc.getOpenAisStreamMethod) == null) {
          SeaScanServiceGrpc.getOpenAisStreamMethod = getOpenAisStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenAisStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("OpenAisStream"))
              .build();
        }
      }
    }
    return getOpenAisStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage,
      com.google.protobuf.Empty> getOpenNormalTracksStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenNormalTracksStream",
      requestType = com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage,
      com.google.protobuf.Empty> getOpenNormalTracksStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage, com.google.protobuf.Empty> getOpenNormalTracksStreamMethod;
    if ((getOpenNormalTracksStreamMethod = SeaScanServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getOpenNormalTracksStreamMethod = SeaScanServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
          SeaScanServiceGrpc.getOpenNormalTracksStreamMethod = getOpenNormalTracksStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenNormalTracksStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("OpenNormalTracksStream"))
              .build();
        }
      }
    }
    return getOpenNormalTracksStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage,
      com.google.protobuf.Empty> getOpenOsdStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenOsdStream",
      requestType = com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage,
      com.google.protobuf.Empty> getOpenOsdStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage, com.google.protobuf.Empty> getOpenOsdStreamMethod;
    if ((getOpenOsdStreamMethod = SeaScanServiceGrpc.getOpenOsdStreamMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getOpenOsdStreamMethod = SeaScanServiceGrpc.getOpenOsdStreamMethod) == null) {
          SeaScanServiceGrpc.getOpenOsdStreamMethod = getOpenOsdStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenOsdStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("OpenOsdStream"))
              .build();
        }
      }
    }
    return getOpenOsdStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage,
      com.google.protobuf.Empty> getOpenWamosStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenWamosStream",
      requestType = com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage,
      com.google.protobuf.Empty> getOpenWamosStreamMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage, com.google.protobuf.Empty> getOpenWamosStreamMethod;
    if ((getOpenWamosStreamMethod = SeaScanServiceGrpc.getOpenWamosStreamMethod) == null) {
      synchronized (SeaScanServiceGrpc.class) {
        if ((getOpenWamosStreamMethod = SeaScanServiceGrpc.getOpenWamosStreamMethod) == null) {
          SeaScanServiceGrpc.getOpenWamosStreamMethod = getOpenWamosStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWamosStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SeaScanServiceMethodDescriptorSupplier("OpenWamosStream"))
              .build();
        }
      }
    }
    return getOpenWamosStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeaScanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceStub>() {
        @java.lang.Override
        public SeaScanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaScanServiceStub(channel, callOptions);
        }
      };
    return SeaScanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeaScanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceBlockingStub>() {
        @java.lang.Override
        public SeaScanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaScanServiceBlockingStub(channel, callOptions);
        }
      };
    return SeaScanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeaScanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeaScanServiceFutureStub>() {
        @java.lang.Override
        public SeaScanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeaScanServiceFutureStub(channel, callOptions);
        }
      };
    return SeaScanServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;
   * / Service definition for connections comming from SeaScan
   * /
   * </pre>
   */
  public static abstract class SeaScanServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary Calls
     * </pre>
     */
    public void shakeHands(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShakeHandsMethod(), responseObserver);
    }

    /**
     */
    public void disconnectClient(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectClientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> openPngImageStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenPngImageStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> openAisStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenAisStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> openNormalTracksStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenNormalTracksStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> openOsdStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenOsdStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> openWamosStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenWamosStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShakeHandsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage,
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>(
                  this, METHODID_SHAKE_HANDS)))
          .addMethod(
            getDisconnectClientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage,
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>(
                  this, METHODID_DISCONNECT_CLIENT)))
          .addMethod(
            getOpenPngImageStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_PNG_IMAGE_STREAM)))
          .addMethod(
            getOpenAisStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_AIS_STREAM)))
          .addMethod(
            getOpenNormalTracksStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_NORMAL_TRACKS_STREAM)))
          .addMethod(
            getOpenOsdStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_OSD_STREAM)))
          .addMethod(
            getOpenWamosStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_WAMOS_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   *&#47;
   * / Service definition for connections comming from SeaScan
   * /
   * </pre>
   */
  public static final class SeaScanServiceStub extends io.grpc.stub.AbstractAsyncStub<SeaScanServiceStub> {
    private SeaScanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaScanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaScanServiceStub(channel, callOptions);
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
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> openPngImageStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOpenPngImageStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> openAisStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOpenAisStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> openNormalTracksStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOpenNormalTracksStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> openOsdStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOpenOsdStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> openWamosStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOpenWamosStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *&#47;
   * / Service definition for connections comming from SeaScan
   * /
   * </pre>
   */
  public static final class SeaScanServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SeaScanServiceBlockingStub> {
    private SeaScanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaScanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaScanServiceBlockingStub(channel, callOptions);
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
  }

  /**
   * <pre>
   *&#47;
   * / Service definition for connections comming from SeaScan
   * /
   * </pre>
   */
  public static final class SeaScanServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SeaScanServiceFutureStub> {
    private SeaScanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaScanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeaScanServiceFutureStub(channel, callOptions);
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
  private static final int METHODID_OPEN_PNG_IMAGE_STREAM = 2;
  private static final int METHODID_OPEN_AIS_STREAM = 3;
  private static final int METHODID_OPEN_NORMAL_TRACKS_STREAM = 4;
  private static final int METHODID_OPEN_OSD_STREAM = 5;
  private static final int METHODID_OPEN_WAMOS_STREAM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeaScanServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeaScanServiceImplBase serviceImpl, int methodId) {
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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_PNG_IMAGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openPngImageStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_OPEN_AIS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openAisStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_OPEN_NORMAL_TRACKS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openNormalTracksStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_OPEN_OSD_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openOsdStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_OPEN_WAMOS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openWamosStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SeaScanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeaScanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Adapter.RUTTER_GRPC.SeaScanServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeaScanService");
    }
  }

  private static final class SeaScanServiceFileDescriptorSupplier
      extends SeaScanServiceBaseDescriptorSupplier {
    SeaScanServiceFileDescriptorSupplier() {}
  }

  private static final class SeaScanServiceMethodDescriptorSupplier
      extends SeaScanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeaScanServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SeaScanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeaScanServiceFileDescriptorSupplier())
              .addMethod(getShakeHandsMethod())
              .addMethod(getDisconnectClientMethod())
              .addMethod(getOpenPngImageStreamMethod())
              .addMethod(getOpenAisStreamMethod())
              .addMethod(getOpenNormalTracksStreamMethod())
              .addMethod(getOpenOsdStreamMethod())
              .addMethod(getOpenWamosStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
