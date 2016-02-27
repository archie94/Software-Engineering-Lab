package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;


public class ChildTest extends TestCase {

	double testRadius;
	public ChildTest(String testName){
		super(testName);
	}
	@Before
	public void setUp() throws Exception {
		testRadius = 7.0;
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test info() method of Child
	 */
	@Test
	public void testInfo() {
		new Child().info();
	}

	/**
	 * test volume() method of Child
	 */
	@Test
	public void testVolume() {
		double retVal = 1078.0;
		Child.radius = testRadius;
		double ret = Child.volume();
		assertEquals( retVal, ret);
	}

}