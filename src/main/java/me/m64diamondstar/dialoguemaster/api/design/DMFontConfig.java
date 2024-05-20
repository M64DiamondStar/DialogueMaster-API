package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.utils.TextAlignment;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a font configuration. This is used to configure the appearance of the
 * font like the family, size, line spacing, ...
 * @see me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedFont The DMImportedFont class to use custom imported fonts!
 */
public interface DMFontConfig {

    /**
     * Gets the name of this font configuration.
     * @return The name of the font configuration.
     */
    @NotNull
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
     * Gets the vertical shift of the font. This is the vertical shift of the first line.
     * The other lines will be determined by this value plus x times the line spacing.
     * @return The vertical shift of the font.
     */
    float getVerticalShift();

    /**
     * Sets the vertical shift of the font.This is the vertical shift of the first line.
     * The other lines will be determined by this value plus x times the line spacing.
     * @param verticalShift The vertical shift of the font.
     */
    void setVerticalShift(float verticalShift);

    /**
     * Gets the line spacing of the font.
     * @return The line spacing of the font.
     */
    float getLineSpacing();

    /**
     * Sets the line spacing of the font.
     * @param lineSpacing The line spacing of the font.
     */
    void setLineSpacing(float lineSpacing);

    /**
     * Gets the max lines of the font.
     * @return The max lines of the font.
     */
    int getMaxLines();

    /**
     * Sets the max lines of the font. Defaults to 5.
     * @param maxLines The max lines of the font.
     */
    void setMaxLines(int maxLines);

    /**
     * Gets the alignment of the font.
     * @return The alignment of the font.
     */
    TextAlignment getAlignment();

    /**
     * Sets the alignment of the font.
     * @param alignment The alignment of the font.
     */
    void setAlignment(TextAlignment alignment);

    /**
     * Gets the max line width of the font.
     * @return The max line width of the font.
     */
    int getMaxLineWidth();

    /**
     * Sets the max line width of the font.
     * @param maxWidth The max line width of the font.
     * @return The max line width of the font.
     */
    int setMaxLineWidth(int maxWidth);

}
