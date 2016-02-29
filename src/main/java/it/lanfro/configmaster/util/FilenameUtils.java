package it.lanfro.configmaster.util;

public class FilenameUtils {

	private static final int NOT_FOUND = -1;
	private static final char EXTENSION_SEPARATOR = '.';
	private static final char UNIX_SEPARATOR = '/';
	private static final char WINDOWS_SEPARATOR = '\\';
	
	public static String getExtension(final String filename) {
		if (filename == null) {
		    return null;
		}
		final int index = indexOfExtension(filename);
		if (index == NOT_FOUND) {
			return "";
	    } else {
	        return filename.substring(index + 1);
	    }
	}
	
	public static int indexOfExtension(final String filename) {
	    if (filename == null) {
	        return NOT_FOUND;
	    }
	    final int extensionPos = filename.lastIndexOf(EXTENSION_SEPARATOR);
	    final int lastSeparator = indexOfLastSeparator(filename);
	    return lastSeparator > extensionPos ? NOT_FOUND : extensionPos;
	}
	
	public static int indexOfLastSeparator(final String filename) {
        if (filename == null) {
            return NOT_FOUND;
        }
        final int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        final int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }
	
}
