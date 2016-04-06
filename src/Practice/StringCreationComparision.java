package Practice;
/**
 * Class to compare performance of two strings created in different ways
 * @author arka
 * @version 6 April 2016
 */
public class StringCreationComparision {

	/**
	 * Create string by simple initialisation
	 * @return : the time required for creation
	 */
	public static long createString() {
		long startTime = System.nanoTime();
		String name = "Arka";
		long endTime = System.nanoTime();
		System.out.println("Normal creation = " + (endTime - startTime));
		return endTime - startTime;
	}
	
	/**
	 * Create string by creating a String Object
	 * @return : the time required for creation
	 */
	public static long createStringObject() {
		long startTime = System.nanoTime();
		String name = new String("Arka");
		long endTime = System.nanoTime();
		System.out.println("Object creation = " + (endTime - startTime));
		return endTime - startTime;
	}
	
	/**
	 * Compare the creation time of two strings
	 * @return : the difference of creation time
	 */
	public static long compare() {
		return createStringObject() - createString();
	}
}
