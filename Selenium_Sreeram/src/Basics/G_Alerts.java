package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_Alerts {
	/*
	 * ALERT:
	 * If there are any alerts present,
	 * first we need to switch to the alert
	 * by creating an object using Alert class
	 * and performing the switchTo() on the object.
	 * To accept[OK] the alert, we use .accept();
	 * If there is a span alert, meaning there
	 * is an alert within an alert we have to 
	 * switchTo() that alert by creating an other
	 * alert object.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/htmlcontrols/preview.html");
		//Alert:
		WebElement alert1 = driver.findElement(By.xpath("//div[@id='item57_div_0']/input"));
		alert1.click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept(); //alt.dismiss();

		//Confirm [with span alert(alert within an alert)]:
		WebElement confirm1 = driver.findElement(By.xpath("html/body/form/div[1]/div/div[33]/div/div/input"));
		confirm1.click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.dismiss();
		Alert spanAlert = driver.switchTo().alert();
		System.out.println(spanAlert.getText());
		spanAlert.accept();
		
		//Prompt[with send keys]:
		WebElement prompt1 = driver.findElement(By.xpath("//div[@id='item56_div_0']/input"));
		prompt1.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Harry");
		prompt.accept();
		System.out.println(prompt.getText());
		Alert spanAlert2 = driver.switchTo().alert();
		spanAlert2.accept();
		
		/*
		 * Every time we need to operate on an alert
		 * we need to switch to that alert
		 * .accept()=OK , .dismiss()=cancel
		 * .getText()=To get the text of the alert box
		 * .sendKeys()= To send text.
		 */
		
		
		
	}

}
