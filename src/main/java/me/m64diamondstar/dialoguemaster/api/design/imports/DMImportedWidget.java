package me.m64diamondstar.dialoguemaster.api.design.imports;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * Represents an image imported through the import/widgets folder inside the plugin's folder.
 */
public interface DMImportedWidget {

    /**
     * @return The name of the image.
     */
    String getName();

    /**
     * Sets the name of the image.
     * @param name The name of the image.
     */
    void setName(@NotNull String name);

    /**
     * @return The file of the image.
     */
    File getFile();

    /**
     * @return The width of the image.
     */
    int getWidth();

    /**
     * @return The height of the image.
     */
    int getHeight();

}
