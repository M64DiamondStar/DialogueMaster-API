package me.m64diamondstar.dialoguemaster.api.utils;

public enum TextAlignment {
    LEFT(0),
    CENTER(1),
    RIGHT(2);

    private final int packFormat;

    TextAlignment(int packFormat) {
        this.packFormat = packFormat;
    }

    public int getPackFormat() {
        return packFormat;
    }
}
