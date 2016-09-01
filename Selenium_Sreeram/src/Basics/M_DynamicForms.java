package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M_DynamicForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver sencha = new FirefoxDriver();
		sencha.get("http://localhost/extjs-4.1.1/examples/form/dynamic.html");
		sencha.manage().window().maximize();
		WebElement firstName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[1]/tr/td[2]/input"));
		firstName.sendKeys("Harry");
		//Verify step 1:
		String fName = firstName.getAttribute("value");
		System.out.println(fName);
		WebElement lastName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[2]/tr/td[2]/input"));
		lastName.sendKeys("Potter");
		String lName = lastName.getAttribute("value");
		System.out.println(lName);
		WebElement company = sencha.findElement(By.xpath("//div[@id='simpleForm']/div[2]/table/tbody[3]/tr/td[2]/input"));
		company.sendKeys("Hogwarts");
		WebElement email = sencha.findElement(By.xpath("//div[@id='simpleForm']/div[2]/table/tbody[4]/tr/td[2]/input"));
		email.sendKeys("harry.potter@hogwarts.edu");
		WebElement age = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[6]/tr/td[2]/table/tbody/tr/td[2]/div"));
		for(int i = 1; i<=22; i++)
		{
			age.click();
		}
		WebElement timePicker = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[7]/tr/td[2]/table/tbody/tr/td[2]/div"));
		timePicker.click();
		int timeOptions= sencha.findElements(By.xpath("html/body/div[8]/div/ul/li")).size();
		System.out.println(timeOptions);
		String userTime="11:00 AM";
		for(int j=1;j<=timeOptions; j++)
		{
			String times = sencha.findElement(By.xpath("html/body/div[8]/div/ul/li["+j+"]")).getText();
			//System.out.println(times);
			if(times.equals(userTime))
			{
				sencha.findElement(By.xpath("html/body/div[8]/div/ul/li["+j+"]")).click();
			}
		}
		
	}

}
