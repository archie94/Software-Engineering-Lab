package Class;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class Child1Test extends TestCase{

	Child1 child1;
	Parent1 parent1;
	Parent1 parent2;
	@Before
	public void setUp() throws Exception {
		child1 = new Child1(5,10);
		parent1 = new Parent1(5,10);
		parent2 = new Child1(5,10);
	}

	@Test
	public void testArithmatic1() {
		assertEquals(50, child1.arithmatic());
	}
	@Test
	public void testArithmatic2() {
		assertEquals(15, parent1.arithmatic());
	}
	@Test
	public void testArithmatic3() {
		assertEquals(50, parent2.arithmatic());
	}

}