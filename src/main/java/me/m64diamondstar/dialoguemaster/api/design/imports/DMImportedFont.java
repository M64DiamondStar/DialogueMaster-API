package me.m64diamondstar.dialoguemaster.api.design.imports;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public interface DMImportedFont {

    /**
     * @return The name of the font.
     */
    String getName();

    /**
     * Sets the name of the image.
     * @param path the new path and name of the font. For example "example_folder/example"
     */
    boolean setPath(@NotNull String path);

    /**
     * @return The file of the image.
     */
    File getFile();

}
