package me.m64diamondstar.dialoguemaster.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * The interface needed to create a subcommand for the DialogueMaster command.
 * Implement this interface and add it to the {@link DMSubCommandRegistry} to create your own subcommand.
 */
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
     * The usage of the subcommand.
     * Please use the official command syntax for this. Here's an example:
     * /dm example &lt;necessary variable&gt; [optional variable]
     */
    String getUsage();

    /**
     * This is called when the subcommand is executed.
     * @param command The command that executed the subcommand.
     * @param sender The sender of the command.
     * @param args The arguments of the subcommand.
     */
    void execute(Command command, CommandSender sender, String[] args);

    /**
     * This is called when the subcommand is tab completed.
     * The list will get alphabetically sorted.
     * @param command the command that executed the subcommand.
     * @param sender the sender of the command.
     * @param args the arguments of the subcommand.
     * @return the list of tab completions currently available.
     */
    List<String> getTabCompletion(Command command, CommandSender sender, String[] args) throws IllegalArgumentException; // <--->
}
