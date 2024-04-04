package me.m64diamondstar.dialoguemaster.api.messages;

import me.m64diamondstar.dialoguemaster.api.utils.Pair;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This class is used to send messages to players. You can for example send prefixed messages with this.
 * Please use the {@link me.m64diamondstar.dialoguemaster.api.DialogueMasterAPI#getMessageUtils()} method to get the message utils.
 */
public interface DMMessageUtils {

    /**
     * Gets the prefix of the plugin.
     * @return The prefix of the plugin.
     */
    Component getPrefix();

    /**
     * Gets the short prefix of the plugin without deserialization.
     * @return The short prefix of the plugin.
     */
    Component getShortPrefix();

    /**
     * Gets the prefix string of the plugin without deserialization.
     * @return The prefix string of the plugin.
     */
    String getPrefixString();

    /**
     * Gets the short prefix string of the plugin without deserialization.
     * @return The short prefix string of the plugin.
     */
    String getShortPrefixString();

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Audience audience, @NotNull Component message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Audience audience, @NotNull String message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Player player, @NotNull Component message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Player player, @NotNull String message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Audience audience, @NotNull Component message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Audience audience, @NotNull String message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Player player, @NotNull Component message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(@NotNull Player player, @NotNull String message, boolean isShort);

    /**
     * Sends a configurable message to the player. These messages can be changed in the plugin's messages.yml.
     * It will also replace PlaceholderAPI's placeholders if it is installed on the server.
     * @param player The player to send the message to.
     * @param messageNode The message node to send to the player. The message node is the path to the message in the messages.yml.
     *                    For example "example.message"
     * @param placeholders The placeholders of the message. This is a list of {@link Pair}s with the placeholder as key and the replacement as value.
     *                     For example if you want to send a message like "Hello {player}!", you would use {@code List.of(new Pair("{player}", player.getName()))}
     */
    void sendConfigurableMessage(@NotNull Player player, @NotNull String messageNode, @NotNull List<Pair<String, String>> placeholders);

    /**
     * Sends a configurable message to the player. These messages can be changed in the plugin's messages.yml.
     * It will also replace PlaceholderAPI's placeholders if it is installed on the server and if the sender is a player.
     * @param sender The {@link CommandSender} to send the message to.
     * @param messageNode The message node to send to the player. The message node is the path to the message in the messages.yml.
     *                    For example "example.message"
     * @param placeholders The placeholders of the message. This is a list of {@link Pair}s with the placeholder as key and the replacement as value.
     *                     For example if you want to send a message like "Hello {player}!", you would use {@code List.of(new Pair("{player}", player.getName()))}
     */
    void sendConfigurableMessage(@NotNull CommandSender sender, @NotNull String messageNode, @NotNull List<Pair<String, String>> placeholders);

    /**
     * Sends a configurable message to the player. These messages can be changed in the plugin's messages.yml.
     * With this method you CAN'T use PlaceholderAPI's placeholders.
     * @param audience The audience to send the message to.
     * @param messageNode The message node to send to the player. The message node is the path to the message in the messages.yml.
     *                    For example "example.message"
     * @param placeholders The placeholders of the message. This is a list of {@link Pair}s with the placeholder as key and the replacement as value.
     *                     For example if you want to send a message like "Hello {player}!", you would use {@code List.of(new Pair("{player}", player.getName()))}
     */
    void sendConfigurableMessage(@NotNull Audience audience, @NotNull String messageNode, @NotNull List<Pair<String, String>> placeholders);

    /**
     * Registers a message in the plugin's messages.yml.
     * @param messageNode The path to the message in the messages.yml. For example "example.message"
     * @param message The message to register.
     */
    void registerMessage(@NotNull String messageNode, @NotNull String message);

    enum Color {
        ERROR{
            @Override
            public String getHex() {
                return "#bd4d4d";
            }
        },
        SUCCESS{
            @Override
            public String getHex() {
                return "#53bd4d";
            }
        },
        DEFAULT{
            @Override
            public String getHex() {
                return "#bfbfbf";
            }
        },
        BACKGROUND{
            @Override
            public String getHex() {
                return "#7d7d7d";
            }
        };

        /**
         * Gets the HEX value of the color
         * @return The HEX value as a {@link String}.
         */
        public abstract String getHex();

        /**
         * Gets the TextColor of the color
         * @return The {@link net.kyori.adventure.text.format.TextColor} value.
         */
        public TextColor getTextColor(){
            return TextColor.fromHexString(getHex());
        }
    }

}
