package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class BinarySearchTest extends TestCase{
	private int array_size_int;
	private int array_int[];
	private int key_int;

	public BinarySearchTest(String testName){
		super(testName);
	}
	@Before
	public void setUp() throws Exception {
		super.setUp();
		array_size_int = 5;
		array_int = new int[array_size_int];
		array_int[0] = 15;
		array_int[1] = 25;
		array_int[2] = 5;
		array_int[3] = 75;
		array_int[4] = 42;
		
		key_int = 25;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBinarySearchSuccess() {
		int searchResult = 1;
		int result = BinarySearch.binarySearch(array_int, array_size_int, key_int);
		assertEquals(searchResult, result);
	}
	
	public void testBinarySearchFail(){
		int searchResult = 1;
		int result = BinarySearch.binarySearch(array_int, array_size_int, 10);
		assertNotSame(searchResult, result);
	}
}
