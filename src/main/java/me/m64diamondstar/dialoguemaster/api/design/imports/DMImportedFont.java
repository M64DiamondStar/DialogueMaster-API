package me.m64diamondstar.dialoguemaster.api.design.imports;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public interface DMImportedFont {

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

}
