package Practice;

import java.io.File;

/**
 * Find the file size of a user given file path
 * @author arka
 * @version 6 April 2016
 */
public class FileSize {

	public static long getFileSize(String path) {
		File file = new File(path);
		if( file.exists()) { // check if file exists 
			return file.length();
		}
		return -99; // return -99 if file is not present
	}
}
