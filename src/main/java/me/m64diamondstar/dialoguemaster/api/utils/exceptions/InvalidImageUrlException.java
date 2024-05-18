package me.m64diamondstar.dialoguemaster.api.utils.exceptions;

/**
 * This exception is thrown when an error occurs while generating a resourcepack
 * for the DialogueMaster plugin.
 */
public class InvalidImageUrlException extends Exception{
    public InvalidImageUrlException(String message) {
        super(message);
    }
}
