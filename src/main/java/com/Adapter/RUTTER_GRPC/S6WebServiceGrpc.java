package com.Adapter.RUTTER_GRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition for the gRPC connection
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: S6WebService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class S6WebServiceGrpc {

  private S6WebServiceGrpc() {}

  public static final String SERVICE_NAME = "S6Protocol.S6WebService";

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
    if ((getShakeHandsMethod = S6WebServiceGrpc.getShakeHandsMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getShakeHandsMethod = S6WebServiceGrpc.getShakeHandsMethod) == null) {
          S6WebServiceGrpc.getShakeHandsMethod = getShakeHandsMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShakeHands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.HandshakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("ShakeHands"))
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
    if ((getDisconnectClientMethod = S6WebServiceGrpc.getDisconnectClientMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getDisconnectClientMethod = S6WebServiceGrpc.getDisconnectClientMethod) == null) {
          S6WebServiceGrpc.getDisconnectClientMethod = getDisconnectClientMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage, com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisconnectClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.DisconnectClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("DisconnectClient"))
              .build();
        }
      }
    }
    return getDisconnectClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> getGetCurrentConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentConnections",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> getGetCurrentConnectionsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> getGetCurrentConnectionsMethod;
    if ((getGetCurrentConnectionsMethod = S6WebServiceGrpc.getGetCurrentConnectionsMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getGetCurrentConnectionsMethod = S6WebServiceGrpc.getGetCurrentConnectionsMethod) == null) {
          S6WebServiceGrpc.getGetCurrentConnectionsMethod = getGetCurrentConnectionsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("GetCurrentConnections"))
              .build();
        }
      }
    }
    return getGetCurrentConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage,
      com.google.protobuf.Empty> getForceUserToDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForceUserToDisconnect",
      requestType = com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage,
      com.google.protobuf.Empty> getForceUserToDisconnectMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage, com.google.protobuf.Empty> getForceUserToDisconnectMethod;
    if ((getForceUserToDisconnectMethod = S6WebServiceGrpc.getForceUserToDisconnectMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getForceUserToDisconnectMethod = S6WebServiceGrpc.getForceUserToDisconnectMethod) == null) {
          S6WebServiceGrpc.getForceUserToDisconnectMethod = getForceUserToDisconnectMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForceUserToDisconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("ForceUserToDisconnect"))
              .build();
        }
      }
    }
    return getForceUserToDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage,
      com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> getUpdateS6NodeProductKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateS6NodeProductKey",
      requestType = com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage.class,
      responseType = com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage,
      com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> getUpdateS6NodeProductKeyMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage, com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> getUpdateS6NodeProductKeyMethod;
    if ((getUpdateS6NodeProductKeyMethod = S6WebServiceGrpc.getUpdateS6NodeProductKeyMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getUpdateS6NodeProductKeyMethod = S6WebServiceGrpc.getUpdateS6NodeProductKeyMethod) == null) {
          S6WebServiceGrpc.getUpdateS6NodeProductKeyMethod = getUpdateS6NodeProductKeyMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage, com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateS6NodeProductKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("UpdateS6NodeProductKey"))
              .build();
        }
      }
    }
    return getUpdateS6NodeProductKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage,
      com.google.protobuf.Empty> getUpdateMapBoundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMapBounds",
      requestType = com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage,
      com.google.protobuf.Empty> getUpdateMapBoundsMethod() {
    io.grpc.MethodDescriptor<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage, com.google.protobuf.Empty> getUpdateMapBoundsMethod;
    if ((getUpdateMapBoundsMethod = S6WebServiceGrpc.getUpdateMapBoundsMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getUpdateMapBoundsMethod = S6WebServiceGrpc.getUpdateMapBoundsMethod) == null) {
          S6WebServiceGrpc.getUpdateMapBoundsMethod = getUpdateMapBoundsMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMapBounds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("UpdateMapBounds"))
              .build();
        }
      }
    }
    return getUpdateMapBoundsMethod;
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
    if ((getOpenPngImageStreamMethod = S6WebServiceGrpc.getOpenPngImageStreamMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getOpenPngImageStreamMethod = S6WebServiceGrpc.getOpenPngImageStreamMethod) == null) {
          S6WebServiceGrpc.getOpenPngImageStreamMethod = getOpenPngImageStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenPngImageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("OpenPngImageStream"))
              .build();
        }
      }
    }
    return getOpenPngImageStreamMethod;
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
    if ((getOpenAisStreamMethod = S6WebServiceGrpc.getOpenAisStreamMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getOpenAisStreamMethod = S6WebServiceGrpc.getOpenAisStreamMethod) == null) {
          S6WebServiceGrpc.getOpenAisStreamMethod = getOpenAisStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenAisStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("OpenAisStream"))
              .build();
        }
      }
    }
    return getOpenAisStreamMethod;
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
    if ((getOpenNormalTracksStreamMethod = S6WebServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getOpenNormalTracksStreamMethod = S6WebServiceGrpc.getOpenNormalTracksStreamMethod) == null) {
          S6WebServiceGrpc.getOpenNormalTracksStreamMethod = getOpenNormalTracksStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenNormalTracksStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("OpenNormalTracksStream"))
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
    if ((getOpenOsdStreamMethod = S6WebServiceGrpc.getOpenOsdStreamMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getOpenOsdStreamMethod = S6WebServiceGrpc.getOpenOsdStreamMethod) == null) {
          S6WebServiceGrpc.getOpenOsdStreamMethod = getOpenOsdStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenOsdStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("OpenOsdStream"))
              .build();
        }
      }
    }
    return getOpenOsdStreamMethod;
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
    if ((getOpenWamosStreamMethod = S6WebServiceGrpc.getOpenWamosStreamMethod) == null) {
      synchronized (S6WebServiceGrpc.class) {
        if ((getOpenWamosStreamMethod = S6WebServiceGrpc.getOpenWamosStreamMethod) == null) {
          S6WebServiceGrpc.getOpenWamosStreamMethod = getOpenWamosStreamMethod =
              io.grpc.MethodDescriptor.<com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage, com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWamosStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage.getDefaultInstance()))
              .setSchemaDescriptor(new S6WebServiceMethodDescriptorSupplier("OpenWamosStream"))
              .build();
        }
      }
    }
    return getOpenWamosStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static S6WebServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S6WebServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S6WebServiceStub>() {
        @java.lang.Override
        public S6WebServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S6WebServiceStub(channel, callOptions);
        }
      };
    return S6WebServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static S6WebServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S6WebServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S6WebServiceBlockingStub>() {
        @java.lang.Override
        public S6WebServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S6WebServiceBlockingStub(channel, callOptions);
        }
      };
    return S6WebServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static S6WebServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S6WebServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S6WebServiceFutureStub>() {
        @java.lang.Override
        public S6WebServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S6WebServiceFutureStub(channel, callOptions);
        }
      };
    return S6WebServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static abstract class S6WebServiceImplBase implements io.grpc.BindableService {

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
     */
    public void getCurrentConnections(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentConnectionsMethod(), responseObserver);
    }

    /**
     */
    public void forceUserToDisconnect(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForceUserToDisconnectMethod(), responseObserver);
    }

    /**
     */
    public void updateS6NodeProductKey(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateS6NodeProductKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public void updateMapBounds(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMapBoundsMethod(), responseObserver);
    }

    /**
     */
    public void openPngImageStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenPngImageStreamMethod(), responseObserver);
    }

    /**
     */
    public void openAisStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenAisStreamMethod(), responseObserver);
    }

    /**
     */
    public void openNormalTracksStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenNormalTracksStreamMethod(), responseObserver);
    }

    /**
     */
    public void openOsdStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenOsdStreamMethod(), responseObserver);
    }

    /**
     */
    public void openWamosStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenWamosStreamMethod(), responseObserver);
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
            getGetCurrentConnectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage>(
                  this, METHODID_GET_CURRENT_CONNECTIONS)))
          .addMethod(
            getForceUserToDisconnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_FORCE_USER_TO_DISCONNECT)))
          .addMethod(
            getUpdateS6NodeProductKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage,
                com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage>(
                  this, METHODID_UPDATE_S6NODE_PRODUCT_KEY)))
          .addMethod(
            getUpdateMapBoundsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_MAP_BOUNDS)))
          .addMethod(
            getOpenPngImageStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage,
                com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>(
                  this, METHODID_OPEN_PNG_IMAGE_STREAM)))
          .addMethod(
            getOpenAisStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage,
                com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>(
                  this, METHODID_OPEN_AIS_STREAM)))
          .addMethod(
            getOpenNormalTracksStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
                com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>(
                  this, METHODID_OPEN_NORMAL_TRACKS_STREAM)))
          .addMethod(
            getOpenOsdStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage,
                com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>(
                  this, METHODID_OPEN_OSD_STREAM)))
          .addMethod(
            getOpenWamosStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage,
                com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage>(
                  this, METHODID_OPEN_WAMOS_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class S6WebServiceStub extends io.grpc.stub.AbstractAsyncStub<S6WebServiceStub> {
    private S6WebServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S6WebServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S6WebServiceStub(channel, callOptions);
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
     */
    public void getCurrentConnections(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forceUserToDisconnect(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForceUserToDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateS6NodeProductKey(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateS6NodeProductKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public void updateMapBounds(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMapBoundsMethod(), getCallOptions()), request, responseObserver);
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
    public void openAisStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenAisStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
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
    public void openWamosStream(com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request,
        io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenWamosStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class S6WebServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<S6WebServiceBlockingStub> {
    private S6WebServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S6WebServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S6WebServiceBlockingStub(channel, callOptions);
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
     */
    public com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage getCurrentConnections(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty forceUserToDisconnect(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForceUserToDisconnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage updateS6NodeProductKey(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateS6NodeProductKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public com.google.protobuf.Empty updateMapBounds(com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMapBoundsMethod(), getCallOptions(), request);
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
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage> openAisStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenAisStreamMethod(), getCallOptions(), request);
    }

    /**
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
    public java.util.Iterator<com.Adapter.RUTTER_GRPC.DataMessageTypes.WamosToSeaViewContainerMessage> openWamosStream(
        com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenWamosStreamMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenWamosStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition for the gRPC connection
   * </pre>
   */
  public static final class S6WebServiceFutureStub extends io.grpc.stub.AbstractFutureStub<S6WebServiceFutureStub> {
    private S6WebServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S6WebServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S6WebServiceFutureStub(channel, callOptions);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage> getCurrentConnections(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> forceUserToDisconnect(
        com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForceUserToDisconnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage> updateS6NodeProductKey(
        com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateS6NodeProductKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Host to Client Streams
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateMapBounds(
        com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMapBoundsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHAKE_HANDS = 0;
  private static final int METHODID_DISCONNECT_CLIENT = 1;
  private static final int METHODID_GET_CURRENT_CONNECTIONS = 2;
  private static final int METHODID_FORCE_USER_TO_DISCONNECT = 3;
  private static final int METHODID_UPDATE_S6NODE_PRODUCT_KEY = 4;
  private static final int METHODID_UPDATE_MAP_BOUNDS = 5;
  private static final int METHODID_OPEN_PNG_IMAGE_STREAM = 6;
  private static final int METHODID_OPEN_AIS_STREAM = 7;
  private static final int METHODID_OPEN_NORMAL_TRACKS_STREAM = 8;
  private static final int METHODID_OPEN_OSD_STREAM = 9;
  private static final int METHODID_OPEN_WAMOS_STREAM = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final S6WebServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(S6WebServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_GET_CURRENT_CONNECTIONS:
          serviceImpl.getCurrentConnections((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.CurrentConnectionsMessage>) responseObserver);
          break;
        case METHODID_FORCE_USER_TO_DISCONNECT:
          serviceImpl.forceUserToDisconnect((com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ConnectionDetailsMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_S6NODE_PRODUCT_KEY:
          serviceImpl.updateS6NodeProductKey((com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.ProductKeyUpdateResultMessage>) responseObserver);
          break;
        case METHODID_UPDATE_MAP_BOUNDS:
          serviceImpl.updateMapBounds((com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.MapBoundsMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_OPEN_PNG_IMAGE_STREAM:
          serviceImpl.openPngImageStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenImageStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.PngImageMessage>) responseObserver);
          break;
        case METHODID_OPEN_AIS_STREAM:
          serviceImpl.openAisStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenAisStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.AisToSeaviewMessage>) responseObserver);
          break;
        case METHODID_OPEN_NORMAL_TRACKS_STREAM:
          serviceImpl.openNormalTracksStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.EntityEventMessage>) responseObserver);
          break;
        case METHODID_OPEN_OSD_STREAM:
          serviceImpl.openOsdStream((com.Adapter.RUTTER_GRPC.GrpcMessageTypes.OpenEntityStreamMessage) request,
              (io.grpc.stub.StreamObserver<com.Adapter.RUTTER_GRPC.DataMessageTypes.OSDMessage>) responseObserver);
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

  private static abstract class S6WebServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    S6WebServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Adapter.RUTTER_GRPC.S6WebServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("S6WebService");
    }
  }

  private static final class S6WebServiceFileDescriptorSupplier
      extends S6WebServiceBaseDescriptorSupplier {
    S6WebServiceFileDescriptorSupplier() {}
  }

  private static final class S6WebServiceMethodDescriptorSupplier
      extends S6WebServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    S6WebServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (S6WebServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new S6WebServiceFileDescriptorSupplier())
              .addMethod(getShakeHandsMethod())
              .addMethod(getDisconnectClientMethod())
              .addMethod(getGetCurrentConnectionsMethod())
              .addMethod(getForceUserToDisconnectMethod())
              .addMethod(getUpdateS6NodeProductKeyMethod())
              .addMethod(getUpdateMapBoundsMethod())
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
