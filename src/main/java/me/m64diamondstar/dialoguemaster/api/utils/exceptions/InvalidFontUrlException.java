package me.m64diamondstar.dialoguemaster.api.utils.exceptions;

/**
 * This exception is thrown when an error occurs while
 * trying to retrieve a TFF or OTF font from a URL.
 */
public class InvalidFontUrlException extends Exception{
    public InvalidFontUrlException(String message) {
        super(message);
    }
}
