package me.m64diamondstar.dialoguemaster.api.commands;

import java.util.List;

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

    List<DMSubCommand> getRegisteredSubCommands();

}
