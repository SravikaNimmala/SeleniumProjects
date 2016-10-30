package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sravi.nimmala@gmail.com");
//driver.findElement(By.name("pass")).sendKeys("123456");
driver.findElement(By.linkText("Forgot your password?")).click();
//driver.findElement(By.partialLinkText("Forgot your")).click();
//driver.findElement(By.xpath(".//*[@id='u_0_x']")).click();

	}

}
