package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_TwitterLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver twitter = new FirefoxDriver();
		twitter.get("http://www.twitter.com");
		twitter.manage().window().maximize();
		twitter.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[2]/button")).click();
		WebElement email = twitter.findElement(By.xpath("//div[@class='LoginDialog-form']/form/div[1]/input"));
		email.sendKeys("sravika");
		WebElement pass = twitter.findElement(By.xpath("//div[@class='LoginDialog-form']/form/div[2]/input"));
		pass.sendKeys("abcdefg");
		twitter.findElement(By.xpath("//div[@class='LoginDialog-form']/form/input")).click();
	}

}
