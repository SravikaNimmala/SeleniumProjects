import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class A_TextFixturesExamples {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("I will be executed only once and before Before class");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("I will be executed only once and after After class");
		
	}
	@Before
	public void before(){
		System.out.println("I will be executed before every test case.");
	}
	@After
	public void after(){
		System.out.println("I will be executed after every test case.");
	}
	@Test
	public void simpleTest(){
		System.out.println("Simple Test");
		
	}
	@Test
	public void NormalTest(){
		System.out.println("Normal Test");
	}
	
	@Test
	public void BitCompleTest(){
		System.out.println("Bit Complex Test");
		
	}
	@Test
	public void ComplexTest(){
		System.out.println("Complex Test");
	}
}
