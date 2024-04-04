package me.m64diamondstar.dialoguemaster.api.commands;

import java.util.List;

/**
 * Get this class from the {@link me.m64diamondstar.dialoguemaster.api.DialogueMasterAPI#getSubCommandRegistry()} method.
 * With this you can register and unregister subcommands for the DialogueMaster command.
 */
public interface DMSubCommandRegistry {

    /**
     * Registers a subcommand.
     * @param subCommand The subcommand to register.
     */
    void registerSubCommand(DMSubCommand subCommand);

    /**
     * Unregisters a subcommand.
     * @param subCommand The subcommand to unregister.
     */
    void unregisterSubCommand(DMSubCommand subCommand);

    /**
     * Gets a list of all the registered subcommands.
     * @return The list of all the registered subcommands.
     */
    List<DMSubCommand> getRegisteredSubCommands();

}
