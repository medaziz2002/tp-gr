// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: combined.proto

package combined.grpc;

/**
 * Protobuf type {@code combined.grpc.HotelSearchResponseList}
 */
public final class HotelSearchResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:combined.grpc.HotelSearchResponseList)
    HotelSearchResponseListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelSearchResponseList.newBuilder() to construct.
  private HotelSearchResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelSearchResponseList() {
    hotels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelSearchResponseList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return combined.grpc.Combined.internal_static_combined_grpc_HotelSearchResponseList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return combined.grpc.Combined.internal_static_combined_grpc_HotelSearchResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            combined.grpc.HotelSearchResponseList.class, combined.grpc.HotelSearchResponseList.Builder.class);
  }

  public static final int HOTELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<combined.grpc.HotelSearchResponse> hotels_;
  /**
   * <pre>
   * List of hotels matching the criteria
   * </pre>
   *
   * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<combined.grpc.HotelSearchResponse> getHotelsList() {
    return hotels_;
  }
  /**
   * <pre>
   * List of hotels matching the criteria
   * </pre>
   *
   * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends combined.grpc.HotelSearchResponseOrBuilder> 
      getHotelsOrBuilderList() {
    return hotels_;
  }
  /**
   * <pre>
   * List of hotels matching the criteria
   * </pre>
   *
   * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
   */
  @java.lang.Override
  public int getHotelsCount() {
    return hotels_.size();
  }
  /**
   * <pre>
   * List of hotels matching the criteria
   * </pre>
   *
   * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
   */
  @java.lang.Override
  public combined.grpc.HotelSearchResponse getHotels(int index) {
    return hotels_.get(index);
  }
  /**
   * <pre>
   * List of hotels matching the criteria
   * </pre>
   *
   * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
   */
  @java.lang.Override
  public combined.grpc.HotelSearchResponseOrBuilder getHotelsOrBuilder(
      int index) {
    return hotels_.get(index);
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
    for (int i = 0; i < hotels_.size(); i++) {
      output.writeMessage(1, hotels_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hotels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hotels_.get(i));
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
    if (!(obj instanceof combined.grpc.HotelSearchResponseList)) {
      return super.equals(obj);
    }
    combined.grpc.HotelSearchResponseList other = (combined.grpc.HotelSearchResponseList) obj;

    if (!getHotelsList()
        .equals(other.getHotelsList())) return false;
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
    if (getHotelsCount() > 0) {
      hash = (37 * hash) + HOTELS_FIELD_NUMBER;
      hash = (53 * hash) + getHotelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static combined.grpc.HotelSearchResponseList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static combined.grpc.HotelSearchResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static combined.grpc.HotelSearchResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static combined.grpc.HotelSearchResponseList parseFrom(
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
  public static Builder newBuilder(combined.grpc.HotelSearchResponseList prototype) {
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
   * Protobuf type {@code combined.grpc.HotelSearchResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:combined.grpc.HotelSearchResponseList)
      combined.grpc.HotelSearchResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return combined.grpc.Combined.internal_static_combined_grpc_HotelSearchResponseList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return combined.grpc.Combined.internal_static_combined_grpc_HotelSearchResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              combined.grpc.HotelSearchResponseList.class, combined.grpc.HotelSearchResponseList.Builder.class);
    }

    // Construct using combined.grpc.HotelSearchResponseList.newBuilder()
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
      if (hotelsBuilder_ == null) {
        hotels_ = java.util.Collections.emptyList();
      } else {
        hotels_ = null;
        hotelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return combined.grpc.Combined.internal_static_combined_grpc_HotelSearchResponseList_descriptor;
    }

    @java.lang.Override
    public combined.grpc.HotelSearchResponseList getDefaultInstanceForType() {
      return combined.grpc.HotelSearchResponseList.getDefaultInstance();
    }

    @java.lang.Override
    public combined.grpc.HotelSearchResponseList build() {
      combined.grpc.HotelSearchResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public combined.grpc.HotelSearchResponseList buildPartial() {
      combined.grpc.HotelSearchResponseList result = new combined.grpc.HotelSearchResponseList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(combined.grpc.HotelSearchResponseList result) {
      if (hotelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hotels_ = java.util.Collections.unmodifiableList(hotels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hotels_ = hotels_;
      } else {
        result.hotels_ = hotelsBuilder_.build();
      }
    }

    private void buildPartial0(combined.grpc.HotelSearchResponseList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof combined.grpc.HotelSearchResponseList) {
        return mergeFrom((combined.grpc.HotelSearchResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(combined.grpc.HotelSearchResponseList other) {
      if (other == combined.grpc.HotelSearchResponseList.getDefaultInstance()) return this;
      if (hotelsBuilder_ == null) {
        if (!other.hotels_.isEmpty()) {
          if (hotels_.isEmpty()) {
            hotels_ = other.hotels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHotelsIsMutable();
            hotels_.addAll(other.hotels_);
          }
          onChanged();
        }
      } else {
        if (!other.hotels_.isEmpty()) {
          if (hotelsBuilder_.isEmpty()) {
            hotelsBuilder_.dispose();
            hotelsBuilder_ = null;
            hotels_ = other.hotels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hotelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHotelsFieldBuilder() : null;
          } else {
            hotelsBuilder_.addAllMessages(other.hotels_);
          }
        }
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
              combined.grpc.HotelSearchResponse m =
                  input.readMessage(
                      combined.grpc.HotelSearchResponse.parser(),
                      extensionRegistry);
              if (hotelsBuilder_ == null) {
                ensureHotelsIsMutable();
                hotels_.add(m);
              } else {
                hotelsBuilder_.addMessage(m);
              }
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

    private java.util.List<combined.grpc.HotelSearchResponse> hotels_ =
      java.util.Collections.emptyList();
    private void ensureHotelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hotels_ = new java.util.ArrayList<combined.grpc.HotelSearchResponse>(hotels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        combined.grpc.HotelSearchResponse, combined.grpc.HotelSearchResponse.Builder, combined.grpc.HotelSearchResponseOrBuilder> hotelsBuilder_;

    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public java.util.List<combined.grpc.HotelSearchResponse> getHotelsList() {
      if (hotelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hotels_);
      } else {
        return hotelsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public int getHotelsCount() {
      if (hotelsBuilder_ == null) {
        return hotels_.size();
      } else {
        return hotelsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public combined.grpc.HotelSearchResponse getHotels(int index) {
      if (hotelsBuilder_ == null) {
        return hotels_.get(index);
      } else {
        return hotelsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder setHotels(
        int index, combined.grpc.HotelSearchResponse value) {
      if (hotelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelsIsMutable();
        hotels_.set(index, value);
        onChanged();
      } else {
        hotelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder setHotels(
        int index, combined.grpc.HotelSearchResponse.Builder builderForValue) {
      if (hotelsBuilder_ == null) {
        ensureHotelsIsMutable();
        hotels_.set(index, builderForValue.build());
        onChanged();
      } else {
        hotelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder addHotels(combined.grpc.HotelSearchResponse value) {
      if (hotelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelsIsMutable();
        hotels_.add(value);
        onChanged();
      } else {
        hotelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder addHotels(
        int index, combined.grpc.HotelSearchResponse value) {
      if (hotelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelsIsMutable();
        hotels_.add(index, value);
        onChanged();
      } else {
        hotelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder addHotels(
        combined.grpc.HotelSearchResponse.Builder builderForValue) {
      if (hotelsBuilder_ == null) {
        ensureHotelsIsMutable();
        hotels_.add(builderForValue.build());
        onChanged();
      } else {
        hotelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder addHotels(
        int index, combined.grpc.HotelSearchResponse.Builder builderForValue) {
      if (hotelsBuilder_ == null) {
        ensureHotelsIsMutable();
        hotels_.add(index, builderForValue.build());
        onChanged();
      } else {
        hotelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder addAllHotels(
        java.lang.Iterable<? extends combined.grpc.HotelSearchResponse> values) {
      if (hotelsBuilder_ == null) {
        ensureHotelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hotels_);
        onChanged();
      } else {
        hotelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder clearHotels() {
      if (hotelsBuilder_ == null) {
        hotels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hotelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public Builder removeHotels(int index) {
      if (hotelsBuilder_ == null) {
        ensureHotelsIsMutable();
        hotels_.remove(index);
        onChanged();
      } else {
        hotelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public combined.grpc.HotelSearchResponse.Builder getHotelsBuilder(
        int index) {
      return getHotelsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public combined.grpc.HotelSearchResponseOrBuilder getHotelsOrBuilder(
        int index) {
      if (hotelsBuilder_ == null) {
        return hotels_.get(index);  } else {
        return hotelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public java.util.List<? extends combined.grpc.HotelSearchResponseOrBuilder> 
         getHotelsOrBuilderList() {
      if (hotelsBuilder_ != null) {
        return hotelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hotels_);
      }
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public combined.grpc.HotelSearchResponse.Builder addHotelsBuilder() {
      return getHotelsFieldBuilder().addBuilder(
          combined.grpc.HotelSearchResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public combined.grpc.HotelSearchResponse.Builder addHotelsBuilder(
        int index) {
      return getHotelsFieldBuilder().addBuilder(
          index, combined.grpc.HotelSearchResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * List of hotels matching the criteria
     * </pre>
     *
     * <code>repeated .combined.grpc.HotelSearchResponse hotels = 1;</code>
     */
    public java.util.List<combined.grpc.HotelSearchResponse.Builder> 
         getHotelsBuilderList() {
      return getHotelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        combined.grpc.HotelSearchResponse, combined.grpc.HotelSearchResponse.Builder, combined.grpc.HotelSearchResponseOrBuilder> 
        getHotelsFieldBuilder() {
      if (hotelsBuilder_ == null) {
        hotelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            combined.grpc.HotelSearchResponse, combined.grpc.HotelSearchResponse.Builder, combined.grpc.HotelSearchResponseOrBuilder>(
                hotels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hotels_ = null;
      }
      return hotelsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:combined.grpc.HotelSearchResponseList)
  }

  // @@protoc_insertion_point(class_scope:combined.grpc.HotelSearchResponseList)
  private static final combined.grpc.HotelSearchResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new combined.grpc.HotelSearchResponseList();
  }

  public static combined.grpc.HotelSearchResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelSearchResponseList>
      PARSER = new com.google.protobuf.AbstractParser<HotelSearchResponseList>() {
    @java.lang.Override
    public HotelSearchResponseList parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelSearchResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelSearchResponseList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public combined.grpc.HotelSearchResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

