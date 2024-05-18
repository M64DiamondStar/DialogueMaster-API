package me.m64diamondstar.dialoguemaster.api.design.font;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a font configuration. This is used to configure the appearance of the
 * font like the family, size, line spacing, ...
 * @see me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedFont to use custom imported fonts!
 */
public interface DMFontConfig {

    /**
     * Gets the name of this font configuration.
     * @return The name of the font configuration.
     */
    String getName();

    /**
     * Sets the name of the font configuration.
     * @param name The name of the font configuration.
     */
    void setName(@NotNull String name);

    /**
     * Gets the family of the font. If the font is not found, it will use the default font.
     * @return The family of the font.
     */
    String getFamily();

    /**
     * Sets the family of the font. The default Minecraft font is called "default",
     * but you can also import other fonts by putting them inside the "import/fonts" folder
     * inside the DialogueMaster plugin folder.
     * @param family The family of the font.
     */
    void setFamily(@NotNull String family);

    /**
     * Gets the size of the font. Defaults to 12.
     * @return The size of the font.
     */
    int getSize();


    /**
     * Sets the size of the font. 12 is recommended for most fonts.
     * @param size The size of the font.
     */
    void setSize(int size);

    /**
     * Gets the oversample of the font. This is the quality at which it renders the font. Defaults to 16.
     * @return The oversample of the font.
     */
    int getOversample();

    /**
     * Sets the oversample of the font. This is the quality at which it renders the font. 16 is recommended for most fonts.
     * @param oversample The oversample of the font.
     */
    void setOversample(int oversample);

    /**
     * Gets the vertical shift of the font.
     * @return The vertical shift of the font.
     */
    float getVerticalShift();

    /**
     * Sets the vertical shift of the font.
     * @param verticalShift The vertical shift of the font.
     */
    void setVerticalShift(float verticalShift);

    float getLineSpacing();

    void setLineSpacing(float lineSpacing);

}
