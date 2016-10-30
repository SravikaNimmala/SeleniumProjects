package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	//Some Alerts are in HTML and others in Java,
	//For HTML we can directly spy on the popup elements ans use xpath and .click() to use them.
	//For java popups we need to change them to, or switchTo(), alert() and use appropriate methods for the functions
	//.accept(),.dismiss(),.sendKeys(),.getText() are the different alert methods we used in the below code.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		System.out.println(driver.switchTo().alert().getText());//Prints out whatever the text says in the pop up box
	//	driver.switchTo().alert().sendKeys("abcd");//Enter into something into the pop up
		driver.switchTo().alert().accept();//To click on yes we use .accept()
		//driver.switchTo().alert().dismiss();//If there are two options.[YES/NO].Dismiss selects NO
		
	}

}
