package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.design.font.DMFontConfig;

public interface DMDesign {

    /**
     * Gets the name of the design.
     * @return The name of the design.
     */
    String getName();

    /**
     * Gets the font configuration of the design.
     * @return The font configuration of the design.
     */
    DMFontConfig getFontConfig();

    /**
     * Sets the font configuration of the design. If the font config is not found, it will use the default font.
     * @param fontConfig The font configuration of the design.
     */
    void setFontConfig(DMFontConfig fontConfig);

    /**
     * Sets the font configuration of the design. If the font config is not found, it will use the default font.
     * @param fontConfig The font configuration of the design.
     */
    void setFontConfig(String fontConfig);
}
