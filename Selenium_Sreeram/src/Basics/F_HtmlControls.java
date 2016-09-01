package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class F_HtmlControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wampserver = new FirefoxDriver();
		wampserver.manage().window().maximize();
		wampserver.get("http://localhost/htmlcontrols/preview.html");
		//First Name
		WebElement firstName = wampserver.findElement(By.xpath("html/body/form/div[1]/div/div[3]/div[2]/input"));
		firstName.sendKeys("Harry");
		//Last Name
		WebElement lastName = wampserver.findElement(By.id("item7_text_1"));
		lastName.sendKeys("Potter");
		//Age
		WebElement age = wampserver.findElement(By.xpath("//input[@id='item28_number_1']"));
		age.sendKeys("25");
		// Get Attributes by value and class
		String returnValue = age.getAttribute("value");
		System.out.println(returnValue);
		String returnClass = age.getAttribute("class");
		System.out.println(returnClass);
		/*
		 * Gender pick
		 */
		wampserver.findElement(By.xpath("html/body/form/div[1]/div/div[8]/div[2]/label[1]/input")).click();
		/*
		 * Select TimeZone and Country by Select()
		 */
		WebElement country = wampserver.findElement(By.xpath("//div[@id='item21']/div[2]/select"));
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("United Kingdom");
		
		WebElement timeZone = wampserver.findElement(By.xpath("//div[@id='item22']/div[2]/select"));
		Select selectTimeZone = new Select(timeZone);
		selectTimeZone.selectByVisibleText("(0) Dublin, London, Monrovia, Casablanca");
		/*
		 * To select multiple values
		 * attribute "multiple" is specified in
		 * <select>, means we can select multiple
		 * values 
		 */
		WebElement multipleMonths = wampserver.findElement(By.id("item47_select_1"));
		Select selectMultipleMonths = new Select(multipleMonths);
		boolean isMultiple = selectMultipleMonths.isMultiple();
		System.out.println(isMultiple);
		selectMultipleMonths.deselectAll();
		selectMultipleMonths.selectByIndex(2);
		selectMultipleMonths.selectByValue("May");
		selectMultipleMonths.selectByVisibleText("December");
		/*
		 * Date picker, for loops and etc. in next classes
		 */
		/*
		 * Quiz:
		 * 1)How do we see the current status of Radio Button?
		 * 	 Which API we use?
		 * 		isSelected()= returns a boolean
		 * 		Same API applies for check box.
		 * 2)Select a particular value from a drop down?
		 * 		Find the select control id, and store in a webElement
		 * 		Create an object for a Select class
		 *		Then we can use selectByValue();
		 *						selectByVisibleText();
		 *						selectByValue();
		 *3) Get a value from an input control? What API?
		 *		String returnValue = getAttribute("value")
		 *4) How to maximize?
		 *		wampserver.manage().window().maximize();
		 *
		 */
		
	}

}
