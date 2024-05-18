package me.m64diamondstar.dialoguemaster.api.utils;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FontUtils {

    /**
     * Gets the font format of a URL.
     *
     * @param urlString The URL to get the format from.
     * @return The font format (either "ttf" or "otf").
     */
    public static String getFontFormatFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        String path = url.getPath();
        if (path.endsWith(".ttf")) {
            return "ttf";
        } else if (path.endsWith(".otf")) {
            return "otf";
        } else {
            return null;
        }
    }

    /**
     * Checks if a format is supported. (Supported formats are ttf and otf)
     *
     * @param format The format to check.
     * @return True if the format is supported, false otherwise.
     */
    public static boolean isSupportedFormat(String format) {
        return format.equals("ttf") || format.equals("otf");
    }

    /**
     * Checks if a URL is valid.
     *
     * @param url The URL to check.
     * @return True if the URL is valid, false otherwise.
     */
    public static boolean isValidURL(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Checks if a font URL is valid and supported.
     *
     * @param url The URL to check.
     * @return True if the font URL is valid and supported, false otherwise.
     */
    public static boolean isValidFont(String url) {
        try {
            if (!isValidURL(url)) return false;
            String format = getFontFormatFromUrl(url);
            if (format == null || !isSupportedFormat(format)) return false;

            // Attempt to load the font to ensure it's valid
            try (InputStream is = new URL(url).openStream()) {
                Font.createFont(Font.TRUETYPE_FONT, is);
            } catch (FontFormatException e) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
