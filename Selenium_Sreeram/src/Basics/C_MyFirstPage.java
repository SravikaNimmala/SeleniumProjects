package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_MyFirstPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("www.hotmail.com");
		//WebElement element1 = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div[2]/div[1]/a"));
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[1]/a")).click();
		//element1.click();
	}

}
