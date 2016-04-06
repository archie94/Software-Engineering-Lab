package Practice;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.*;

public class StringCreationComparisionTest extends TestCase{
	

	public StringCreationComparisionTest(String testName) {
		super(testName);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompare() {
		long result = StringCreationComparision.compare();
		assertTrue(result > 0);
	}

}
