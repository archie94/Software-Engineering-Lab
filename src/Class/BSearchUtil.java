/*
 * Filename : BinarySearch.java
 */
package Class;

import java.util.*;
/*
 * The BinarySearchUtil class provides a main method for implementing Binary Search 
 * in an array of integers
 * @author : Arka Prava Basu
 * @version 10 February 2016
 */
public class BSearchUtil extends BinarySearch{
	/*
	 * The main method takes a user defined array of integers and implements Binary Search 
	 * @input : array_int[] : the array of integers
	 * @input : array_size_int : the size of the array
	 * @input : key : the key to be searched 
	 */
	public static void main(String args[]){
		int[] array_int;
		int array_size_int;
		int key;
		/*
		 * Scanner class object for user input 
		 */
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size and then the integers in array followed by the element to be searched");
		array_size_int = input.nextInt();
		array_int = new int[array_size_int];
		for(int counter=0; counter<array_size_int; counter++){
			array_int[counter] = input.nextInt();
		}
		key = input.nextInt();
		
		binarySearch(array_int,array_size_int,key);
	}
}
