/**
 *  Filename : Quadratic.java
 */

package Class;
/**
 * Class Quadratic provides a static method which gives the nature of roots of quadratic equation
 * @author Arka Prava Basu
 * @version 18 February 2016
 */
public class Quadratic {

	/**
	 * method findDeterminantNature() gives us the nature of roots of quadratic equation
	 * @param coeffA
	 * @param coeffB
	 * @param coeffC
	 * @return an integer indicating nature of roots
	 */
	public static int findDiscriminantNature(double coeffA, double coeffB, double coeffC){
		double discriminant = (coeffB*coeffB) - (4*coeffA*coeffC);
		if(discriminant == 0.0) {
			System.out.println("Real and equal roots");
			return 0;
		} else if(discriminant > 0.0) {
			System.out.println("Real and unequal roots");
			return 1;
		} else {
			System.out.println("Imaginary roots");
			return -1;
		}
	}
}
