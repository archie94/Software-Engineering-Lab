package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.*;

public class PallindromeStringsTest extends TestCase{

	public PallindromeStringsTest(String testName) {
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
	public void testCheckForPallindromes() {
		String[] strings = new String[] {"madam","racecar","car","abcba"};
		List<String> stringList = new ArrayList<String>();
		stringList.add(strings[0]);
		stringList.add(strings[1]);
		stringList.add(strings[2]);
		stringList.add(strings[3]);
		List<String> result = new ArrayList<String>();
		result.add("yes");
		result.add("yes");
		result.add("no");
		result.add("yes");
		assertEquals(result, PallindromeStrings.checkForPallindromes(stringList));
	}

}
