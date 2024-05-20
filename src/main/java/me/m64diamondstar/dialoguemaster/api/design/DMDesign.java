package me.m64diamondstar.dialoguemaster.api.design;

import me.m64diamondstar.dialoguemaster.api.design.imports.DMImportedWidget;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents a full dialogue design. (The visual part at least)
 */
public interface DMDesign {

    /**
     * Gets the name of the design.
     *
     * @return The name of the design.
     */
    @NotNull
    String getName();

    /**
     * Sets the name of the font configuration.
     *
     * @param name The name of the font configuration.
     */
    void setName(@NotNull String name);

    /**
     * Gets the font configuration of the design.
     *
     * @return The font configuration of the design.
     */
    @Nullable
    DMFontConfig getFontConfig();

    /**
     * Sets the font configuration of the design.
     *
     * @param fontConfig The font configuration of the design.
     */
    void setFontConfig(@NotNull DMFontConfig fontConfig);

    /**
     * The font config used to display dialogue options.
     * You may want to display it somewhere else, that is why
     * this feature exists.
     *
     * @return The font config used to display dialogue options.
     */
    @Nullable
    DMFontConfig getOptionsFontConfig();

    /**
     * Sets the font config used to display dialogue options.
     *
     * @param fontConfig The font config used to display dialogue options.
     */
    void setOptionsFontConfig(@NotNull DMFontConfig fontConfig);

    /**
     * Gets the background of the design. This is a widget that will be used as the background.
     *
     * @return The background of the design.
     */
    @Nullable
    DMImportedWidget getBackground();

    /**
     * Sets the background of the design.
     *
     * @param background The widget to use as background.
     */
    void setBackground(@NotNull DMImportedWidget background);

    /**
     * Sets the height of the background, this determines the total size of it.
     * @param height The height of the background
     */
    void setBackgroundHeight(int height);

    /**
     * Gets the height of the background.
     * @return The height of the background.
     */
    int getBackgroundHeight();

    /**
     * Sets the x offset of the background.
     * @param x The x offset
     */
    void setBackgroundXOffset(int x);

    /**
     * Gets the x offset of the background.
     * @return The x offset
     */
    int getBackgroundXOffset();

    /**
     * Sets the y offset of the background.
     * @param y The y offset
     */
    void setBackgroundYOffset(int y);

    /**
     * Gets the y offset of the background.
     * @return The y offset
     */
    int getBackgroundYOffset();

    /**
     * Sets the x offset of the whole design.
     * @param x The x offset
     */
    void setXOffset(int x);

    /**
     * Gets the x offset of the whole design.
     * @return The x offset
     */
    int getXOffset();

    /**
     * Sets a widget with a specific index. The index is the order of the widget in the design,
     * so if one widget has a higher index than another one, it will get displayed on top.
     * @param index The index of the widget.
     * @param widget The widget to set.
     * @param height The height of the widget.
     * @param xOffset The x offset of the widget.
     * @param yOffset The y offset of the widget.
     */
    void setWidget(int index, @NotNull DMImportedWidget widget, int height, int xOffset, int yOffset);

    /**
     * Sets an imported widget with a specific index.
     * @param index The index of the widget.
     * @param widget The widget to set.
     */
    void setImportedWidget(int index, @NotNull DMImportedWidget widget);

    /**
     * Sets the x offset of a widget.
     * @param index The index of the widget.
     * @param xOffset The x offset of the widget.
     */
    void setWidgetXOffset(int index, int xOffset);

    /**
     * Sets the y offset of a widget.
     * @param index The index of the widget.
     * @param yOffset The y offset of the widget.
     */
    void setWidgetYOffset(int index, int yOffset);

    /**
     * Sets the height of a widget.
     * @param index The index of the widget.
     * @param height The height of the widget.
     */
    void setWidgetHeight(int index, int height);

    /**
     * Adds a widget with the lowest unused index, so it will be displayed on top.
     * @param widget The widget to add.
     * @param height The height of the widget.
     * @param xOffset The x offset of the widget.
     * @param yOffset The y offset of the widget.
     * @return The index given to the added widget.
     */
    int addWidget(@NotNull DMImportedWidget widget, int height, int xOffset, int yOffset);

    /**
     * Inserts a widget at a specific index, adding one value to the ones after it.
     * @param index The index of the widget.
     * @param widget The widget to insert.
     * @param height The height of the widget.
     * @param xOffset The x offset of the widget.
     * @param yOffset The y offset of the widget.
     */
    void insertWidget(int index, @NotNull DMImportedWidget widget, int height, int xOffset, int yOffset);

    /**
     * Move a widget from one index to another.
     * @param from The index of the widget to move.
     * @param to The index to move the widget to.
     */
    void moveWidget(int from, int to);

    /**
     * Removes a widget with a specific index.
     * @param index The index of the widget.
     * @param reduce If true, the indexes of the widgets after this will be reduced by one.
     */
    void removeWidget(int index, boolean reduce);

    /**
     * Gets a widget with a specific index.
     * @param index The index of the widget.
     * @return The widget with the given index.
     */
    @Nullable
    DMImportedWidget getWidget(int index);

    /**
     * Gets the height of a widget.
     * @param index The index of the widget.
     * @return The height of the widget.
     */
    int getWidgetHeight(int index);

    /**
     * Gets the x offset of a widget.
     * @param index The index of the widget.
     * @return The x offset of the widget.
     */
    int getWidgetXOffset(int index);

    /**
     * Gets the y offset of a widget.
     * @param index The index of the widget.
     * @return The y offset of the widget.
     */
    int getWidgetYOffset(int index);

    /**
     * Gets the indexes of all the widgets in the design.
     * @return The indexes of all the widgets in the design.
     */
    List<Integer> getWidgetIndexes();

}