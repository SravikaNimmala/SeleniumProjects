package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/input")).sendKeys("Sravika");
//driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
