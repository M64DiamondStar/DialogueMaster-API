package me.m64diamondstar.dialoguemaster.api;

import me.m64diamondstar.dialoguemaster.api.handler.DMAPIHandler;
import org.jetbrains.annotations.NotNull;

public class DialogueMasterAPI {

    /**
     * Gets the DialogueMasterAPI instance.
     * With this you can access the API from anywhere in the plugin.
     * Please make sure you call this method after the plugin has loaded.
     *
     * @return The DialogueMasterAPI instance.
     */
    @NotNull
    static DialogueMasterAPI getInstance() {
        try {
            return DMAPIHandler.getInstance().getApi();
        } catch (NullPointerException ex){
            throw new IllegalStateException("DialogueMasterAPI is not initialized! " +
                    "This likely means that DialogueMaster hasn't loaded yet. " +
                    "Make sure that this plugin is loaded before the DialogueMaster plugin. " +
                    "If you're still having problems, please contact the plugin author!");
        }
    }

}