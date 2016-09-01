package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class E_FacebookLogIn {
	/*
	 * Create an object for every WebElement we need to find, such that we don't have to re type xpath 
	 *  //everytime we need to use the element.
	 * Check the xpath twice with the website before your use it.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
		id.sendKeys("Harry");
		WebElement pass = driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input"));
		pass.sendKeys("123456");
		//driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label")).click();
		WebElement firstName = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/input"));
		firstName.sendKeys("Harry");
		WebElement lastName = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[2]/div/div/input"));
		lastName.sendKeys("Potter");
		WebElement email = driver.findElement(By.xpath("//div[@id='u_0_e']/div/input"));
		email.sendKeys("harry.potter@hogwarts.com");
		WebElement reenter = driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input"));
		reenter.sendKeys("harry.potter@hogwarts.com");
		WebElement newPass = driver.findElement(By.xpath("//div[@id='reg_form_box']/div[4]/div/div/input"));
		newPass.sendKeys("griffindor");
		
		
		
		WebElement month = driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Mar");
		
		WebElement day = driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[5]/div[2]/span/span/select[2]"));
		Select selectDay = new Select(day);
		selectDay.selectByIndex(10);
		
		WebElement year = driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1993");
		
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[6]/span/span[2]/label")).click();
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[8]/button")).click();
		
	/*
		// If the values are/or in different sequence use byVisibletext.
		//
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByIndex(10); //selectByIndex is faster than byValue and byVisibleText
		// When listed in sequence, always use byIndex.
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1993");
		
		//driver.close();
		*/
	}

}
