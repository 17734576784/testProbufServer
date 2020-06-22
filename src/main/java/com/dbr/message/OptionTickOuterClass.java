// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OptionTick.proto

package com.dbr.message;

public final class OptionTickOuterClass {
  private OptionTickOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OptionTickOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.dbr.message.OptionTick)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string optionId = 1;</code>
     */
    java.lang.String getOptionId();
    /**
     * <code>string optionId = 1;</code>
     */
    com.google.protobuf.ByteString
        getOptionIdBytes();

    /**
     * <code>string securityId = 2;</code>
     */
    java.lang.String getSecurityId();
    /**
     * <code>string securityId = 2;</code>
     */
    com.google.protobuf.ByteString
        getSecurityIdBytes();

    /**
     * <code>int32 price = 3;</code>
     */
    int getPrice();
  }
  /**
   * Protobuf type {@code com.dbr.message.OptionTick}
   */
  public  static final class OptionTick extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.dbr.message.OptionTick)
      OptionTickOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OptionTick.newBuilder() to construct.
    private OptionTick(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OptionTick() {
      optionId_ = "";
      securityId_ = "";
      price_ = 0;
    }

    
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OptionTick(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              optionId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              securityId_ = s;
              break;
            }
            case 24: {

              price_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.dbr.message.OptionTickOuterClass.internal_static_com_dbr_message_OptionTick_descriptor;
    }

    
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dbr.message.OptionTickOuterClass.internal_static_com_dbr_message_OptionTick_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dbr.message.OptionTickOuterClass.OptionTick.class, com.dbr.message.OptionTickOuterClass.OptionTick.Builder.class);
    }

    public static final int OPTIONID_FIELD_NUMBER = 1;
    private volatile java.lang.Object optionId_;
    /**
     * <code>string optionId = 1;</code>
     */
    public java.lang.String getOptionId() {
      java.lang.Object ref = optionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        optionId_ = s;
        return s;
      }
    }
    /**
     * <code>string optionId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOptionIdBytes() {
      java.lang.Object ref = optionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        optionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SECURITYID_FIELD_NUMBER = 2;
    private volatile java.lang.Object securityId_;
    /**
     * <code>string securityId = 2;</code>
     */
    public java.lang.String getSecurityId() {
      java.lang.Object ref = securityId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityId_ = s;
        return s;
      }
    }
    /**
     * <code>string securityId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSecurityIdBytes() {
      java.lang.Object ref = securityId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_FIELD_NUMBER = 3;
    private int price_;
    /**
     * <code>int32 price = 3;</code>
     */
    public int getPrice() {
      return price_;
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
      if (!getOptionIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, optionId_);
      }
      if (!getSecurityIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, securityId_);
      }
      if (price_ != 0) {
        output.writeInt32(3, price_);
      }
      unknownFields.writeTo(output);
    }

    
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getOptionIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, optionId_);
      }
      if (!getSecurityIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, securityId_);
      }
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, price_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.dbr.message.OptionTickOuterClass.OptionTick)) {
        return super.equals(obj);
      }
      com.dbr.message.OptionTickOuterClass.OptionTick other = (com.dbr.message.OptionTickOuterClass.OptionTick) obj;

      boolean result = true;
      result = result && getOptionId()
          .equals(other.getOptionId());
      result = result && getSecurityId()
          .equals(other.getSecurityId());
      result = result && (getPrice()
          == other.getPrice());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OPTIONID_FIELD_NUMBER;
      hash = (53 * hash) + getOptionId().hashCode();
      hash = (37 * hash) + SECURITYID_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityId().hashCode();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dbr.message.OptionTickOuterClass.OptionTick parseFrom(
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
    public static Builder newBuilder(com.dbr.message.OptionTickOuterClass.OptionTick prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.dbr.message.OptionTick}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.dbr.message.OptionTick)
        com.dbr.message.OptionTickOuterClass.OptionTickOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dbr.message.OptionTickOuterClass.internal_static_com_dbr_message_OptionTick_descriptor;
      }

      
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dbr.message.OptionTickOuterClass.internal_static_com_dbr_message_OptionTick_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dbr.message.OptionTickOuterClass.OptionTick.class, com.dbr.message.OptionTickOuterClass.OptionTick.Builder.class);
      }

      // Construct using com.dbr.message.OptionTickOuterClass.OptionTick.newBuilder()
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
        optionId_ = "";

        securityId_ = "";

        price_ = 0;

        return this;
      }

      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dbr.message.OptionTickOuterClass.internal_static_com_dbr_message_OptionTick_descriptor;
      }

      
      public com.dbr.message.OptionTickOuterClass.OptionTick getDefaultInstanceForType() {
        return com.dbr.message.OptionTickOuterClass.OptionTick.getDefaultInstance();
      }

      
      public com.dbr.message.OptionTickOuterClass.OptionTick build() {
        com.dbr.message.OptionTickOuterClass.OptionTick result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      
      public com.dbr.message.OptionTickOuterClass.OptionTick buildPartial() {
        com.dbr.message.OptionTickOuterClass.OptionTick result = new com.dbr.message.OptionTickOuterClass.OptionTick(this);
        result.optionId_ = optionId_;
        result.securityId_ = securityId_;
        result.price_ = price_;
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
        if (other instanceof com.dbr.message.OptionTickOuterClass.OptionTick) {
          return mergeFrom((com.dbr.message.OptionTickOuterClass.OptionTick)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dbr.message.OptionTickOuterClass.OptionTick other) {
        if (other == com.dbr.message.OptionTickOuterClass.OptionTick.getDefaultInstance()) return this;
        if (!other.getOptionId().isEmpty()) {
          optionId_ = other.optionId_;
          onChanged();
        }
        if (!other.getSecurityId().isEmpty()) {
          securityId_ = other.securityId_;
          onChanged();
        }
        if (other.getPrice() != 0) {
          setPrice(other.getPrice());
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
        com.dbr.message.OptionTickOuterClass.OptionTick parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dbr.message.OptionTickOuterClass.OptionTick) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object optionId_ = "";
      /**
       * <code>string optionId = 1;</code>
       */
      public java.lang.String getOptionId() {
        java.lang.Object ref = optionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          optionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string optionId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOptionIdBytes() {
        java.lang.Object ref = optionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          optionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string optionId = 1;</code>
       */
      public Builder setOptionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        optionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string optionId = 1;</code>
       */
      public Builder clearOptionId() {
        
        optionId_ = getDefaultInstance().getOptionId();
        onChanged();
        return this;
      }
      /**
       * <code>string optionId = 1;</code>
       */
      public Builder setOptionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        optionId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object securityId_ = "";
      /**
       * <code>string securityId = 2;</code>
       */
      public java.lang.String getSecurityId() {
        java.lang.Object ref = securityId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          securityId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string securityId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSecurityIdBytes() {
        java.lang.Object ref = securityId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          securityId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string securityId = 2;</code>
       */
      public Builder setSecurityId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        securityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string securityId = 2;</code>
       */
      public Builder clearSecurityId() {
        
        securityId_ = getDefaultInstance().getSecurityId();
        onChanged();
        return this;
      }
      /**
       * <code>string securityId = 2;</code>
       */
      public Builder setSecurityIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        securityId_ = value;
        onChanged();
        return this;
      }

      private int price_ ;
      /**
       * <code>int32 price = 3;</code>
       */
      public int getPrice() {
        return price_;
      }
      /**
       * <code>int32 price = 3;</code>
       */
      public Builder setPrice(int value) {
        
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 price = 3;</code>
       */
      public Builder clearPrice() {
        
        price_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.dbr.message.OptionTick)
    }

    // @@protoc_insertion_point(class_scope:com.dbr.message.OptionTick)
    private static final com.dbr.message.OptionTickOuterClass.OptionTick DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dbr.message.OptionTickOuterClass.OptionTick();
    }

    public static com.dbr.message.OptionTickOuterClass.OptionTick getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OptionTick>
        PARSER = new com.google.protobuf.AbstractParser<OptionTick>() {
      
      public OptionTick parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OptionTick(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OptionTick> parser() {
      return PARSER;
    }

    
    public com.google.protobuf.Parser<OptionTick> getParserForType() {
      return PARSER;
    }

    
    public com.dbr.message.OptionTickOuterClass.OptionTick getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dbr_message_OptionTick_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dbr_message_OptionTick_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020OptionTick.proto\022\017com.dbr.message\"A\n\nO" +
      "ptionTick\022\020\n\010optionId\030\001 \001(\t\022\022\n\nsecurityI" +
      "d\030\002 \001(\t\022\r\n\005price\030\003 \001(\005B\021\n\017com.dbr.messag" +
      "eb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_dbr_message_OptionTick_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dbr_message_OptionTick_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dbr_message_OptionTick_descriptor,
        new java.lang.String[] { "OptionId", "SecurityId", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
