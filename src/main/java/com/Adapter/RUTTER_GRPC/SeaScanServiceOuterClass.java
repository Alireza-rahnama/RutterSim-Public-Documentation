// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaScanService.proto

package com.Adapter.RUTTER_GRPC;

public final class SeaScanServiceOuterClass {
  private SeaScanServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SeaScanService.proto\022\nS6Protocol\032\033goog" +
      "le/protobuf/empty.proto\032\026GrpcMessageType" +
      "s.proto\032\026DataMessageTypes.proto2\303\004\n\016SeaS" +
      "canService\022I\n\nShakeHands\022\034.S6Protocol.Ha" +
      "ndshakeMessage\032\035.S6Protocol.HandshakeRes" +
      "ponse\022]\n\020DisconnectClient\022#.S6Protocol.D" +
      "isconnectClientMessage\032$.S6Protocol.Disc" +
      "onnectClientResponse\022K\n\022OpenPngImageStre" +
      "am\022\033.S6Protocol.PngImageMessage\032\026.google" +
      ".protobuf.Empty(\001\022J\n\rOpenAisStream\022\037.S6P" +
      "rotocol.AisToSeaviewMessage\032\026.google.pro" +
      "tobuf.Empty(\001\022R\n\026OpenNormalTracksStream\022" +
      "\036.S6Protocol.EntityEventMessage\032\026.google" +
      ".protobuf.Empty(\001\022A\n\rOpenOsdStream\022\026.S6P" +
      "rotocol.OSDMessage\032\026.google.protobuf.Emp" +
      "ty(\001\022W\n\017OpenWamosStream\022*.S6Protocol.Wam" +
      "osToSeaViewContainerMessage\032\026.google.pro" +
      "tobuf.Empty(\001B\031\n\027com.Adapter.RUTTER_GRPC" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.Adapter.RUTTER_GRPC.GrpcMessageTypes.getDescriptor(),
          com.Adapter.RUTTER_GRPC.DataMessageTypes.getDescriptor(),
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.Adapter.RUTTER_GRPC.GrpcMessageTypes.getDescriptor();
    com.Adapter.RUTTER_GRPC.DataMessageTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}