package me.m64diamondstar.dialoguemaster.api;

import me.m64diamondstar.dialoguemaster.api.commands.DMSubCommandRegistry;
import me.m64diamondstar.dialoguemaster.api.handler.DMAPIHandler;
import me.m64diamondstar.dialoguemaster.api.messages.DMMessageUtils;
import me.m64diamondstar.dialoguemaster.api.utils.PluginHook;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface DialogueMasterAPI {

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

    /**
     * Gets the subcommand registry. This is used to register subcommands
     * for the DialogueMaster command.
     * @return The subcommand registry.
     */
    DMSubCommandRegistry getSubCommandRegistry();

    /**
     * Gets the message utils. This is used to send (prefixed) messages to players.
     * @return The message utils.
     */
    DMMessageUtils getMessageUtils();

    /**
     * Gets a list of all the active plugin hooks: all the plugins that DialogueMaster can interact with.
     * @return The list of active plugin hooks.
     */
    List<PluginHook> getActivePluginHooks();

}