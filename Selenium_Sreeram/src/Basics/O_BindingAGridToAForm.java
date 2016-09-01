package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class O_BindingAGridToAForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/extjs-4.1.1/examples/form/form-grid.html");
		driver.manage().window().maximize();
		int totalRows = driver.findElements(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div[3]/div/table/tbody/tr")).size();
		String userReq = "Microsoft"; // using .contains() we can use a sub string to locate the company name.
		for(int i=2;i<=totalRows; i++)
		{
			String compName = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[1]/div")).getText();
			System.out.println(compName);
			if(compName.contains(userReq))
			{
				driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[1]/div")).click();
				break;
			}
			else if(i==totalRows)
			{
				System.out.println("Company doesn't exist");
			}
		}
		/*
		 * Verifying data.
		 */
		String selectComp = driver.findElement(By.xpath("//input[@name='company']")).getAttribute("value");
		System.out.println("Company: "+selectComp);
		String selectPrice = driver.findElement(By.xpath("//input[@name='price']")).getAttribute("value");
		System.out.println("Price: "+selectPrice);
		String selectPct = driver.findElement(By.xpath("//input[@name='pctChange']")).getAttribute("value");
		System.out.println("% Change: "+selectPct);
		String selectDateChange = driver.findElement(By.xpath("//input[@name='lastChange']")).getAttribute("value");
		System.out.println("Last Updated: "+selectDateChange);
		
		driver.quit();
	}

}
