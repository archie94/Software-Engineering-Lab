package Practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.*;

public class FibonacciSeriesTest extends TestCase{
	

	public FibonacciSeriesTest(String testName) {
		super(testName);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindFibonacciNumbers() {
		Integer[] otherList = new Integer[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		List<Integer> testList = new ArrayList<>();
		testList.addAll(Arrays.asList(otherList));
		assertEquals( testList, new FibonacciSeries(10).findFibonacciNumbers());
	}

}
