// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupHeader83.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class GroupHeader83OuterClass {
  private GroupHeader83OuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupHeader83OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.GroupHeader83)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string MsgId = 1;</code>
     * @return The msgId.
     */
    java.lang.String getMsgId();
    /**
     * <code>string MsgId = 1;</code>
     * @return The bytes for msgId.
     */
    com.google.protobuf.ByteString
        getMsgIdBytes();

    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     * @return Whether the creDtTm field is set.
     */
    boolean hasCreDtTm();
    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     * @return The creDtTm.
     */
    com.google.protobuf.Timestamp getCreDtTm();
    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     */
    com.google.protobuf.TimestampOrBuilder getCreDtTmOrBuilder();

    /**
     * <pre>
     *repeated Authorisation1Choice Authstn = 3;
     * </pre>
     *
     * <code>string NbOfTxs = 4;</code>
     * @return The nbOfTxs.
     */
    java.lang.String getNbOfTxs();
    /**
     * <pre>
     *repeated Authorisation1Choice Authstn = 3;
     * </pre>
     *
     * <code>string NbOfTxs = 4;</code>
     * @return The bytes for nbOfTxs.
     */
    com.google.protobuf.ByteString
        getNbOfTxsBytes();

    /**
     * <pre>
     *PartyIdentification135 InitgPty = 6;
     *BranchAndFinancialInstitutionIdentification6  FwdgAgt = 7 ;
     * </pre>
     *
     * <code>int32 CtrlSum = 5;</code>
     * @return The ctrlSum.
     */
    int getCtrlSum();
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.GroupHeader83}
   */
  public static final class GroupHeader83 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.GroupHeader83)
      GroupHeader83OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupHeader83.newBuilder() to construct.
    private GroupHeader83(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupHeader83() {
      msgId_ = "";
      nbOfTxs_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupHeader83();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.class, com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.Builder.class);
    }

    private int bitField0_;
    public static final int MSGID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object msgId_ = "";
    /**
     * <code>string MsgId = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public java.lang.String getMsgId() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgId_ = s;
        return s;
      }
    }
    /**
     * <code>string MsgId = 1;</code>
     * @return The bytes for msgId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CREDTTM_FIELD_NUMBER = 2;
    private com.google.protobuf.Timestamp creDtTm_;
    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     * @return Whether the creDtTm field is set.
     */
    @java.lang.Override
    public boolean hasCreDtTm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     * @return The creDtTm.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getCreDtTm() {
      return creDtTm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : creDtTm_;
    }
    /**
     * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getCreDtTmOrBuilder() {
      return creDtTm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : creDtTm_;
    }

    public static final int NBOFTXS_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nbOfTxs_ = "";
    /**
     * <pre>
     *repeated Authorisation1Choice Authstn = 3;
     * </pre>
     *
     * <code>string NbOfTxs = 4;</code>
     * @return The nbOfTxs.
     */
    @java.lang.Override
    public java.lang.String getNbOfTxs() {
      java.lang.Object ref = nbOfTxs_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nbOfTxs_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *repeated Authorisation1Choice Authstn = 3;
     * </pre>
     *
     * <code>string NbOfTxs = 4;</code>
     * @return The bytes for nbOfTxs.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNbOfTxsBytes() {
      java.lang.Object ref = nbOfTxs_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nbOfTxs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CTRLSUM_FIELD_NUMBER = 5;
    private int ctrlSum_ = 0;
    /**
     * <pre>
     *PartyIdentification135 InitgPty = 6;
     *BranchAndFinancialInstitutionIdentification6  FwdgAgt = 7 ;
     * </pre>
     *
     * <code>int32 CtrlSum = 5;</code>
     * @return The ctrlSum.
     */
    @java.lang.Override
    public int getCtrlSum() {
      return ctrlSum_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msgId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msgId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(2, getCreDtTm());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nbOfTxs_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nbOfTxs_);
      }
      if (ctrlSum_ != 0) {
        output.writeInt32(5, ctrlSum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msgId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msgId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCreDtTm());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nbOfTxs_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nbOfTxs_);
      }
      if (ctrlSum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, ctrlSum_);
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
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 other = (com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83) obj;

      if (!getMsgId()
          .equals(other.getMsgId())) return false;
      if (hasCreDtTm() != other.hasCreDtTm()) return false;
      if (hasCreDtTm()) {
        if (!getCreDtTm()
            .equals(other.getCreDtTm())) return false;
      }
      if (!getNbOfTxs()
          .equals(other.getNbOfTxs())) return false;
      if (getCtrlSum()
          != other.getCtrlSum()) return false;
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
      hash = (37 * hash) + MSGID_FIELD_NUMBER;
      hash = (53 * hash) + getMsgId().hashCode();
      if (hasCreDtTm()) {
        hash = (37 * hash) + CREDTTM_FIELD_NUMBER;
        hash = (53 * hash) + getCreDtTm().hashCode();
      }
      hash = (37 * hash) + NBOFTXS_FIELD_NUMBER;
      hash = (53 * hash) + getNbOfTxs().hashCode();
      hash = (37 * hash) + CTRLSUM_FIELD_NUMBER;
      hash = (53 * hash) + getCtrlSum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 parseFrom(
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
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 prototype) {
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.GroupHeader83}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.GroupHeader83)
        com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.class, com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.newBuilder()
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
          getCreDtTmFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        msgId_ = "";
        creDtTm_ = null;
        if (creDtTmBuilder_ != null) {
          creDtTmBuilder_.dispose();
          creDtTmBuilder_ = null;
        }
        nbOfTxs_ = "";
        ctrlSum_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 build() {
        com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 buildPartial() {
        com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 result = new com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.msgId_ = msgId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.creDtTm_ = creDtTmBuilder_ == null
              ? creDtTm_
              : creDtTmBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.nbOfTxs_ = nbOfTxs_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ctrlSum_ = ctrlSum_;
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
        if (other instanceof com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 other) {
        if (other == com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83.getDefaultInstance()) return this;
        if (!other.getMsgId().isEmpty()) {
          msgId_ = other.msgId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasCreDtTm()) {
          mergeCreDtTm(other.getCreDtTm());
        }
        if (!other.getNbOfTxs().isEmpty()) {
          nbOfTxs_ = other.nbOfTxs_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.getCtrlSum() != 0) {
          setCtrlSum(other.getCtrlSum());
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
                msgId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getCreDtTmFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 34: {
                nbOfTxs_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
              case 40: {
                ctrlSum_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
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

      private java.lang.Object msgId_ = "";
      /**
       * <code>string MsgId = 1;</code>
       * @return The msgId.
       */
      public java.lang.String getMsgId() {
        java.lang.Object ref = msgId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msgId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string MsgId = 1;</code>
       * @return The bytes for msgId.
       */
      public com.google.protobuf.ByteString
          getMsgIdBytes() {
        java.lang.Object ref = msgId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string MsgId = 1;</code>
       * @param value The msgId to set.
       * @return This builder for chaining.
       */
      public Builder setMsgId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        msgId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string MsgId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsgId() {
        msgId_ = getDefaultInstance().getMsgId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string MsgId = 1;</code>
       * @param value The bytes for msgId to set.
       * @return This builder for chaining.
       */
      public Builder setMsgIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        msgId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp creDtTm_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> creDtTmBuilder_;
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       * @return Whether the creDtTm field is set.
       */
      public boolean hasCreDtTm() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       * @return The creDtTm.
       */
      public com.google.protobuf.Timestamp getCreDtTm() {
        if (creDtTmBuilder_ == null) {
          return creDtTm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : creDtTm_;
        } else {
          return creDtTmBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public Builder setCreDtTm(com.google.protobuf.Timestamp value) {
        if (creDtTmBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          creDtTm_ = value;
        } else {
          creDtTmBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public Builder setCreDtTm(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (creDtTmBuilder_ == null) {
          creDtTm_ = builderForValue.build();
        } else {
          creDtTmBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public Builder mergeCreDtTm(com.google.protobuf.Timestamp value) {
        if (creDtTmBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            creDtTm_ != null &&
            creDtTm_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getCreDtTmBuilder().mergeFrom(value);
          } else {
            creDtTm_ = value;
          }
        } else {
          creDtTmBuilder_.mergeFrom(value);
        }
        if (creDtTm_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public Builder clearCreDtTm() {
        bitField0_ = (bitField0_ & ~0x00000002);
        creDtTm_ = null;
        if (creDtTmBuilder_ != null) {
          creDtTmBuilder_.dispose();
          creDtTmBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public com.google.protobuf.Timestamp.Builder getCreDtTmBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCreDtTmFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getCreDtTmOrBuilder() {
        if (creDtTmBuilder_ != null) {
          return creDtTmBuilder_.getMessageOrBuilder();
        } else {
          return creDtTm_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : creDtTm_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp CreDtTm = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getCreDtTmFieldBuilder() {
        if (creDtTmBuilder_ == null) {
          creDtTmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getCreDtTm(),
                  getParentForChildren(),
                  isClean());
          creDtTm_ = null;
        }
        return creDtTmBuilder_;
      }

      private java.lang.Object nbOfTxs_ = "";
      /**
       * <pre>
       *repeated Authorisation1Choice Authstn = 3;
       * </pre>
       *
       * <code>string NbOfTxs = 4;</code>
       * @return The nbOfTxs.
       */
      public java.lang.String getNbOfTxs() {
        java.lang.Object ref = nbOfTxs_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nbOfTxs_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *repeated Authorisation1Choice Authstn = 3;
       * </pre>
       *
       * <code>string NbOfTxs = 4;</code>
       * @return The bytes for nbOfTxs.
       */
      public com.google.protobuf.ByteString
          getNbOfTxsBytes() {
        java.lang.Object ref = nbOfTxs_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nbOfTxs_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *repeated Authorisation1Choice Authstn = 3;
       * </pre>
       *
       * <code>string NbOfTxs = 4;</code>
       * @param value The nbOfTxs to set.
       * @return This builder for chaining.
       */
      public Builder setNbOfTxs(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nbOfTxs_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *repeated Authorisation1Choice Authstn = 3;
       * </pre>
       *
       * <code>string NbOfTxs = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNbOfTxs() {
        nbOfTxs_ = getDefaultInstance().getNbOfTxs();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *repeated Authorisation1Choice Authstn = 3;
       * </pre>
       *
       * <code>string NbOfTxs = 4;</code>
       * @param value The bytes for nbOfTxs to set.
       * @return This builder for chaining.
       */
      public Builder setNbOfTxsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nbOfTxs_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int ctrlSum_ ;
      /**
       * <pre>
       *PartyIdentification135 InitgPty = 6;
       *BranchAndFinancialInstitutionIdentification6  FwdgAgt = 7 ;
       * </pre>
       *
       * <code>int32 CtrlSum = 5;</code>
       * @return The ctrlSum.
       */
      @java.lang.Override
      public int getCtrlSum() {
        return ctrlSum_;
      }
      /**
       * <pre>
       *PartyIdentification135 InitgPty = 6;
       *BranchAndFinancialInstitutionIdentification6  FwdgAgt = 7 ;
       * </pre>
       *
       * <code>int32 CtrlSum = 5;</code>
       * @param value The ctrlSum to set.
       * @return This builder for chaining.
       */
      public Builder setCtrlSum(int value) {

        ctrlSum_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *PartyIdentification135 InitgPty = 6;
       *BranchAndFinancialInstitutionIdentification6  FwdgAgt = 7 ;
       * </pre>
       *
       * <code>int32 CtrlSum = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCtrlSum() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ctrlSum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.GroupHeader83)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.GroupHeader83)
    private static final com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83();
    }

    public static com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupHeader83>
        PARSER = new com.google.protobuf.AbstractParser<GroupHeader83>() {
      @java.lang.Override
      public GroupHeader83 parsePartialFrom(
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

    public static com.google.protobuf.Parser<GroupHeader83> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupHeader83> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.GroupHeader83OuterClass.GroupHeader83 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GroupHeader83.proto\022#com.bank.core.pro" +
      "to.pain_008_001_10\032\037google/protobuf/time" +
      "stamp.proto\"m\n\rGroupHeader83\022\r\n\005MsgId\030\001 " +
      "\001(\t\022+\n\007CreDtTm\030\002 \001(\0132\032.google.protobuf.T" +
      "imestamp\022\017\n\007NbOfTxs\030\004 \001(\t\022\017\n\007CtrlSum\030\005 \001" +
      "(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_GroupHeader83_descriptor,
        new java.lang.String[] { "MsgId", "CreDtTm", "NbOfTxs", "CtrlSum", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
