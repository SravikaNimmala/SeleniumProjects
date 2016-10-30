package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver2 = new FirefoxDriver();
driver2.get("http://gmail.com");
driver2.findElement(By.xpath(" .//*[@id='Email']")).sendKeys("sravika.nimmala@g.austincc.edu");
driver2.findElement(By.name("signIn")).click();
driver2.findElement(By.name("Passwd")).sendKeys("texic@n63");
driver2.findElement(By.xpath(".//*[@id='signIn']")).click();

	}

}
