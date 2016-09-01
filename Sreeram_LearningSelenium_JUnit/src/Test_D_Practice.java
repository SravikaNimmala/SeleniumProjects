import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class Test_D_Practice {
	//System.setProperty("webdriver.ie.driver", "C:\\selenium-2.48.2\\IEDriverServer.exe");
	static WebDriver bofa = new FirefoxDriver();
	@BeforeClass
	public static void bofa(){
		bofa.manage().window().maximize();
		bofa.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
	}
	@AfterClass
	public static void closeWindow(){
		bofa.quit();
		
	}
	@Test
	public void logIn() {
		WebElement logIn = bofa.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[1]/div/div/form/div[1]/input[9]"));
		logIn.sendKeys("harry"); String id = logIn.getAttribute("value");
		Assert.assertEquals(id, "harry");
		WebElement pass = bofa.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
		pass.sendKeys("potter");
		}
	@Test
	public void pass(){
		 
		WebElement signIn = bofa.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[1]/div/div/form/a[2]/span"));
		signIn.click();
	}
}
