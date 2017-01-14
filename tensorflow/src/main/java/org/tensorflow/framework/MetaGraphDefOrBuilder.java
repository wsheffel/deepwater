// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.framework;

public interface MetaGraphDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MetaGraphDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   */
  boolean hasMetaInfoDef();
  /**
   * <code>optional .tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   */
  org.tensorflow.framework.MetaGraphDef.MetaInfoDef getMetaInfoDef();
  /**
   * <code>optional .tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   */
  org.tensorflow.framework.MetaGraphDef.MetaInfoDefOrBuilder getMetaInfoDefOrBuilder();

  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 2;</code>
   */
  boolean hasGraphDef();
  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 2;</code>
   */
  org.tensorflow.framework.GraphDef getGraphDef();
  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 2;</code>
   */
  org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder();

  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>optional .tensorflow.SaverDef saver_def = 3;</code>
   */
  boolean hasSaverDef();
  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>optional .tensorflow.SaverDef saver_def = 3;</code>
   */
  org.tensorflow.util.SaverDef getSaverDef();
  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>optional .tensorflow.SaverDef saver_def = 3;</code>
   */
  org.tensorflow.util.SaverDefOrBuilder getSaverDefOrBuilder();

  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  int getCollectionDefCount();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  boolean containsCollectionDef(
      java.lang.String key);
  /**
   * Use {@link #getCollectionDefMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.framework.CollectionDef>
  getCollectionDef();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.framework.CollectionDef>
  getCollectionDefMap();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */

  org.tensorflow.framework.CollectionDef getCollectionDefOrDefault(
      java.lang.String key,
      org.tensorflow.framework.CollectionDef defaultValue);
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */

  org.tensorflow.framework.CollectionDef getCollectionDefOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  int getSignatureDefCount();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  boolean containsSignatureDef(
      java.lang.String key);
  /**
   * Use {@link #getSignatureDefMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.framework.SignatureDef>
  getSignatureDef();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.framework.SignatureDef>
  getSignatureDefMap();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */

  org.tensorflow.framework.SignatureDef getSignatureDefOrDefault(
      java.lang.String key,
      org.tensorflow.framework.SignatureDef defaultValue);
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */

  org.tensorflow.framework.SignatureDef getSignatureDefOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  java.util.List<org.tensorflow.framework.AssetFileDef> 
      getAssetFileDefList();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  org.tensorflow.framework.AssetFileDef getAssetFileDef(int index);
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  int getAssetFileDefCount();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  java.util.List<? extends org.tensorflow.framework.AssetFileDefOrBuilder> 
      getAssetFileDefOrBuilderList();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  org.tensorflow.framework.AssetFileDefOrBuilder getAssetFileDefOrBuilder(
      int index);
}
