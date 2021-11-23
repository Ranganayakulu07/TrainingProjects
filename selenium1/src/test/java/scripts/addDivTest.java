package scripts;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

//Ignore class level
@Ignore
public class addDivTest {
	addDiv calcu=new addDiv();
	
	//Ignore method level
	@Ignore
	@Test
	public void addingTest() {
		assertEquals(10,calcu.add(5,5));
		}
	@Test
	public void addTest() {
		assertEquals(10,calcu.add(5,5));
		}
	//Synchronization
	@Test(timeout=1000)
	public void adding() {
		int i = 1;
        while (i <= 1) {
            System.out.println("Hello World");
        }
		}
	
	//Exception handling
	@Test(expected=Exception.class)
	public void divTest() {
		int a = 10, b = 0;
        int c = a/b;  // cannot divide by zero
        System.out.println ("Result = " + c);
		}
	
}


