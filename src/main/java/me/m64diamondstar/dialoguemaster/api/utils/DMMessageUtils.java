package me.m64diamondstar.dialoguemaster.api.utils;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;

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
     * Gets the short prefix of the plugin.
     * @return The short prefix of the plugin.
     */
    Component getShortPrefix();

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Audience audience, Component message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Audience audience, String message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Player player, Component message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Player player, String message, boolean isShort, Color color);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Audience audience, Component message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param audience The audience to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Audience audience, String message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Player player, Component message, boolean isShort);

    /**
     * Sends a prefixed message to the player.
     * @param player The player to send the message to.
     * @param message The message to send.
     */
    void sendPrefixedMessage(Player player, String message, boolean isShort);

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
