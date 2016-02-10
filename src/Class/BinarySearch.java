/*
 * Filename : BinarySearch.java
 */

package Class;

import java.util.*;
/*
 * The BinarySearch class provides a static method binarySearch for 
 * searching an integer in a sorted / unsorted array of integers
 * @author : Arka Prava Basu
 * @version 10 February 2016
 */
public class BinarySearch {
	/*
	 * The binarySearch() method reads from the array of integers and then searches 
	 * for the key in that array
	 * @param : array_int[] : the array of integers
	 * @param : array_size_int : the size of the array
	 * @param : key_int : the key to be searched 
	 * @output : displays the result of search with displayResult() method
	 */
	public static void binarySearch(int[] array_int,int array_size_int, int key_int){
		int start_int = 0;
		int end_int = array_size_int-1;
		int middle_int;
		/*
		 * Sort the user given array
		 */
		Arrays.sort(array_int);
		/*
		 * The key is present in array_int[start_int .. end_int] or not present
		 */
		while(start_int <= end_int){
			middle_int = (start_int+end_int)/2;
			if(array_int[middle_int] == key_int){
				displayResult(middle_int); //  display result with middle_int as resultCode
				return;
			}
			else if(key_int > array_int[middle_int]){
				start_int = middle_int+1;
			}
			else{
				end_int = middle_int-1;
			}
		}
		if(start_int > end_int){
			displayResult(-1);// display result .. -1 as resultCode to signify search failure 
		}
	}
	/*
	 * The displayResult() displays the result of search
	 * @param : resultCode_int : the result code which signifies the success of search
	 * @input : none
	 * @output : Displays the result of search
	 */
	public static void displayResult(int resultCode_int){
		if(resultCode_int == -1){
			System.out.println("Not found");
		}else {
			System.out.println("Found at pos "+(resultCode_int+1));
		}
	}
}
