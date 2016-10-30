package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		Actions act=new Actions(driver);// act will have capabilities of both driver and Actions
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		act.moveToElement(element).build().perform();
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		act.keyDown(Keys.SHIFT).moveToElement(element2).sendKeys("harry potter").build().perform();
		act.contextClick(element2).build().perform();
	}

}
