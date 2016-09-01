//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test_B_FacebookTest {

	@Test
	public void fb1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
		id.sendKeys("Harry");
		String id_login = id.getAttribute("value");
		Assert.assertEquals(id_login, "Harry");
		WebElement pass = driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input"));
		pass.sendKeys("123456");
		String pass_login = pass.getAttribute("value");
		Assert.assertEquals(pass_login, "123456");
		driver.quit();
	}
	@Test
	public void fb2(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/input"));
		firstName.sendKeys("Harry");
		WebElement lastName = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[2]/div/div/input"));
		lastName.sendKeys("Potter");
		//WebElement email = driver.findElement(By.xpath("//div[@id='u_0_e']/div/input"));
		//email.sendKeys("harry.potter@hogwarts.com");
		WebElement reenter = driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input"));
		reenter.sendKeys("harry.potter@hogwarts.com");
		WebElement newPass = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[4]/div/div/input"));
		newPass.sendKeys("griffindor");
		String newpass = newPass.getAttribute("value");
		Assert.assertEquals(newpass, "griffindor");
		
		
	}

}
