package Class;

import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SplitNamesAppletTest extends TestCase {

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
	public void test() {
		SplitNamesApplet.name = "Arka Prava Basu";
		boolean result = SplitNamesApplet.getSplitName();
		assertEquals( true, result);
	}

}
