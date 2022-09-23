// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpenStateChangeNotify.proto

package emu.grasscutter.net.proto;

public final class OpenStateChangeNotifyOuterClass {
  private OpenStateChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpenStateChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpenStateChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    int getOpenStateMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    boolean containsOpenStateMap(
        int key);
    /**
     * Use {@link #getOpenStateMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getOpenStateMap();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getOpenStateMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */

    int getOpenStateMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */

    int getOpenStateMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 127
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code OpenStateChangeNotify}
   */
  public static final class OpenStateChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpenStateChangeNotify)
      OpenStateChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpenStateChangeNotify.newBuilder() to construct.
    private OpenStateChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpenStateChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpenStateChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpenStateChangeNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                openStateMap_ = com.google.protobuf.MapField.newMapField(
                    OpenStateMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              openStateMap__ = input.readMessage(
                  OpenStateMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              openStateMap_.getMutableMap().put(
                  openStateMap__.getKey(), openStateMap__.getValue());
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetOpenStateMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.class, emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.Builder.class);
    }

    public static final int OPEN_STATE_MAP_FIELD_NUMBER = 4;
    private static final class OpenStateMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_OpenStateMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> openStateMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetOpenStateMap() {
      if (openStateMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            OpenStateMapDefaultEntryHolder.defaultEntry);
      }
      return openStateMap_;
    }

    public int getOpenStateMapCount() {
      return internalGetOpenStateMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsOpenStateMap(
        int key) {
      
      return internalGetOpenStateMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getOpenStateMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMap() {
      return getOpenStateMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMapMap() {
      return internalGetOpenStateMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    @java.lang.Override

    public int getOpenStateMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOpenStateMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
     */
    @java.lang.Override

    public int getOpenStateMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOpenStateMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetOpenStateMap(),
          OpenStateMapDefaultEntryHolder.defaultEntry,
          4);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetOpenStateMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        openStateMap__ = OpenStateMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, openStateMap__);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify other = (emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify) obj;

      if (!internalGetOpenStateMap().equals(
          other.internalGetOpenStateMap())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetOpenStateMap().getMap().isEmpty()) {
        hash = (37 * hash) + OPEN_STATE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetOpenStateMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify prototype) {
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
     * CmdId: 127
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code OpenStateChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpenStateChangeNotify)
        emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetOpenStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableOpenStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.class, emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableOpenStateMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.internal_static_OpenStateChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify build() {
        emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify buildPartial() {
        emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify result = new emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify(this);
        int from_bitField0_ = bitField0_;
        result.openStateMap_ = internalGetOpenStateMap();
        result.openStateMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify other) {
        if (other == emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.getDefaultInstance()) return this;
        internalGetMutableOpenStateMap().mergeFrom(
            other.internalGetOpenStateMap());
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> openStateMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetOpenStateMap() {
        if (openStateMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              OpenStateMapDefaultEntryHolder.defaultEntry);
        }
        return openStateMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableOpenStateMap() {
        onChanged();;
        if (openStateMap_ == null) {
          openStateMap_ = com.google.protobuf.MapField.newMapField(
              OpenStateMapDefaultEntryHolder.defaultEntry);
        }
        if (!openStateMap_.isMutable()) {
          openStateMap_ = openStateMap_.copy();
        }
        return openStateMap_;
      }

      public int getOpenStateMapCount() {
        return internalGetOpenStateMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsOpenStateMap(
          int key) {
        
        return internalGetOpenStateMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getOpenStateMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMap() {
        return getOpenStateMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMapMap() {
        return internalGetOpenStateMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */
      @java.lang.Override

      public int getOpenStateMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetOpenStateMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */
      @java.lang.Override

      public int getOpenStateMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetOpenStateMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearOpenStateMap() {
        internalGetMutableOpenStateMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */

      public Builder removeOpenStateMap(
          int key) {
        
        internalGetMutableOpenStateMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableOpenStateMap() {
        return internalGetMutableOpenStateMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */
      public Builder putOpenStateMap(
          int key,
          int value) {
        
        
        internalGetMutableOpenStateMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 4;</code>
       */

      public Builder putAllOpenStateMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableOpenStateMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:OpenStateChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:OpenStateChangeNotify)
    private static final emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify();
    }

    public static emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpenStateChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpenStateChangeNotify>() {
      @java.lang.Override
      public OpenStateChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpenStateChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpenStateChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpenStateChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenStateChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpenStateChangeNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenStateChangeNotify_OpenStateMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpenStateChangeNotify_OpenStateMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033OpenStateChangeNotify.proto\"\216\001\n\025OpenSt" +
      "ateChangeNotify\022@\n\016open_state_map\030\004 \003(\0132" +
      "(.OpenStateChangeNotify.OpenStateMapEntr" +
      "y\0323\n\021OpenStateMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005v" +
      "alue\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpenStateChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpenStateChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpenStateChangeNotify_descriptor,
        new java.lang.String[] { "OpenStateMap", });
    internal_static_OpenStateChangeNotify_OpenStateMapEntry_descriptor =
      internal_static_OpenStateChangeNotify_descriptor.getNestedTypes().get(0);
    internal_static_OpenStateChangeNotify_OpenStateMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpenStateChangeNotify_OpenStateMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
