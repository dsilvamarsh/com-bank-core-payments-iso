// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonIdentification13.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class PersonIdentification13OuterClass {
  private PersonIdentification13OuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonIdentification13OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bank.core.proto.pain_008_001_10.PersonIdentification13)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.bank.core.proto.pain_008_001_10.PersonIdentification13}
   */
  public static final class PersonIdentification13 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bank.core.proto.pain_008_001_10.PersonIdentification13)
      PersonIdentification13OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PersonIdentification13.newBuilder() to construct.
    private PersonIdentification13(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PersonIdentification13() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PersonIdentification13();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.class, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13)) {
        return super.equals(obj);
      }
      com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 other = (com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 parseFrom(
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
    public static Builder newBuilder(com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 prototype) {
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
     * Protobuf type {@code com.bank.core.proto.pain_008_001_10.PersonIdentification13}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bank.core.proto.pain_008_001_10.PersonIdentification13)
        com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.class, com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.Builder.class);
      }

      // Construct using com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getDefaultInstanceForType() {
        return com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance();
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 build() {
        com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 buildPartial() {
        com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 result = new com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13(this);
        onBuilt();
        return result;
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
        if (other instanceof com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13) {
          return mergeFrom((com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 other) {
        if (other == com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:com.bank.core.proto.pain_008_001_10.PersonIdentification13)
    }

    // @@protoc_insertion_point(class_scope:com.bank.core.proto.pain_008_001_10.PersonIdentification13)
    private static final com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13();
    }

    public static com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PersonIdentification13>
        PARSER = new com.google.protobuf.AbstractParser<PersonIdentification13>() {
      @java.lang.Override
      public PersonIdentification13 parsePartialFrom(
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

    public static com.google.protobuf.Parser<PersonIdentification13> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PersonIdentification13> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bank.core.proto.pain_008_001_10.PersonIdentification13OuterClass.PersonIdentification13 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PersonIdentification13.proto\022#com.bank" +
      ".core.proto.pain_008_001_10\"\030\n\026PersonIde" +
      "ntification13b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bank_core_proto_pain_008_001_10_PersonIdentification13_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
