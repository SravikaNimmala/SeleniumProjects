package Basics;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Q_Test_JUnit_Addition {
	@Before
	public void setup()
	{
		System.out.println("Before method");
	}

	@Test
	@Ignore
	public void testAdd() {
		
		Q_JUnit_Addition a = new Q_JUnit_Addition();
		int c = a.add(10, 20);
		Assert.assertEquals(c, 40);
		System.out.println("Test case 1");
		
	}
	
	@Test(timeout = 3000)
	public void testAdd_01() throws InterruptedException {
		
		Q_JUnit_Addition a = new Q_JUnit_Addition();
		Thread.sleep(3005);
		int c = a.add(-10, -20);
		Assert.assertEquals(c, -30);
		System.out.println("Test case 2");
	}
	@Test
	public void testAdd_02() {
		
		Q_JUnit_Addition a = new Q_JUnit_Addition();
		int c = a.add(-100, 20);
		Assert.assertEquals(c, -80);
		System.out.println("Test case 3");
	}

}
