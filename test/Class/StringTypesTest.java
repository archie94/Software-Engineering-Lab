package Class;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StringTypesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test length() of String and StringBuffer
	 */
	@Test
	public void test1() {
		int result = 4;
		int retVal = StringTypes.lengthCompare("Arka", new StringBuffer("Arkaarka"));
		assertEquals( result, retVal);
	}
	/**
	 * test appending of String and StringBuffer
	 */
	@Test
	public void test2() {
		int result = 0;
		int retVal = StringTypes.lengthCompare("", new StringBuffer(""));
		assertEquals( result, retVal);
	}

}