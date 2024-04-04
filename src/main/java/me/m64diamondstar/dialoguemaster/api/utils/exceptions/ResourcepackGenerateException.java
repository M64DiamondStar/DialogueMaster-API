package me.m64diamondstar.dialoguemaster.api.utils.exceptions;

/**
 * This exception is thrown when an error occurs while generating a resourcepack
 * for the DialogueMaster plugin.
 */
public class ResourcepackGenerateException extends Exception{
    public ResourcepackGenerateException(String message) {
        super(message);
    }
}
