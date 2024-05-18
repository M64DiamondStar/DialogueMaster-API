package me.m64diamondstar.dialoguemaster.api.utils;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Objects;

public class ImageUtils {

    /**
     * Gets the image format of an url.
     *
     * @param urlString The url to get the format from.
     * @return The image format.
     */
    public static String getImageFormatFromUrl(String urlString) throws IOException {
        ImageInputStream imageInputStream = null;
        try {
            // Create a URL object from the string
            URL url = new URL(urlString);
            // Create an ImageInputStream from the URL
            imageInputStream = ImageIO.createImageInputStream(url.openStream());
            // Get an iterator over ImageReaders for the input
            Iterator<ImageReader> readers = ImageIO.getImageReaders(imageInputStream);
            if (readers.hasNext()) {
                // Get the first reader
                ImageReader reader = readers.next();
                // Get the format name
                return reader.getFormatName();
            } else {
                return null;
            }
        } finally {
            // Close the ImageInputStream
            if (imageInputStream != null) {
                imageInputStream.close();
            }
        }
    }

    /**
     * Checks if a format is supported. (Only supported format is png)
     *
     * @param format The format to check.
     * @return True if the format is supported, false otherwise.
     */
    public static boolean isSupportedFormat(String format) {
        return format.equals("png");
    }

    /**
     * Checks if a url is valid.
     * @param url The url to check.
     * @return True if the url is valid, false otherwise.
     */
    public static boolean isValidURL(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidImage(String url) {
        try {
            if(!isValidURL(url)) return false;
            if(getImageFormatFromUrl(url) == null) return false;
            if(!isSupportedFormat(Objects.requireNonNull(getImageFormatFromUrl(url)))) return false;
            ImageIO.read(new URL(url));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
