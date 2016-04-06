package Practice;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.*;

public class FileSizeTest extends TestCase {

	public FileSizeTest(String testName) {
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
	public void testGetFileSizePresent() {
		assertTrue(FileSize.getFileSize("/home/arka/workspace/greedy.pdf") > 0);
	}
	
	@Test
	public void testGetFileSizeAbsent() {
		assertTrue(FileSize.getFileSize("/home/arka/workspace/mst.pdf") < 0);
	}

}
