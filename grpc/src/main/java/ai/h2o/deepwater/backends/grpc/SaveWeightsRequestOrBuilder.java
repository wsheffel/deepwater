// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

public interface SaveWeightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepwater.SaveWeightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .deepwater.BackendModel model = 1;</code>
   */
  boolean hasModel();
  /**
   * <code>optional .deepwater.BackendModel model = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.BackendModel getModel();
  /**
   * <code>optional .deepwater.BackendModel model = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder getModelOrBuilder();

  /**
   * <code>optional bytes path = 2;</code>
   */
  com.google.protobuf.ByteString getPath();
}
