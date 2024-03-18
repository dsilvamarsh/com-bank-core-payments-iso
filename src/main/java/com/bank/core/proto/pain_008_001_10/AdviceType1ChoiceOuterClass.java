// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdviceType1Choice.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class AdviceType1ChoiceOuterClass {
  private AdviceType1ChoiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.bank.core.proto.pain_008_001_10.AdviceType1Code}
   */
  public enum AdviceType1Code
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ADWD = 0;</code>
     */
    ADWD(0),
    /**
     * <code>ADND = 1;</code>
     */
    ADND(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ADWD = 0;</code>
     */
    public static final int ADWD_VALUE = 0;
    /**
     * <code>ADND = 1;</code>
     */
    public static final int ADND_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AdviceType1Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdviceType1Code forNumber(int value) {
      switch (value) {
        case 0: return ADWD;
        case 1: return ADND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdviceType1Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdviceType1Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdviceType1Code>() {
            public AdviceType1Code findValueByNumber(int number) {
              return AdviceType1Code.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdviceType1Code[] VALUES = values();

    public static AdviceType1Code valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AdviceType1Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.bank.core.proto.pain_008_001_10.AdviceType1Code)
  }

  public interface AdviceType1ChoiceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.AdviceType1Choice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
     * @return The enum numeric value on the wire for cd.
     */
    int getCdValue();
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
     * @return The cd.
     */
    com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code getCd();

    /**
     * <code>string Prtry = 2;</code>
     * @return The prtry.
     */
    java.lang.String getPrtry();
    /**
     * <code>string Prtry = 2;</code>
     * @return The bytes for prtry.
     */
    com.google.protobuf.ByteString
        getPrtryBytes();
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.AdviceType1Choice}
   */
  public static final class AdviceType1Choice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.AdviceType1Choice)
      AdviceType1ChoiceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AdviceType1Choice.newBuilder() to construct.
    private AdviceType1Choice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AdviceType1Choice() {
      cd_ = 0;
      prtry_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AdviceType1Choice();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.class, com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.Builder.class);
    }

    public static final int CD_FIELD_NUMBER = 1;
    private int cd_ = 0;
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
     * @return The enum numeric value on the wire for cd.
     */
    @java.lang.Override public int getCdValue() {
      return cd_;
    }
    /**
     * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
     * @return The cd.
     */
    @java.lang.Override public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code getCd() {
      com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code result = com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.forNumber(cd_);
      return result == null ? com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.UNRECOGNIZED : result;
    }

    public static final int PRTRY_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object prtry_ = "";
    /**
     * <code>string Prtry = 2;</code>
     * @return The prtry.
     */
    @java.lang.Override
    public java.lang.String getPrtry() {
      java.lang.Object ref = prtry_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prtry_ = s;
        return s;
      }
    }
    /**
     * <code>string Prtry = 2;</code>
     * @return The bytes for prtry.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPrtryBytes() {
      java.lang.Object ref = prtry_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prtry_ = b;
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
      if (cd_ != com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.ADWD.getNumber()) {
        output.writeEnum(1, cd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prtry_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prtry_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cd_ != com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.ADWD.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, cd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prtry_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prtry_);
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
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice other = (com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice) obj;

      if (cd_ != other.cd_) return false;
      if (!getPrtry()
          .equals(other.getPrtry())) return false;
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
      hash = (37 * hash) + CD_FIELD_NUMBER;
      hash = (53 * hash) + cd_;
      hash = (37 * hash) + PRTRY_FIELD_NUMBER;
      hash = (53 * hash) + getPrtry().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice parseFrom(
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
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice prototype) {
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.AdviceType1Choice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.AdviceType1Choice)
        com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1ChoiceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.class, com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.newBuilder()
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
        cd_ = 0;
        prtry_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice build() {
        com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice buildPartial() {
        com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice result = new com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cd_ = cd_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.prtry_ = prtry_;
        }
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
        if (other instanceof com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice other) {
        if (other == com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice.getDefaultInstance()) return this;
        if (other.cd_ != 0) {
          setCdValue(other.getCdValue());
        }
        if (!other.getPrtry().isEmpty()) {
          prtry_ = other.prtry_;
          bitField0_ |= 0x00000002;
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
              case 8: {
                cd_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                prtry_ = input.readStringRequireUtf8();
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

      private int cd_ = 0;
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
       * @return The enum numeric value on the wire for cd.
       */
      @java.lang.Override public int getCdValue() {
        return cd_;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
       * @param value The enum numeric value on the wire for cd to set.
       * @return This builder for chaining.
       */
      public Builder setCdValue(int value) {
        cd_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
       * @return The cd.
       */
      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code getCd() {
        com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code result = com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.forNumber(cd_);
        return result == null ? com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code.UNRECOGNIZED : result;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
       * @param value The cd to set.
       * @return This builder for chaining.
       */
      public Builder setCd(com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Code value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        cd_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.com.bank.core.proto.pain_008_001_10.AdviceType1Code Cd = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCd() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cd_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object prtry_ = "";
      /**
       * <code>string Prtry = 2;</code>
       * @return The prtry.
       */
      public java.lang.String getPrtry() {
        java.lang.Object ref = prtry_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          prtry_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Prtry = 2;</code>
       * @return The bytes for prtry.
       */
      public com.google.protobuf.ByteString
          getPrtryBytes() {
        java.lang.Object ref = prtry_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          prtry_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Prtry = 2;</code>
       * @param value The prtry to set.
       * @return This builder for chaining.
       */
      public Builder setPrtry(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        prtry_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string Prtry = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrtry() {
        prtry_ = getDefaultInstance().getPrtry();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string Prtry = 2;</code>
       * @param value The bytes for prtry to set.
       * @return This builder for chaining.
       */
      public Builder setPrtryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        prtry_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.AdviceType1Choice)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.AdviceType1Choice)
    private static final com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice();
    }

    public static com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AdviceType1Choice>
        PARSER = new com.google.protobuf.AbstractParser<AdviceType1Choice>() {
      @java.lang.Override
      public AdviceType1Choice parsePartialFrom(
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

    public static com.google.protobuf.Parser<AdviceType1Choice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdviceType1Choice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.AdviceType1ChoiceOuterClass.AdviceType1Choice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AdviceType1Choice.proto\022#com.bank.core" +
      ".proto.pain_008_001_10\"d\n\021AdviceType1Cho" +
      "ice\022@\n\002Cd\030\001 \001(\01624.com.bank.core.proto.pa" +
      "in_008_001_10.AdviceType1Code\022\r\n\005Prtry\030\002" +
      " \001(\t*%\n\017AdviceType1Code\022\010\n\004ADWD\020\000\022\010\n\004ADN" +
      "D\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_AdviceType1Choice_descriptor,
        new java.lang.String[] { "Cd", "Prtry", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
