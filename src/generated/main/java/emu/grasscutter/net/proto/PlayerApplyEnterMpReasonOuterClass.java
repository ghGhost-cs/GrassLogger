// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpReason.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterMpReasonOuterClass {
  private PlayerApplyEnterMpReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PlayerApplyEnterMpReason}
   */
  public enum PlayerApplyEnterMpReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PlayerJudge = 0;</code>
     */
    PlayerJudge(0),
    /**
     * <code>SceneCannotEnter = 1;</code>
     */
    SceneCannotEnter(1),
    /**
     * <code>PlayerCannotEnterMp = 2;</code>
     */
    PlayerCannotEnterMp(2),
    /**
     * <code>SystemJudge = 3;</code>
     */
    SystemJudge(3),
    /**
     * <code>AllowEnterPlayerFull = 4;</code>
     */
    AllowEnterPlayerFull(4),
    /**
     * <code>WorldLevelLowerThanHost = 5;</code>
     */
    WorldLevelLowerThanHost(5),
    /**
     * <code>HostInMatch = 6;</code>
     */
    HostInMatch(6),
    /**
     * <code>PlayerInBlacklist = 7;</code>
     */
    PlayerInBlacklist(7),
    /**
     * <code>PsPlayerNotAcceptOthers = 8;</code>
     */
    PsPlayerNotAcceptOthers(8),
    /**
     * <code>HostIsBlocked = 9;</code>
     */
    HostIsBlocked(9),
    /**
     * <code>OtherDataVersionNotLatest = 10;</code>
     */
    OtherDataVersionNotLatest(10),
    /**
     * <code>DataVersionNotLatest = 11;</code>
     */
    DataVersionNotLatest(11),
    /**
     * <code>PlayerNotInPlayerWorld = 12;</code>
     */
    PlayerNotInPlayerWorld(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PlayerJudge = 0;</code>
     */
    public static final int PlayerJudge_VALUE = 0;
    /**
     * <code>SceneCannotEnter = 1;</code>
     */
    public static final int SceneCannotEnter_VALUE = 1;
    /**
     * <code>PlayerCannotEnterMp = 2;</code>
     */
    public static final int PlayerCannotEnterMp_VALUE = 2;
    /**
     * <code>SystemJudge = 3;</code>
     */
    public static final int SystemJudge_VALUE = 3;
    /**
     * <code>AllowEnterPlayerFull = 4;</code>
     */
    public static final int AllowEnterPlayerFull_VALUE = 4;
    /**
     * <code>WorldLevelLowerThanHost = 5;</code>
     */
    public static final int WorldLevelLowerThanHost_VALUE = 5;
    /**
     * <code>HostInMatch = 6;</code>
     */
    public static final int HostInMatch_VALUE = 6;
    /**
     * <code>PlayerInBlacklist = 7;</code>
     */
    public static final int PlayerInBlacklist_VALUE = 7;
    /**
     * <code>PsPlayerNotAcceptOthers = 8;</code>
     */
    public static final int PsPlayerNotAcceptOthers_VALUE = 8;
    /**
     * <code>HostIsBlocked = 9;</code>
     */
    public static final int HostIsBlocked_VALUE = 9;
    /**
     * <code>OtherDataVersionNotLatest = 10;</code>
     */
    public static final int OtherDataVersionNotLatest_VALUE = 10;
    /**
     * <code>DataVersionNotLatest = 11;</code>
     */
    public static final int DataVersionNotLatest_VALUE = 11;
    /**
     * <code>PlayerNotInPlayerWorld = 12;</code>
     */
    public static final int PlayerNotInPlayerWorld_VALUE = 12;


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
    public static PlayerApplyEnterMpReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerApplyEnterMpReason forNumber(int value) {
      switch (value) {
        case 0: return PlayerJudge;
        case 1: return SceneCannotEnter;
        case 2: return PlayerCannotEnterMp;
        case 3: return SystemJudge;
        case 4: return AllowEnterPlayerFull;
        case 5: return WorldLevelLowerThanHost;
        case 6: return HostInMatch;
        case 7: return PlayerInBlacklist;
        case 8: return PsPlayerNotAcceptOthers;
        case 9: return HostIsBlocked;
        case 10: return OtherDataVersionNotLatest;
        case 11: return DataVersionNotLatest;
        case 12: return PlayerNotInPlayerWorld;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerApplyEnterMpReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerApplyEnterMpReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerApplyEnterMpReason>() {
            public PlayerApplyEnterMpReason findValueByNumber(int number) {
              return PlayerApplyEnterMpReason.forNumber(number);
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
      return emu.grasscutter.net.proto.PlayerApplyEnterMpReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlayerApplyEnterMpReason[] VALUES = values();

    public static PlayerApplyEnterMpReason valueOf(
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

    private PlayerApplyEnterMpReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PlayerApplyEnterMpReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerApplyEnterMpReason.proto*\317\002\n\030Pla" +
      "yerApplyEnterMpReason\022\017\n\013PlayerJudge\020\000\022\024" +
      "\n\020SceneCannotEnter\020\001\022\027\n\023PlayerCannotEnte" +
      "rMp\020\002\022\017\n\013SystemJudge\020\003\022\030\n\024AllowEnterPlay" +
      "erFull\020\004\022\033\n\027WorldLevelLowerThanHost\020\005\022\017\n" +
      "\013HostInMatch\020\006\022\025\n\021PlayerInBlacklist\020\007\022\033\n" +
      "\027PsPlayerNotAcceptOthers\020\010\022\021\n\rHostIsBloc" +
      "ked\020\t\022\035\n\031OtherDataVersionNotLatest\020\n\022\030\n\024" +
      "DataVersionNotLatest\020\013\022\032\n\026PlayerNotInPla" +
      "yerWorld\020\014B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
