package Class;

/**
 * 
 * @author nitdgp
 * @version 23 February 2016
 */
public class StringTypes {

	/**
	 * Compare length of string and string buffer object
	 * @param string
	 * @param stringBuffer
	 * @return
	 */
	public static int lengthCompare(String string, StringBuffer stringBuffer ) {
		System.out.println(stringBuffer.length() + " " + string.length());
		return stringBuffer.length() - string.length();
	}
	/**
	 * Compare appending of String and StringBuffer
	 * @param string
	 * @param stringBuffer
	 * @return
	 */
	public static int appendCompare(String string, StringBuffer stringBuffer){
		String var1 = "Appended" ;
		string = string + var1;
		stringBuffer = stringBuffer.append(var1);
		return lengthCompare(string, stringBuffer);
	}
}