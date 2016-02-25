import static org.junit.Assert.*;
import org.junit.Test;

public class RootsTest {

//	@Test
//	public void testRoots_TC_1() {
//		Roots testRoots = new Roots(0,0,0);
//		assertEquals(1, testRoots.getNumRoots());
//		assertEquals(0, testRoots.getRootOne(), 10);
//		assertEquals(0, testRoots.getRootTwo(), 10);
//	}

	@Test
	public void testRoots_TC_1_1() {
		Roots testRoots = new Roots(0,0,0);
		assertEquals(0, testRoots.getNumRoots());
		assertEquals(-1, testRoots.getRootOne(), 10);
		assertEquals(-1, testRoots.getRootTwo(), 10);
	}

	@Test
	public void testRoots_TC_1_2() {
		Roots testRoots = new Roots(1,0,0);
		assertEquals(1, testRoots.getNumRoots());
		assertEquals(0, testRoots.getRootOne(), 10);
		assertEquals(0, testRoots.getRootTwo(), 10);
	}

	@Test
	public void testRoots_TC_2() {
		Roots testRoots = new Roots(1,1,0);
		assertEquals(2, testRoots.getNumRoots());
		assertEquals(0, testRoots.getRootOne(), 10);
		assertEquals(-1, testRoots.getRootTwo(), 10);
	}

	@Test
	public void testRoots_TC_3() {
		Roots testRoots = new Roots(0,1,1);
		assertEquals(0, testRoots.getNumRoots());
		assertEquals(-1, testRoots.getRootOne(), 10);
		assertEquals(-1, testRoots.getRootTwo(), 10);
	}

}
