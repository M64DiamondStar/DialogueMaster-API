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
     * @param path the new path and name of the image. For example "example_folder/example"
     */
    boolean setPath(@NotNull String path);

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
