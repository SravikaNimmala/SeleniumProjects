package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class I_SenchaDocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver sencha = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\selenium-2.48.2\\IEDriverServer.exe");
		//WebDriver sencha = new InternetExplorerDriver();
		sencha.manage().window().maximize();
		sencha.get("http://localhost/extjs-4.1.1/examples/form/dynamic.html");
		
		
		//Form 1- Very Simple
		WebElement firstName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[1]/tr/td[2]/input"));
		firstName.sendKeys("Harry");
		WebElement lastName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[2]/tr/td[2]/input"));
		lastName.sendKeys("Potter");
		WebElement company = sencha.findElement(By.xpath("//div[@id='simpleForm']/div[2]/table/tbody[3]/tr/td[2]/input"));
		company.sendKeys("Hogwarts");
		WebElement email = sencha.findElement(By.xpath("//div[@id='simpleForm']/div[2]/table/tbody[4]/tr/td[2]/input"));
		email.sendKeys("harry.potter@hogwarts.edu");
		WebElement dob = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[5]/tr/td[2]/table/tbody/tr/td/input"));
		dob.sendKeys("03/10/2015");
		WebElement age = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[6]/tr/td[2]/table/tbody/tr/td[1]/input"));
		age.sendKeys("22");
		WebElement time = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[7]/tr/td[2]/table/tbody/tr/td[1]/input"));
		time.sendKeys("5:45 PM");
		sencha.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/em/button/span[1]")).click();
		
		//Form 2- Adding Fieldsets
		WebElement userInformation = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[1]/legend/table/tbody/tr/td[2]/input"));
		userInformation.click();
		userInformation.click();
		WebElement homePh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[1]/tbody/tr/td[2]/input"));
		homePh.clear();homePh.sendKeys("(123) 456 7890");
		WebElement businessPh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[2]/tbody/tr/td[2]/input"));
		businessPh.sendKeys("(111) 222 3456");
		WebElement mobilePh = sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[3]/tbody/tr/td[2]/input"));
		mobilePh.sendKeys("(111) 222 3456");
		sencha.findElement(By.xpath("html/body/div[3]/div[2]/fieldset[2]/div/table[4]/tbody/tr/td[2]/input")).sendKeys("None");
		sencha.findElement(By.xpath("html/body/div[3]/div[3]/div/div/div[1]/em/button/span[1]")).click();
		
		// Form 5-... and forms can contain TabPanel(s)
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
