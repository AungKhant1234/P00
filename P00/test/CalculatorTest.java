import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = 5;
		int b = 3;
		
		Calculator c = new Calculator();
		int actual = c.subtract(a, b);
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		int a = 6;
		int b = 2;
		Calculator c = new Calculator();
		int actual = c.divide(a, b);
		int expected = 3;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple() {
		int a = 2;
		int b = 3;
		Calculator c = new Calculator();
		int actual = c.multiple(a, b);
		int expected = 6;
		assertEquals(expected, actual);
	}
	@Test
	public void testToThePowerOf() {
		int a = 2;
		int b = 3;
		Calculator c = new Calculator();
		int actual = c.toThePowerOf(a, b);
		int expected = 8;
		assertEquals(expected, actual);
	}
}
