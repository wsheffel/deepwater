// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

public interface LoadWeightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepwater.LoadWeightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  boolean hasSession();
  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.Session getSession();
  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.SessionOrBuilder getSessionOrBuilder();

  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  boolean hasModel();
  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  ai.h2o.deepwater.backends.grpc.BackendModel getModel();
  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder getModelOrBuilder();

  /**
   * <code>optional bytes path = 3;</code>
   */
  com.google.protobuf.ByteString getPath();
}
