// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemittanceLocation7.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class RemittanceLocation7OuterClass {
  private RemittanceLocation7OuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RemittanceLocation7OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.RemittanceLocation7)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return Whether the rmtId field is set.
     */
    boolean hasRmtId();
    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return The rmtId.
     */
    java.lang.String getRmtId();
    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return The bytes for rmtId.
     */
    com.google.protobuf.ByteString
        getRmtIdBytes();
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.RemittanceLocation7}
   */
  public static final class RemittanceLocation7 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.RemittanceLocation7)
      RemittanceLocation7OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemittanceLocation7.newBuilder() to construct.
    private RemittanceLocation7(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemittanceLocation7() {
      rmtId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RemittanceLocation7();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.class, com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.Builder.class);
    }

    private int bitField0_;
    public static final int RMTID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object rmtId_ = "";
    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return Whether the rmtId field is set.
     */
    @java.lang.Override
    public boolean hasRmtId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return The rmtId.
     */
    @java.lang.Override
    public java.lang.String getRmtId() {
      java.lang.Object ref = rmtId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rmtId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *repeated RemittanceLocationData1 RmtLctnDtls;
     * </pre>
     *
     * <code>optional string RmtId = 1;</code>
     * @return The bytes for rmtId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRmtIdBytes() {
      java.lang.Object ref = rmtId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rmtId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rmtId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rmtId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 other = (com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7) obj;

      if (hasRmtId() != other.hasRmtId()) return false;
      if (hasRmtId()) {
        if (!getRmtId()
            .equals(other.getRmtId())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRmtId()) {
        hash = (37 * hash) + RMTID_FIELD_NUMBER;
        hash = (53 * hash) + getRmtId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.RemittanceLocation7}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.RemittanceLocation7)
        com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.class, com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        rmtId_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 build() {
        com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 buildPartial() {
        com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 result = new com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.rmtId_ = rmtId_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 other) {
        if (other == com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7.getDefaultInstance()) return this;
        if (other.hasRmtId()) {
          rmtId_ = other.rmtId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                rmtId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object rmtId_ = "";
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @return Whether the rmtId field is set.
       */
      public boolean hasRmtId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @return The rmtId.
       */
      public java.lang.String getRmtId() {
        java.lang.Object ref = rmtId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          rmtId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @return The bytes for rmtId.
       */
      public com.google.protobuf.ByteString
          getRmtIdBytes() {
        java.lang.Object ref = rmtId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rmtId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @param value The rmtId to set.
       * @return This builder for chaining.
       */
      public Builder setRmtId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        rmtId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRmtId() {
        rmtId_ = getDefaultInstance().getRmtId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *repeated RemittanceLocationData1 RmtLctnDtls;
       * </pre>
       *
       * <code>optional string RmtId = 1;</code>
       * @param value The bytes for rmtId to set.
       * @return This builder for chaining.
       */
      public Builder setRmtIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        rmtId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.RemittanceLocation7)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.RemittanceLocation7)
    private static final com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7();
    }

    public static com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RemittanceLocation7>
        PARSER = new com.google.protobuf.AbstractParser<RemittanceLocation7>() {
      @java.lang.Override
      public RemittanceLocation7 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<RemittanceLocation7> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RemittanceLocation7> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.RemittanceLocation7OuterClass.RemittanceLocation7 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RemittanceLocation7.proto\022#com.bank.co" +
      "re.proto.pain_008_001_10\"3\n\023RemittanceLo" +
      "cation7\022\022\n\005RmtId\030\001 \001(\tH\000\210\001\001B\010\n\006_RmtIdb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_RemittanceLocation7_descriptor,
        new java.lang.String[] { "RmtId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
