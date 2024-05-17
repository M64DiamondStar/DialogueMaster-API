package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.design.font.DMFontConfig;
import org.jetbrains.annotations.NotNull;

public interface DMDesign {

    /**
     * Gets the name of the design.
     * @return The name of the design.
     */
    String getName();

    /**
     * Sets the name of the font configuration.
     * @param name The name of the font configuration.
     */
    void setName(@NotNull String name);

    /**
     * Gets the font configuration of the design.
     * @return The font configuration of the design.
     */
    DMFontConfig getFontConfig();

    /**
     * Sets the font configuration of the design. If the font config is not found, it will use the default font.
     * @param fontConfig The font configuration of the design.
     */
    void setFontConfig(@NotNull DMFontConfig fontConfig);

    /**
     * Sets the font configuration of the design. If the font config is not found, it will use the default font.
     * @param fontConfig The font configuration of the design.
     */
    void setFontConfig(@NotNull String fontConfig);



}
