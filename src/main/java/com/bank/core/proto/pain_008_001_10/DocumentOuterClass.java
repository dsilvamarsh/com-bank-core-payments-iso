// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Document.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class DocumentOuterClass {
  private DocumentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DocumentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.Document)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     * @return Whether the cstmrDrctDbtInitn field is set.
     */
    boolean hasCstmrDrctDbtInitn();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     * @return The cstmrDrctDbtInitn.
     */
    com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 getCstmrDrctDbtInitn();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     */
    com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder getCstmrDrctDbtInitnOrBuilder();
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.Document}
   */
  public static final class Document extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.Document)
      DocumentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Document.newBuilder() to construct.
    private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Document() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Document();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.class, com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.Builder.class);
    }

    private int bitField0_;
    public static final int CSTMRDRCTDBTINITN_FIELD_NUMBER = 1;
    private com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn_;
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     * @return Whether the cstmrDrctDbtInitn field is set.
     */
    @java.lang.Override
    public boolean hasCstmrDrctDbtInitn() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     * @return The cstmrDrctDbtInitn.
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 getCstmrDrctDbtInitn() {
      return cstmrDrctDbtInitn_ == null ? com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.getDefaultInstance() : cstmrDrctDbtInitn_;
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder getCstmrDrctDbtInitnOrBuilder() {
      return cstmrDrctDbtInitn_ == null ? com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.getDefaultInstance() : cstmrDrctDbtInitn_;
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
        output.writeMessage(1, getCstmrDrctDbtInitn());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCstmrDrctDbtInitn());
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
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document other = (com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document) obj;

      if (hasCstmrDrctDbtInitn() != other.hasCstmrDrctDbtInitn()) return false;
      if (hasCstmrDrctDbtInitn()) {
        if (!getCstmrDrctDbtInitn()
            .equals(other.getCstmrDrctDbtInitn())) return false;
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
      if (hasCstmrDrctDbtInitn()) {
        hash = (37 * hash) + CSTMRDRCTDBTINITN_FIELD_NUMBER;
        hash = (53 * hash) + getCstmrDrctDbtInitn().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document parseFrom(
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
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document prototype) {
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.Document}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.Document)
        com.bank.core.proto.pain_008_001_10.DocumentOuterClass.DocumentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Document_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.class, com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.newBuilder()
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
          getCstmrDrctDbtInitnFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        cstmrDrctDbtInitn_ = null;
        if (cstmrDrctDbtInitnBuilder_ != null) {
          cstmrDrctDbtInitnBuilder_.dispose();
          cstmrDrctDbtInitnBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document build() {
        com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document buildPartial() {
        com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document result = new com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cstmrDrctDbtInitn_ = cstmrDrctDbtInitnBuilder_ == null
              ? cstmrDrctDbtInitn_
              : cstmrDrctDbtInitnBuilder_.build();
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
        if (other instanceof com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document other) {
        if (other == com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document.getDefaultInstance()) return this;
        if (other.hasCstmrDrctDbtInitn()) {
          mergeCstmrDrctDbtInitn(other.getCstmrDrctDbtInitn());
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
                input.readMessage(
                    getCstmrDrctDbtInitnFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.Builder, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder> cstmrDrctDbtInitnBuilder_;
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       * @return Whether the cstmrDrctDbtInitn field is set.
       */
      public boolean hasCstmrDrctDbtInitn() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       * @return The cstmrDrctDbtInitn.
       */
      public com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 getCstmrDrctDbtInitn() {
        if (cstmrDrctDbtInitnBuilder_ == null) {
          return cstmrDrctDbtInitn_ == null ? com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.getDefaultInstance() : cstmrDrctDbtInitn_;
        } else {
          return cstmrDrctDbtInitnBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public Builder setCstmrDrctDbtInitn(com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 value) {
        if (cstmrDrctDbtInitnBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cstmrDrctDbtInitn_ = value;
        } else {
          cstmrDrctDbtInitnBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public Builder setCstmrDrctDbtInitn(
          com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.Builder builderForValue) {
        if (cstmrDrctDbtInitnBuilder_ == null) {
          cstmrDrctDbtInitn_ = builderForValue.build();
        } else {
          cstmrDrctDbtInitnBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public Builder mergeCstmrDrctDbtInitn(com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10 value) {
        if (cstmrDrctDbtInitnBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            cstmrDrctDbtInitn_ != null &&
            cstmrDrctDbtInitn_ != com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.getDefaultInstance()) {
            getCstmrDrctDbtInitnBuilder().mergeFrom(value);
          } else {
            cstmrDrctDbtInitn_ = value;
          }
        } else {
          cstmrDrctDbtInitnBuilder_.mergeFrom(value);
        }
        if (cstmrDrctDbtInitn_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public Builder clearCstmrDrctDbtInitn() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cstmrDrctDbtInitn_ = null;
        if (cstmrDrctDbtInitnBuilder_ != null) {
          cstmrDrctDbtInitnBuilder_.dispose();
          cstmrDrctDbtInitnBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.Builder getCstmrDrctDbtInitnBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCstmrDrctDbtInitnFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      public com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder getCstmrDrctDbtInitnOrBuilder() {
        if (cstmrDrctDbtInitnBuilder_ != null) {
          return cstmrDrctDbtInitnBuilder_.getMessageOrBuilder();
        } else {
          return cstmrDrctDbtInitn_ == null ?
              com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.getDefaultInstance() : cstmrDrctDbtInitn_;
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10 cstmrDrctDbtInitn = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.Builder, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder> 
          getCstmrDrctDbtInitnFieldBuilder() {
        if (cstmrDrctDbtInitnBuilder_ == null) {
          cstmrDrctDbtInitnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10.Builder, com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.CustomerDirectDebitInitiationV10OrBuilder>(
                  getCstmrDrctDbtInitn(),
                  getParentForChildren(),
                  isClean());
          cstmrDrctDbtInitn_ = null;
        }
        return cstmrDrctDbtInitnBuilder_;
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


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.Document)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.Document)
    private static final com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document();
    }

    public static com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Document>
        PARSER = new com.google.protobuf.AbstractParser<Document>() {
      @java.lang.Override
      public Document parsePartialFrom(
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

    public static com.google.protobuf.Parser<Document> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Document> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.DocumentOuterClass.Document getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_Document_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Document.proto\022#com.bank.core.proto.pa" +
      "in_008_001_10\032&CustomerDirectDebitInitia" +
      "tionV10.proto\"l\n\010Document\022`\n\021cstmrDrctDb" +
      "tInitn\030\001 \001(\0132E.com.bank.core.proto.pain_" +
      "008_001_10.CustomerDirectDebitInitiation" +
      "V102z\n\007payment\022o\n\rcreatePayment\022-.com.ba" +
      "nk.core.proto.pain_008_001_10.Document\032-" +
      ".com.bank.core.proto.pain_008_001_10.Doc" +
      "ument\"\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.getDescriptor(),
        });
    internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_Document_descriptor,
        new java.lang.String[] { "CstmrDrctDbtInitn", });
    com.bank.core.proto.pain_008_001_10.CustomerDirectDebitInitiationV10OuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
