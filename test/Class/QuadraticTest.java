package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
/**
 * A JUnit test case to test methods of Quadratic class
 * @author Arka Prava Basu
 * @version 18 February 2016
 */
public class QuadraticTest extends TestCase {

	private double coeffA;
	private double coeffB;
	private double coeffC;
	/**
	 * Constructor method 
	 * @param testName
	 */
	public QuadraticTest(String testName) {
		super(testName);
	}
	/**
	 * method to initialize test values
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		coeffA = 1.0;
		coeffB = 4.0;
		coeffC = 1.0;
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * test for Real and Unequal roots
	 */
	@Test
	public void testFindDiscriminantNatureUnequal() {
		int correctResult = 1;
		int result = Quadratic.findDiscriminantNature(coeffA, coeffB, coeffC);
		assertEquals( correctResult, result);
	}
	/**
	 * test for Real and Equal roots
	 */
	@Test
	public void testFindDiscriminantNatureEqual() {
		int correctResult = 0;
		int result = Quadratic.findDiscriminantNature(coeffA, 2.0, coeffC);
		assertEquals( correctResult, result);
	}	
	/**
	 * test for Imaginary roots
	 */
	@Test
	public void testFindDiscriminantNatureImaginary() {
		int correctResult = -1;
		int result = Quadratic.findDiscriminantNature(coeffA, 1.0, coeffC);
		assertEquals( correctResult, result);
	}
}
