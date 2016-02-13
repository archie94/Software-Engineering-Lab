package Class;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
public class MathTest extends TestCase{

	private int value1;
	private int value2;
	public MathTest(String testName){
		super(testName);
	}
	@Before
	public void setUp() throws Exception {
		super.setUp();
		value1 = 3;
		value2 = 5;
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		value1 = 7;
		value2 = 5;
	}

	@Test
	public void testAdd() {
		int total = 8;
		int sum = Calculator.add(value1, value2);
		assertEquals(sum, total);
	}
	
	public void testAddFailed(){
		int total = 9;
		int sum = Calculator.add(value1, value2);
		assertNotSame(sum, total);
	}

	@Test
	public void testSub() {
		int total = 0;
		int sub = Calculator.sub(4, 4);
		assertEquals(sub, total);
	}

}
