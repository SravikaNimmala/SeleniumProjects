package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	//Different methods we use for validation
	//isDisplayed() is a boolean method that can be used to check if a certain element is present or not after performing a task.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		System.out.println(" Before clicking on Multi city Radio Button");
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']/span[3]")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println(" After clicking on Multi city Radio Button");
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']/span[3]")).isDisplayed());
	}

}
