package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class claculatorTest {
	claculator calc=new claculator();
	@Test
	public void testAdd() {
		Assert.assertEquals(10,calc.add(5, 5));
		
	}
	
	@Test
	public void testSub() {
		Assert.assertNotEquals(5,calc.sub(15, 5));
		
	}
	
	@Test
	public void testMul() {
		Assert.assertEquals(10,calc.mul(2, 5));
		
	}
	
	@Test
	public void testDiv() {
		Assert.assertEquals(1,calc.div(5, 5));
		
	}

}
