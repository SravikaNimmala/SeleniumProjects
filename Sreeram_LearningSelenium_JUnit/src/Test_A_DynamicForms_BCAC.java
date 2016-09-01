import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test_A_DynamicForms_BCAC{
	static WebDriver sencha = new FirefoxDriver(); // Now this is a global method and must be static.
	@BeforeClass
	public static void beforeClass(){
		sencha.get("http://localhost/extjs-4.1.1/examples/form/dynamic.html");
		sencha.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass(){
		sencha.quit();
	}
	@Test
	public void form1() {
		WebElement firstName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[1]/tr/td[2]/input"));
		firstName.sendKeys("Harry");
		//Verify step 1:
		String fName = firstName.getAttribute("value");
		Assert.assertEquals(fName, "Harry");
		//System.out.println(fName);
		WebElement lastName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[2]/tr/td[2]/input"));
		lastName.sendKeys("Potter"); 
		String lName = lastName.getAttribute("value");
		Assert.assertEquals(lName, "Potter");
		//System.out.println(lName);
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
	@Test
	public void form2(){
		WebElement userInformation = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[1]/legend/table/tbody/tr/td[2]/input"));
		userInformation.click();
		userInformation.click();
		WebElement homePh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[1]/tbody/tr/td[2]/input"));
		homePh.clear();homePh.sendKeys("(123) 456 7890");
		String hPh = homePh.getAttribute("value");
		Assert.assertEquals(hPh, "(123) 456 7890");
		WebElement businessPh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[2]/tbody/tr/td[2]/input"));
		businessPh.sendKeys("(111) 222 3456");
		WebElement mobilePh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[3]/tbody/tr/td[2]/input"));
		mobilePh.sendKeys("(111) 222 3456");
		sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[4]/tbody/tr/td[2]/input")).sendKeys("None");
		sencha.findElement(By.xpath("html/body/div[3]/div[3]/div/div/div[1]/em/button/span[1]")).click();
		
	}
	@Test
	public void form3(){
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/div/div/div[1]/table[1]/tbody/tr/td[1]/input")).sendKeys("Harry");
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/div/div/div[2]/table[1]/tbody/tr/td[1]/input")).sendKeys("Potter");
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/div/div/div[1]/table[2]/tbody/tr/td[1]/input")).sendKeys("Hogwarts");
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/div/div/div[2]/table[2]/tbody/tr/td[1]/input")).sendKeys("harry.potter@hogwarts.edu");
			//Tab 1
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/em/button/span[1]")).click();
			WebElement fName = sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div/div/table[1]/tbody/tr/td[1]/input"));
			fName.clear(); fName.sendKeys("Harry");
			WebElement lName = sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div/div/table[2]/tbody/tr/td[1]/input"));
			lName.clear(); lName.sendKeys("Potter");
			WebElement compName = sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div/div/table[3]/tbody/tr/td[1]/input"));
			compName.clear(); compName.sendKeys("Hogwarts");
			String cName = compName.getAttribute("value");
			Assert.assertEquals(cName,"Hogwarts");
			sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div/div/table[4]/tbody/tr/td[1]/input")).sendKeys("harry.potter@hogwaarts.edu");
			//Tab 2
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[2]/em/button/span[1]")).click();
			WebElement hPh = sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[2]/div/table[1]/tbody/tr/td[1]/input"));
			hPh.clear(); hPh.sendKeys("(123) 456 7890");
			sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[2]/div/table[2]/tbody/tr/td[1]/input")).sendKeys("(111) 222 3456");
			sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[2]/div/table[3]/tbody/tr/td[1]/input")).sendKeys("(111) 222 3456");
			sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[2]/div/table[4]/tbody/tr/td[1]/input")).sendKeys("None");
			//Tab 3
		sencha.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[3]/em/button/span[1]")).click();
		sencha.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div[1]/em/button/span[1]")).click();
	}

}
