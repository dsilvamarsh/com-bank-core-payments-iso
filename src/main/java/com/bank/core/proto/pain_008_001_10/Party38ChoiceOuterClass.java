// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/Party38Choice.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class Party38ChoiceOuterClass {
  private Party38ChoiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Party38ChoiceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.Party38Choice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     * @return Whether the orgId field is set.
     */
    boolean hasOrgId();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     * @return The orgId.
     */
    com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 getOrgId();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     */
    com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder getOrgIdOrBuilder();

    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     * @return Whether the prvtId field is set.
     */
    boolean hasPrvtId();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     * @return The prvtId.
     */
    com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getPrvtId();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     */
    com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder getPrvtIdOrBuilder();
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.Party38Choice}
   */
  public static final class Party38Choice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.Party38Choice)
      Party38ChoiceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Party38Choice.newBuilder() to construct.
    private Party38Choice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Party38Choice() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Party38Choice();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.class, com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.Builder.class);
    }

    private int bitField0_;
    public static final int ORGID_FIELD_NUMBER = 1;
    private com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 orgId_;
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     * @return Whether the orgId field is set.
     */
    @java.lang.Override
    public boolean hasOrgId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     * @return The orgId.
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 getOrgId() {
      return orgId_ == null ? com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.getDefaultInstance() : orgId_;
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder getOrgIdOrBuilder() {
      return orgId_ == null ? com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.getDefaultInstance() : orgId_;
    }

    public static final int PRVTID_FIELD_NUMBER = 2;
    private com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 prvtId_;
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     * @return Whether the prvtId field is set.
     */
    @java.lang.Override
    public boolean hasPrvtId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     * @return The prvtId.
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getPrvtId() {
      return prvtId_ == null ? com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance() : prvtId_;
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
     */
    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder getPrvtIdOrBuilder() {
      return prvtId_ == null ? com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance() : prvtId_;
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
        output.writeMessage(1, getOrgId());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getPrvtId());
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
          .computeMessageSize(1, getOrgId());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPrvtId());
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
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice other = (com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice) obj;

      if (hasOrgId() != other.hasOrgId()) return false;
      if (hasOrgId()) {
        if (!getOrgId()
            .equals(other.getOrgId())) return false;
      }
      if (hasPrvtId() != other.hasPrvtId()) return false;
      if (hasPrvtId()) {
        if (!getPrvtId()
            .equals(other.getPrvtId())) return false;
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
      if (hasOrgId()) {
        hash = (37 * hash) + ORGID_FIELD_NUMBER;
        hash = (53 * hash) + getOrgId().hashCode();
      }
      if (hasPrvtId()) {
        hash = (37 * hash) + PRVTID_FIELD_NUMBER;
        hash = (53 * hash) + getPrvtId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice parseFrom(
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
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice prototype) {
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.Party38Choice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.Party38Choice)
        com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38ChoiceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.class, com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.newBuilder()
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
          getOrgIdFieldBuilder();
          getPrvtIdFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        orgId_ = null;
        if (orgIdBuilder_ != null) {
          orgIdBuilder_.dispose();
          orgIdBuilder_ = null;
        }
        prvtId_ = null;
        if (prvtIdBuilder_ != null) {
          prvtIdBuilder_.dispose();
          prvtIdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice build() {
        com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice buildPartial() {
        com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice result = new com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.orgId_ = orgIdBuilder_ == null
              ? orgId_
              : orgIdBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.prvtId_ = prvtIdBuilder_ == null
              ? prvtId_
              : prvtIdBuilder_.build();
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice other) {
        if (other == com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice.getDefaultInstance()) return this;
        if (other.hasOrgId()) {
          mergeOrgId(other.getOrgId());
        }
        if (other.hasPrvtId()) {
          mergePrvtId(other.getPrvtId());
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
                    getOrgIdFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getPrvtIdFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 orgId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.Builder, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder> orgIdBuilder_;
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       * @return Whether the orgId field is set.
       */
      public boolean hasOrgId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       * @return The orgId.
       */
      public com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 getOrgId() {
        if (orgIdBuilder_ == null) {
          return orgId_ == null ? com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.getDefaultInstance() : orgId_;
        } else {
          return orgIdBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public Builder setOrgId(com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 value) {
        if (orgIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          orgId_ = value;
        } else {
          orgIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public Builder setOrgId(
          com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.Builder builderForValue) {
        if (orgIdBuilder_ == null) {
          orgId_ = builderForValue.build();
        } else {
          orgIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public Builder mergeOrgId(com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29 value) {
        if (orgIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            orgId_ != null &&
            orgId_ != com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.getDefaultInstance()) {
            getOrgIdBuilder().mergeFrom(value);
          } else {
            orgId_ = value;
          }
        } else {
          orgIdBuilder_.mergeFrom(value);
        }
        if (orgId_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public Builder clearOrgId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        orgId_ = null;
        if (orgIdBuilder_ != null) {
          orgIdBuilder_.dispose();
          orgIdBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.Builder getOrgIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getOrgIdFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      public com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder getOrgIdOrBuilder() {
        if (orgIdBuilder_ != null) {
          return orgIdBuilder_.getMessageOrBuilder();
        } else {
          return orgId_ == null ?
              com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.getDefaultInstance() : orgId_;
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.OrganisationIdentification29 OrgId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.Builder, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder> 
          getOrgIdFieldBuilder() {
        if (orgIdBuilder_ == null) {
          orgIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29.Builder, com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.OrganisationIdentification29OrBuilder>(
                  getOrgId(),
                  getParentForChildren(),
                  isClean());
          orgId_ = null;
        }
        return orgIdBuilder_;
      }

      private com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 prvtId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder> prvtIdBuilder_;
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       * @return Whether the prvtId field is set.
       */
      public boolean hasPrvtId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       * @return The prvtId.
       */
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getPrvtId() {
        if (prvtIdBuilder_ == null) {
          return prvtId_ == null ? com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance() : prvtId_;
        } else {
          return prvtIdBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public Builder setPrvtId(com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 value) {
        if (prvtIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          prvtId_ = value;
        } else {
          prvtIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public Builder setPrvtId(
          com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder builderForValue) {
        if (prvtIdBuilder_ == null) {
          prvtId_ = builderForValue.build();
        } else {
          prvtIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public Builder mergePrvtId(com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 value) {
        if (prvtIdBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            prvtId_ != null &&
            prvtId_ != com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance()) {
            getPrvtIdBuilder().mergeFrom(value);
          } else {
            prvtId_ = value;
          }
        } else {
          prvtIdBuilder_.mergeFrom(value);
        }
        if (prvtId_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public Builder clearPrvtId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        prvtId_ = null;
        if (prvtIdBuilder_ != null) {
          prvtIdBuilder_.dispose();
          prvtIdBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder getPrvtIdBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPrvtIdFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder getPrvtIdOrBuilder() {
        if (prvtIdBuilder_ != null) {
          return prvtIdBuilder_.getMessageOrBuilder();
        } else {
          return prvtId_ == null ?
              com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance() : prvtId_;
        }
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.PersonIdentification13 PrvtId = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder> 
          getPrvtIdFieldBuilder() {
        if (prvtIdBuilder_ == null) {
          prvtIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder>(
                  getPrvtId(),
                  getParentForChildren(),
                  isClean());
          prvtId_ = null;
        }
        return prvtIdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.Party38Choice)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.Party38Choice)
    private static final com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice();
    }

    public static com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Party38Choice>
        PARSER = new com.google.protobuf.AbstractParser<Party38Choice>() {
      @java.lang.Override
      public Party38Choice parsePartialFrom(
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

    public static com.google.protobuf.Parser<Party38Choice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Party38Choice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.Party38ChoiceOuterClass.Party38Choice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proto/Party38Choice.proto\022#com.bank.co" +
      "re.proto.pain_008_001_10\032(proto/Organisa" +
      "tionIdentification29.proto\032\"proto/Person" +
      "Identification13.proto\"\256\001\n\rParty38Choice" +
      "\022P\n\005OrgId\030\001 \001(\0132A.com.bank.core.proto.pa" +
      "in_008_001_10.OrganisationIdentification" +
      "29\022K\n\006PrvtId\030\002 \001(\0132;.com.bank.core.proto" +
      ".pain_008_001_10.PersonIdentification13b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.getDescriptor(),
          com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.getDescriptor(),
        });
    internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_Party38Choice_descriptor,
        new java.lang.String[] { "OrgId", "PrvtId", });
    com.bank.core.proto.pain_008_001_10.OrganisationIdentification29OuterClass.getDescriptor();
    com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
