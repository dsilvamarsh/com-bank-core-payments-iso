// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/SequenceType3Code.proto

// Protobuf Java Version: 3.25.3
package com.bank.core.proto.pain_008_001_10;

public final class SequenceType3CodeOuterClass {
  private SequenceType3CodeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.bank.core.proto.pain_008_001_10.SequenceType3Code}
   */
  public enum SequenceType3Code
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SequenceType3Code_FNAL = 0;</code>
     */
    SequenceType3Code_FNAL(0),
    /**
     * <code>SequenceType3Code_FRST = 1;</code>
     */
    SequenceType3Code_FRST(1),
    /**
     * <code>SequenceType3Code_OOFF = 2;</code>
     */
    SequenceType3Code_OOFF(2),
    /**
     * <code>SequenceType3Code_RCUR = 3;</code>
     */
    SequenceType3Code_RCUR(3),
    /**
     * <code>SequenceType3Code_RPRE = 4;</code>
     */
    SequenceType3Code_RPRE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SequenceType3Code_FNAL = 0;</code>
     */
    public static final int SequenceType3Code_FNAL_VALUE = 0;
    /**
     * <code>SequenceType3Code_FRST = 1;</code>
     */
    public static final int SequenceType3Code_FRST_VALUE = 1;
    /**
     * <code>SequenceType3Code_OOFF = 2;</code>
     */
    public static final int SequenceType3Code_OOFF_VALUE = 2;
    /**
     * <code>SequenceType3Code_RCUR = 3;</code>
     */
    public static final int SequenceType3Code_RCUR_VALUE = 3;
    /**
     * <code>SequenceType3Code_RPRE = 4;</code>
     */
    public static final int SequenceType3Code_RPRE_VALUE = 4;


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
    public static SequenceType3Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SequenceType3Code forNumber(int value) {
      switch (value) {
        case 0: return SequenceType3Code_FNAL;
        case 1: return SequenceType3Code_FRST;
        case 2: return SequenceType3Code_OOFF;
        case 3: return SequenceType3Code_RCUR;
        case 4: return SequenceType3Code_RPRE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SequenceType3Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SequenceType3Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SequenceType3Code>() {
            public SequenceType3Code findValueByNumber(int number) {
              return SequenceType3Code.forNumber(number);
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
      return com.bank.core.proto.pain_008_001_10.SequenceType3CodeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final SequenceType3Code[] VALUES = values();

    public static SequenceType3Code valueOf(
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

    private SequenceType3Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.bank.core.proto.pain_008_001_10.SequenceType3Code)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035proto/SequenceType3Code.proto\022#com.ban" +
      "k.core.proto.pain_008_001_10*\237\001\n\021Sequenc" +
      "eType3Code\022\032\n\026SequenceType3Code_FNAL\020\000\022\032" +
      "\n\026SequenceType3Code_FRST\020\001\022\032\n\026SequenceTy" +
      "pe3Code_OOFF\020\002\022\032\n\026SequenceType3Code_RCUR" +
      "\020\003\022\032\n\026SequenceType3Code_RPRE\020\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
