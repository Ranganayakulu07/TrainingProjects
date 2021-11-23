package scripts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import scripts.calculator1Test;

public class calculator1Test {
	calculator1 calc=new calculator1();
	//Before method
	@Before
	public void before() {
		System.out.println("before method");
	}
	
	//After method
	@After
	public void after() {
		System.out.println("After method");
	}
//assert statements	
	//assertEqual
	@Test
	public void testSubEqual() {
		assertEquals(10,calc.sub(15,5));
		
	}
	//assertSame
	@Test
	public void testSubSame() {
		assertSame(10,calc.sub(15,5));
		
	}
	//assertNotSame
	@Test
	public void testSubNotSame() {
		assertNotSame(10,calc.sub(14,5));
		
	}
	//assertNotNull
	@Test
	public void testSubNotNull() {
		assertNotNull(calc.sub(15,5));
		
	}
	//assertNull
	@Test
	public void testSubNull() {
		assertNull(calc.str);
		
	}
	//assertTrue
	@Test
	public void testSubTrue() {
		assertTrue(10<calc.sub(25,5));
		
	}
	//assertFalse
	@Test
	public void testSubFalse() {
		assertFalse(10>calc.sub(15,2));
		
	}
	
	//assertEqual
	
	@Test
	public void testMulEqual() {
		assertEquals(10, calc.mul(2,5));
		
	}
	
	//assertSame
	@Test
	public void tesmulSame() {
		assertSame(10,calc.mul(2,5));
		
	}
	//asserNotSame
	@Test
	public void testmulNotSame() {
		assertNotSame(10,calc.sub(5,5));
		
	}
	//assertNotNull
	@Test
	public void testMulNotNull() {
		assertNotNull(calc.mul(15,5));
		
	}
	//asserNUll
	@Test
	public void testmulNull() {
		assertNull(calc.str);
		
	}
	//assertTrue
	@Test
	public void testmulTrue() {
		assertTrue(10<calc.mul(15,5));
		
	}
	//assertFalse
	@Test
	public void testmulfalse() {
		assertFalse(10<calc.mul(5,1));
		
	}
}

