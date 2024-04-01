package me.m64diamondstar.dialoguemaster.api.handler;

import me.m64diamondstar.dialoguemaster.api.DialogueMasterAPI;
import org.jetbrains.annotations.NotNull;

/**
 * The handler for the DialogueMasterAPI.
 * This class is used to get the DialogueMasterAPI instance and not meant for public use.
 * This class may also change in the future.
 */
public class DMAPIHandler {

    private static DMAPIHandler instance;
    private final DialogueMasterAPI api;

    @NotNull
    public DialogueMasterAPI getApi() {
        return api;
    }

    public static DMAPIHandler getInstance() {
        return instance;
    }

    private DMAPIHandler(DialogueMasterAPI api) {
        this.api = api;
    }

    public static void init(@NotNull DialogueMasterAPI api) {
        if(instance != null) {
            throw new IllegalStateException("The DialogueMasterAPI handler is already initialized!");
        }
        instance = new DMAPIHandler(api);
    }

}
