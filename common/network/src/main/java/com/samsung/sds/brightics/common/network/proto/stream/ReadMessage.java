// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package com.samsung.sds.brightics.common.network.proto.stream;

/**
 * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.stream.ReadMessage}
 */
public  final class ReadMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)
    ReadMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadMessage.newBuilder() to construct.
  private ReadMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadMessage() {
    user_ = "";
    key_ = "";
    delimiter_ = "";
    tempKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            user_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            delimiter_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            tempKey_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.stream.StreamProto.internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samsung.sds.brightics.common.network.proto.stream.StreamProto.internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.class, com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private volatile java.lang.Object user_;
  /**
   * <code>string user = 1;</code>
   */
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <code>string user = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 2;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIMITER_FIELD_NUMBER = 3;
  private volatile java.lang.Object delimiter_;
  /**
   * <code>string delimiter = 3;</code>
   */
  public java.lang.String getDelimiter() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delimiter_ = s;
      return s;
    }
  }
  /**
   * <code>string delimiter = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDelimiterBytes() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delimiter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPKEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object tempKey_;
  /**
   * <code>string tempKey = 4;</code>
   */
  public java.lang.String getTempKey() {
    java.lang.Object ref = tempKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tempKey_ = s;
      return s;
    }
  }
  /**
   * <code>string tempKey = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTempKeyBytes() {
    java.lang.Object ref = tempKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tempKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    if (!getDelimiterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, delimiter_);
    }
    if (!getTempKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tempKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    if (!getDelimiterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, delimiter_);
    }
    if (!getTempKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tempKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)) {
      return super.equals(obj);
    }
    com.samsung.sds.brightics.common.network.proto.stream.ReadMessage other = (com.samsung.sds.brightics.common.network.proto.stream.ReadMessage) obj;

    boolean result = true;
    result = result && getUser()
        .equals(other.getUser());
    result = result && getKey()
        .equals(other.getKey());
    result = result && getDelimiter()
        .equals(other.getDelimiter());
    result = result && getTempKey()
        .equals(other.getTempKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + DELIMITER_FIELD_NUMBER;
    hash = (53 * hash) + getDelimiter().hashCode();
    hash = (37 * hash) + TEMPKEY_FIELD_NUMBER;
    hash = (53 * hash) + getTempKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samsung.sds.brightics.common.network.proto.stream.ReadMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.stream.ReadMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)
      com.samsung.sds.brightics.common.network.proto.stream.ReadMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.stream.StreamProto.internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samsung.sds.brightics.common.network.proto.stream.StreamProto.internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.class, com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.Builder.class);
    }

    // Construct using com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      user_ = "";

      key_ = "";

      delimiter_ = "";

      tempKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samsung.sds.brightics.common.network.proto.stream.StreamProto.internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor;
    }

    public com.samsung.sds.brightics.common.network.proto.stream.ReadMessage getDefaultInstanceForType() {
      return com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.getDefaultInstance();
    }

    public com.samsung.sds.brightics.common.network.proto.stream.ReadMessage build() {
      com.samsung.sds.brightics.common.network.proto.stream.ReadMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.samsung.sds.brightics.common.network.proto.stream.ReadMessage buildPartial() {
      com.samsung.sds.brightics.common.network.proto.stream.ReadMessage result = new com.samsung.sds.brightics.common.network.proto.stream.ReadMessage(this);
      result.user_ = user_;
      result.key_ = key_;
      result.delimiter_ = delimiter_;
      result.tempKey_ = tempKey_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samsung.sds.brightics.common.network.proto.stream.ReadMessage) {
        return mergeFrom((com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samsung.sds.brightics.common.network.proto.stream.ReadMessage other) {
      if (other == com.samsung.sds.brightics.common.network.proto.stream.ReadMessage.getDefaultInstance()) return this;
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.getDelimiter().isEmpty()) {
        delimiter_ = other.delimiter_;
        onChanged();
      }
      if (!other.getTempKey().isEmpty()) {
        tempKey_ = other.tempKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.samsung.sds.brightics.common.network.proto.stream.ReadMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.samsung.sds.brightics.common.network.proto.stream.ReadMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object user_ = "";
    /**
     * <code>string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      user_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder clearUser() {
      
      user_ = getDefaultInstance().getUser();
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      user_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 2;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object delimiter_ = "";
    /**
     * <code>string delimiter = 3;</code>
     */
    public java.lang.String getDelimiter() {
      java.lang.Object ref = delimiter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delimiter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delimiter = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDelimiterBytes() {
      java.lang.Object ref = delimiter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delimiter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delimiter = 3;</code>
     */
    public Builder setDelimiter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      delimiter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string delimiter = 3;</code>
     */
    public Builder clearDelimiter() {
      
      delimiter_ = getDefaultInstance().getDelimiter();
      onChanged();
      return this;
    }
    /**
     * <code>string delimiter = 3;</code>
     */
    public Builder setDelimiterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      delimiter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tempKey_ = "";
    /**
     * <code>string tempKey = 4;</code>
     */
    public java.lang.String getTempKey() {
      java.lang.Object ref = tempKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tempKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tempKey = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTempKeyBytes() {
      java.lang.Object ref = tempKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tempKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tempKey = 4;</code>
     */
    public Builder setTempKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tempKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tempKey = 4;</code>
     */
    public Builder clearTempKey() {
      
      tempKey_ = getDefaultInstance().getTempKey();
      onChanged();
      return this;
    }
    /**
     * <code>string tempKey = 4;</code>
     */
    public Builder setTempKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tempKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)
  }

  // @@protoc_insertion_point(class_scope:com.samsung.sds.brightics.common.network.proto.stream.ReadMessage)
  private static final com.samsung.sds.brightics.common.network.proto.stream.ReadMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samsung.sds.brightics.common.network.proto.stream.ReadMessage();
  }

  public static com.samsung.sds.brightics.common.network.proto.stream.ReadMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReadMessage>() {
    public ReadMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadMessage> getParserForType() {
    return PARSER;
  }

  public com.samsung.sds.brightics.common.network.proto.stream.ReadMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

