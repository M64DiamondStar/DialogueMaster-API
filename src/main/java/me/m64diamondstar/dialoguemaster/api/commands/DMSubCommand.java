package me.m64diamondstar.dialoguemaster.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public interface DMSubCommand {

    /**
     * The name of the subcommand. The subcommand will also be called with this name.
     * It must be unique.
     */
    String getName();

    /**
     * The description of the subcommand.
     */
    String getDescription();

    /**
     * This is called when the subcommand is executed.
     * @param args The arguments of the subcommand.
     */
    void execute(Command command, CommandSender sender, String[] args);

    /**
     * This is called when the subcommand is tab completed.
     * The list will get alphabetically sorted.
     * @return the list of tab completions currently available.
     */
    List<String> getTabCompletion(Command command, CommandSender sender, String[] args) throws IllegalArgumentException; // <--->
}
