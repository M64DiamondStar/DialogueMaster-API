package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.design.font.DMFontConfig;
import me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedWidget;
import me.m64diamondstar.dialoguemaster.api.utils.exceptions.InvalidImageUrlException;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * With this class you can create, edit and delete designs, font configurations and widgets.
 */
public interface DMDesignManager {

    /**
     * Gets a design with a specific name.
     * @param name The name of the design.
     * @return The design with the given name.
     */
    @Nullable
    DMDesign getDesign(@NotNull String name);

    /**
     * Checks if a design with a specific name exists.
     * @param name The name of the design.
     * @return True if the design exists, false otherwise.
     */
    boolean existsDesign(@NotNull String name);

    /**
     * Creates a new design with a specific name.
     * @param name The name of the design.
     * @return The design with the given name.
     */
    DMDesign createDesign(@NotNull String name);

    /**
     * Deletes a design with a specific name.
     * @param name The name of the design.
     * @return True if the design was successfully deleted, false otherwise.
     */
    boolean deleteDesign(@NotNull String name);

    /**
     * Gets a widget with a specific name.
     * @param path The name of the widget.
     * @return The widget with the given name.
     */
    @Nullable
    DMImportedWidget getWidget(@NotNull String path);

    /**
     * Checks if a widget with a specific name exists.
     * @param path The name of the widget.
     * @return True if the widget exists, false otherwise.
     */
    boolean existsWidget(@NotNull String path);

    /**
     * Creates a new widget with a specific name from an url.
     * @param path The path to the widget file.
     * @param url The url of the widget.
     * @return The widget with the given name.
     * @exception InvalidImageUrlException If the url is invalid.
     */
    DMImportedWidget createWidgetFromURL(@NotNull String path, @NotNull String url) throws InvalidImageUrlException;

    /**
     * Deletes a widget with a specific name.
     * @param name The name of the widget.
     * @return True if the widget was successfully deleted, false otherwise.
     */
    boolean deleteWidget(@NotNull String name);

    /**
     * Gets a font configuration with a specific name.
     * @param name The name of the font configuration.
     * @return The font configuration with the given name.
     */
    @Nullable
    DMFontConfig getFontConfig(@NotNull String name);

    /**
     * Checks if a font configuration with a specific name exists.
     * @param name The name of the font configuration.
     * @return True if the font configuration exists, false otherwise.
     */
    boolean existsFontConfig(@NotNull String name);

    /**
     * Creates a new font configuration with a specific name.
     * @param name The name of the font configuration.
     * @return The font configuration with the given name.
     */
    DMFontConfig createFontConfig(@NotNull String name);

    /**
     * Deletes a font configuration with a specific name.
     * @param name The name of the font configuration.
     * @return True if the font configuration was successfully deleted, false otherwise.
     */
    boolean deleteFontConfig(@NotNull String name);

}
