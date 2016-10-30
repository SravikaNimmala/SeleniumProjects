package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
	driver.get("http://spicejet.com");
	WebElement element1 = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"));
	Select dropdown = new Select(element1);
	dropdown.selectByIndex(4);
	dropdown.selectByVisibleText("8 Adults");
	dropdown.selectByValue("9");
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	//driver.close();

	}

}
