package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedFont;
import me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedWidget;
import me.m64diamondstar.dialoguemaster.api.utils.exceptions.InvalidFontUrlException;
import me.m64diamondstar.dialoguemaster.api.utils.exceptions.InvalidImageUrlException;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

/**
 * With this class you can create, edit and delete designs,
 * font configurations, imported fonts and widgets.
 * @see DMDesign
 * @see DMFontConfig
 * @see DMImportedFont
 * @see DMImportedWidget
 */
public interface DMDesignManager {

    /**
     * Gets a design with a specific name.
     *
     * @param name The name of the design.
     * @return The design with the given name.
     */
    @Nullable
    DMDesign getDesign(@NotNull String name);

    /**
     * Checks if a design with a specific name exists.
     *
     * @param name The name of the design.
     * @return True if the design exists, false otherwise.
     */
    boolean existsDesign(@NotNull String name);

    /**
     * Creates a new design with a specific name.
     * If a design with this name already exists it will be overwritten!
     *
     * @param name The name of the design.
     * @return The design with the given name.
     */
    DMDesign createDesign(@NotNull String name);

    /**
     * Deletes a design with a specific name.
     *
     * @param name The name of the design.
     * @return True if the design was successfully deleted, false otherwise.
     */
    boolean deleteDesign(@NotNull String name);

    /**
     * Gets all the designs.
     *
     * @return A list with all the designs.
     */
    List<DMDesign> getDesigns();

    /**
     * Gets a widget with a specific name.
     *
     * @param path The name of the widget.
     * @return The widget with the given name.
     */
    @Nullable
    DMImportedWidget getWidget(@NotNull String path);

    /**
     * Checks if a widget with a specific name exists.
     *
     * @param path The name of the widget.
     * @return True if the widget exists, false otherwise.
     */
    boolean existsWidget(@NotNull String path);

    /**
     * Creates a new widget with a specific name from an url.
     * Instead of catching an exception, you can use the method
     * {@link me.m64diamondstar.dialoguemaster.api.utils.ImageUtils#isValidImage(String)} to check if the image is valid.
     * If a widget with this path already exists it will be overwritten!
     *
     * @param path The path to the widget file.
     * @param url The url of the widget.
     * @return The widget with the given name.
     * @exception InvalidImageUrlException If the url is invalid.
     */
    DMImportedWidget createWidgetFromURL(@NotNull String path, @NotNull String url) throws InvalidImageUrlException;

    /**
     * Deletes a widget with a specific name.
     *
     * @param name The name of the widget.
     * @return True if the widget was successfully deleted, false otherwise.
     */
    boolean deleteWidget(@NotNull String name);

    /**
     * Gets a list of all widget paths.
     *
     * @return A list of all widget paths.
     */
    List<String> getWidgetPaths();

    /**
     * Gets a font with a specific name.
     *
     * @param path The name of the font.
     * @return The font with the given name.
     */
    @Nullable
    DMImportedFont getFont(@NotNull String path);

    /**
     * Checks if a font with a specific name exists.
     *
     * @param path The name of the font.
     * @return True if the font exists, false otherwise.
     */
    boolean existsFont(@NotNull String path);

    /**
     * Creates a new widget with a specific name from an url.
     * Instead of catching an exception, you can use the method
     * {@link me.m64diamondstar.dialoguemaster.api.utils.FontUtils#isValidFont(String)} to check if the font is valid.
     * If a font with this path already exists it will be overwritten!
     *
     * @param path The path to the font file.
     * @param url The url of the font.
     * @return The font with the given name.
     * @exception InvalidFontUrlException If the url is invalid.
     */
    DMImportedFont createFontFromURL(@NotNull String path, @NotNull String url) throws InvalidFontUrlException;

    /**
     * Deletes a font with a specific name.
     *
     * @param name The name of the font.
     * @return True if the font was successfully deleted, false otherwise.
     */
    boolean deleteFont(@NotNull String name);

    /**
     * Gets a list of all font paths.
     *
     * @return A list of all font paths.
     */
    List<String> getFontPaths();

    /**
     * Gets a font configuration with a specific name.
     *
     * @param name The name of the font configuration.
     * @return The font configuration with the given name.
     */
    @Nullable
    DMFontConfig getFontConfig(@NotNull String name);

    /**
     * Checks if a font configuration with a specific name exists.
     *
     * @param name The name of the font configuration.
     * @return True if the font configuration exists, false otherwise.
     */
    boolean existsFontConfig(@NotNull String name);

    /**
     * Creates a new font configuration with a specific name.
     * If a font config with this name already exists it will be overwritten!
     *
     * @param name The name of the font configuration.
     * @return The font configuration with the given name.
     */
    DMFontConfig createFontConfig(@NotNull String name);

    /**
     * Deletes a font configuration with a specific name.
     *
     * @param name The name of the font configuration.
     * @return True if the font configuration was successfully deleted, false otherwise.
     */
    boolean deleteFontConfig(@NotNull String name);


    /**
     * Gets a list of all font configuration paths.
     *
     * @return A list of all font configuration paths.
     */
    List<DMFontConfig> getFontConfigs();

}
