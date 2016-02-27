package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class MultipleCatchTest extends TestCase {

	int[] testArray;
	int textDivisor;
	public MultipleCatchTest(String testName){
		super(testName);
	}
	/**
	 * method to set test values 
	 */
	@Before
	public void setUp() throws Exception {
		testArray = new int[]{1,2,3,4,5};
		textDivisor = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * method to test first catch block
	 */
	@Test
	public void testDemoCatch1() {
		int firstCatch = 1;
		int catchVal = MultipleCatch.demoCatch( testArray, textDivisor);
		assertEquals( firstCatch, catchVal);
	}
	/**
	 * method to test second catch block
	 */
	@Test
	public void testDemoCatch2() {
		int firstCatch = 2;
		int catchVal = MultipleCatch.demoCatch( testArray, 2);
		assertEquals( firstCatch, catchVal);
	}

}