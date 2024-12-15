// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: combined.proto

package combined.grpc;

/**
 * <pre>
 * Message for fetching card info by client
 * </pre>
 *
 * Protobuf type {@code combined.grpc.ClientFilterRequest}
 */
public final class ClientFilterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:combined.grpc.ClientFilterRequest)
    ClientFilterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientFilterRequest.newBuilder() to construct.
  private ClientFilterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientFilterRequest() {
    nom_ = "";
    prenom_ = "";
    numeroTelephone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientFilterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return combined.grpc.Combined.internal_static_combined_grpc_ClientFilterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return combined.grpc.Combined.internal_static_combined_grpc_ClientFilterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            combined.grpc.ClientFilterRequest.class, combined.grpc.ClientFilterRequest.Builder.class);
  }

  public static final int NOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nom_ = "";
  /**
   * <code>string nom = 1;</code>
   * @return The nom.
   */
  @java.lang.Override
  public java.lang.String getNom() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nom_ = s;
      return s;
    }
  }
  /**
   * <code>string nom = 1;</code>
   * @return The bytes for nom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNomBytes() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object prenom_ = "";
  /**
   * <code>string prenom = 2;</code>
   * @return The prenom.
   */
  @java.lang.Override
  public java.lang.String getPrenom() {
    java.lang.Object ref = prenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prenom_ = s;
      return s;
    }
  }
  /**
   * <code>string prenom = 2;</code>
   * @return The bytes for prenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrenomBytes() {
    java.lang.Object ref = prenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMEROTELEPHONE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object numeroTelephone_ = "";
  /**
   * <code>string numeroTelephone = 3;</code>
   * @return The numeroTelephone.
   */
  @java.lang.Override
  public java.lang.String getNumeroTelephone() {
    java.lang.Object ref = numeroTelephone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numeroTelephone_ = s;
      return s;
    }
  }
  /**
   * <code>string numeroTelephone = 3;</code>
   * @return The bytes for numeroTelephone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumeroTelephoneBytes() {
    java.lang.Object ref = numeroTelephone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numeroTelephone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(numeroTelephone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, numeroTelephone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(numeroTelephone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, numeroTelephone_);
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
    if (!(obj instanceof combined.grpc.ClientFilterRequest)) {
      return super.equals(obj);
    }
    combined.grpc.ClientFilterRequest other = (combined.grpc.ClientFilterRequest) obj;

    if (!getNom()
        .equals(other.getNom())) return false;
    if (!getPrenom()
        .equals(other.getPrenom())) return false;
    if (!getNumeroTelephone()
        .equals(other.getNumeroTelephone())) return false;
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
    hash = (37 * hash) + NOM_FIELD_NUMBER;
    hash = (53 * hash) + getNom().hashCode();
    hash = (37 * hash) + PRENOM_FIELD_NUMBER;
    hash = (53 * hash) + getPrenom().hashCode();
    hash = (37 * hash) + NUMEROTELEPHONE_FIELD_NUMBER;
    hash = (53 * hash) + getNumeroTelephone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static combined.grpc.ClientFilterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static combined.grpc.ClientFilterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static combined.grpc.ClientFilterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static combined.grpc.ClientFilterRequest parseFrom(
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
  public static Builder newBuilder(combined.grpc.ClientFilterRequest prototype) {
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
   * <pre>
   * Message for fetching card info by client
   * </pre>
   *
   * Protobuf type {@code combined.grpc.ClientFilterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:combined.grpc.ClientFilterRequest)
      combined.grpc.ClientFilterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return combined.grpc.Combined.internal_static_combined_grpc_ClientFilterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return combined.grpc.Combined.internal_static_combined_grpc_ClientFilterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              combined.grpc.ClientFilterRequest.class, combined.grpc.ClientFilterRequest.Builder.class);
    }

    // Construct using combined.grpc.ClientFilterRequest.newBuilder()
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
      nom_ = "";
      prenom_ = "";
      numeroTelephone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return combined.grpc.Combined.internal_static_combined_grpc_ClientFilterRequest_descriptor;
    }

    @java.lang.Override
    public combined.grpc.ClientFilterRequest getDefaultInstanceForType() {
      return combined.grpc.ClientFilterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public combined.grpc.ClientFilterRequest build() {
      combined.grpc.ClientFilterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public combined.grpc.ClientFilterRequest buildPartial() {
      combined.grpc.ClientFilterRequest result = new combined.grpc.ClientFilterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(combined.grpc.ClientFilterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nom_ = nom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.prenom_ = prenom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numeroTelephone_ = numeroTelephone_;
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
      if (other instanceof combined.grpc.ClientFilterRequest) {
        return mergeFrom((combined.grpc.ClientFilterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(combined.grpc.ClientFilterRequest other) {
      if (other == combined.grpc.ClientFilterRequest.getDefaultInstance()) return this;
      if (!other.getNom().isEmpty()) {
        nom_ = other.nom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrenom().isEmpty()) {
        prenom_ = other.prenom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNumeroTelephone().isEmpty()) {
        numeroTelephone_ = other.numeroTelephone_;
        bitField0_ |= 0x00000004;
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
              nom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              prenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              numeroTelephone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object nom_ = "";
    /**
     * <code>string nom = 1;</code>
     * @return The nom.
     */
    public java.lang.String getNom() {
      java.lang.Object ref = nom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nom = 1;</code>
     * @return The bytes for nom.
     */
    public com.google.protobuf.ByteString
        getNomBytes() {
      java.lang.Object ref = nom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nom = 1;</code>
     * @param value The nom to set.
     * @return This builder for chaining.
     */
    public Builder setNom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNom() {
      nom_ = getDefaultInstance().getNom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 1;</code>
     * @param value The bytes for nom to set.
     * @return This builder for chaining.
     */
    public Builder setNomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object prenom_ = "";
    /**
     * <code>string prenom = 2;</code>
     * @return The prenom.
     */
    public java.lang.String getPrenom() {
      java.lang.Object ref = prenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prenom = 2;</code>
     * @return The bytes for prenom.
     */
    public com.google.protobuf.ByteString
        getPrenomBytes() {
      java.lang.Object ref = prenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prenom = 2;</code>
     * @param value The prenom to set.
     * @return This builder for chaining.
     */
    public Builder setPrenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      prenom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string prenom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrenom() {
      prenom_ = getDefaultInstance().getPrenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string prenom = 2;</code>
     * @param value The bytes for prenom to set.
     * @return This builder for chaining.
     */
    public Builder setPrenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      prenom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object numeroTelephone_ = "";
    /**
     * <code>string numeroTelephone = 3;</code>
     * @return The numeroTelephone.
     */
    public java.lang.String getNumeroTelephone() {
      java.lang.Object ref = numeroTelephone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numeroTelephone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numeroTelephone = 3;</code>
     * @return The bytes for numeroTelephone.
     */
    public com.google.protobuf.ByteString
        getNumeroTelephoneBytes() {
      java.lang.Object ref = numeroTelephone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numeroTelephone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numeroTelephone = 3;</code>
     * @param value The numeroTelephone to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroTelephone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      numeroTelephone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string numeroTelephone = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumeroTelephone() {
      numeroTelephone_ = getDefaultInstance().getNumeroTelephone();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string numeroTelephone = 3;</code>
     * @param value The bytes for numeroTelephone to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroTelephoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      numeroTelephone_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:combined.grpc.ClientFilterRequest)
  }

  // @@protoc_insertion_point(class_scope:combined.grpc.ClientFilterRequest)
  private static final combined.grpc.ClientFilterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new combined.grpc.ClientFilterRequest();
  }

  public static combined.grpc.ClientFilterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientFilterRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClientFilterRequest>() {
    @java.lang.Override
    public ClientFilterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientFilterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientFilterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public combined.grpc.ClientFilterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
