package me.m64diamondstar.dialoguemaster.api.utils;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * All the Minecraft versions that DialogueMaster currently supports.
 */
public enum ServerVersion {

    UNSUPPORTED(5),
    v1_16_R0(5),
    v1_16_R1(5),
    v1_16_R2(6),
    v1_16_R3(6),
    v1_16_R4(6),
    v1_16_R5(6),
    v1_17_R0(7),
    v1_17_R1(7),
    v1_18_R0(8),
    v1_18_R1(8),
    v1_18_R2(8),
    v1_19_R0(9),
    v1_19_R1(9),
    v1_19_R2(9),
    v1_19_R3(12),
    v1_19_R4(13),
    v1_20_R0(15),
    v1_20_R1(15),
    v1_20_R2(18),
    v1_20_R3(22),
    v1_20_R4(22),
    v1_20_R5(32),
    v1_20_R6(32);

    private final int packFormat;

    ServerVersion(int packFormat) {
        this.packFormat = packFormat;
    }

    public int getPackFormat() {
        return packFormat;
    }

    public boolean isGreaterThan(ServerVersion other) {
        return this.ordinal() > other.ordinal();
    }

    public boolean isLessThan(ServerVersion other) {
        return this.ordinal() < other.ordinal();
    }

    public boolean isEqualTo(ServerVersion other) {
        return this.ordinal() == other.ordinal();
    }

    /**
     * Converts a string to a {@link ServerVersion}.
     * Only accepts versions that are in the format "vX_Y_RZ".
     * For example: "v1_16_R1", "v1_19_R3", "v1_20_R0", etc.
     * @return The {@link ServerVersion} or null if the version is not supported.
     */
    @NotNull
    public static ServerVersion getFromString(String version){
        int splitAmount = version.split("\\.").length;
        String[] originalArgs = version.split("\\.");
        String[] args;
        if (splitAmount != 3) {
            args = Arrays.copyOf(originalArgs, 3);
            args[args.length - 1] = "0";
        } else {
            args = originalArgs;
        }
        boolean contains = Arrays.stream(ServerVersion.values())
                .map(ServerVersion::name)
                .anyMatch(s -> s.equals("v" + args[0] + "_" + args[1] + "_R" + args[2]));
        if(!contains) return ServerVersion.UNSUPPORTED;
        return ServerVersion.valueOf("v" + args[0] + "_" + args[1] + "_R" + args[2]);
    }

}
