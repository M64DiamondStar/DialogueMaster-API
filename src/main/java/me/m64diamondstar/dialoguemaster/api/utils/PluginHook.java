package me.m64diamondstar.dialoguemaster.api.utils;

public enum PluginHook {

    PLACEHOLDERAPI{
        @Override
        public String getDisplayName() {
            return "PlaceholderAPI";
        }
    },
    MODELENGINE{
        @Override
        public String getDisplayName() {
            return "ModelEngine";
        }
    },
    CITIZENS{
        @Override
        public String getDisplayName() {
            return "Citizens";
        }
    };

    public abstract String getDisplayName();
}
