package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_Checkout{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium-2.48.2\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium")
		
		
		WebDriver checkout = new FirefoxDriver();
		checkout.manage().window().maximize();
		
		//checkboxes
		checkout.get("http://localhost/extjs-4.1.1/examples/form/check-radio.html");
		WebElement animals = checkout.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/fieldset[1]/div/table[1]/tbody/tr/td[2]/input"));
		animals.sendKeys("Animals");
		for(int i=4;i<5;i++)
		{
			checkout.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/fieldset[1]/div/table["+i+"]/tbody/tr/td[2]/input")).click();
			//System.out.println(checkout.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/fieldset[1]/div/table["+i+"]/tbody/tr/td[2]/input")).isEnabled());
		}
		
		
		//Radio Buttons
		WebElement colors = checkout.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/fieldset[2]/div/table[1]/tbody/tr/td[2]/input"));
		colors.sendKeys("Colors");
		checkout.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/fieldset[2]/div/table[4]/tbody/tr/td[2]/input")).click();
		
		//For loop with count
		int count1 = checkout.findElements(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[2]/tr/td[2]/table/tbody/tr/td")).size();
		System.out.println(count1);
		for(int j=1;j<=count1;j++)
		{
			checkout.findElement(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[2]/tr/td[2]/table/tbody/tr/td["+j+"]/table/tbody/tr/td[2]/input")).click();
			
		}
		
		
		//Nested for loop
		int count2 = checkout.findElements(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[4]/tr/td[2]/table/tbody/tr/td")).size();
		for(int a=1;a<=count2;a++)
		{
			int count3 = checkout.findElements(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[4]/tr/td[2]/table/tbody/tr/td["+a+"]/table")).size();
			for(int b=1;b<=count3;b++)
			{
				checkout.findElement(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[4]/tr/td[2]/table/tbody/tr/td["+a+"]/table["+b+"]/tbody/tr/td[2]/input")).click();
			}
		}
		
		
		//Nested For(item1-item5)
		int count4 = checkout.findElements(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[5]/tr/td[2]/table/tbody/tr/td")).size();
		for(int a=1;a<=count4;a++)
		{
			int count5 = checkout.findElements(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[5]/tr/td[2]/table/tbody/tr/td["+a+"]/table")).size();
			for(int b=1;b<=count5;b++)
			{
				checkout.findElement(By.xpath("html/body/div/div/div[2]/fieldset[2]/div/table/tbody[5]/tr/td[2]/table/tbody/tr/td["+a+"]/table["+b+"]/tbody/tr/td[2]/input")).click();
			}
		}
		
	}

}
