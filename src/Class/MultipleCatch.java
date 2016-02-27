package Class;
/**
 * Filename : MultipleCatch.java
 */
import java.util.*;
/**
 * Class to show handling of multiple catch statements
 * @author arka
 * @version 23 February 2016
 */
public class MultipleCatch {

	/**
	 * method to demonstrate a simple try catch block
	 * @return
	 */
	@SuppressWarnings("finally")
	public static int demoCatch(int[] array_int, int var1){
		int retVal = 0 ; 
		/**
		 * divide each element of array by var1
		 * try to print 6th element of array
		 * We can get ArithmeticException and ArrayIndexOutOfBoundsException here 
		 */
		try{
			for(int loopControl = 0; loopControl < 5 ;loopControl++)
				array_int[loopControl] /= var1;
			System.out.println(" 6th element is " + array_int[5]);
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception caught");
			retVal = 1;
		}catch(ArrayIndexOutOfBoundsException are) {
			System.out.println("Array index out of bounds");
			retVal = 2;
		}finally {
			System.out.println("Executing finally block");
			return retVal;
		}
	}
	/**
	 * driver method for demoCatch()
	 * @param args
	 */
	public static void main(String args[]) {
		int[] array_int = new int[5];
		int var1;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 elements ");
		for(int loopControl = 0; loopControl < 5 ;loopControl++)
			array_int[loopControl] = input.nextInt();
		System.out.println("Enter a number");
		var1 = input.nextInt();
		demoCatch( array_int, var1);
	}
}