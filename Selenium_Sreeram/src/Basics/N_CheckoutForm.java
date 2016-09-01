package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class N_CheckoutForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver checkout = new FirefoxDriver();
		checkout.manage().window().maximize();
		checkout.get("http://localhost/extjs-4.1.1/examples/form/checkout.html");
		WebElement firstName = checkout.findElement(By.xpath("html/body/div[1]/div[2]/fieldset[1]/div/table/tbody/tr/td[2]/div/div/table[1]/tbody/tr/td[2]/input"));
		firstName.sendKeys("Harry");
		String fName = firstName.getAttribute("value"); System.out.println(fName);
		WebElement lastName = checkout.findElement(By.xpath("html/body/div[1]/div[2]/fieldset[1]/div/table/tbody/tr/td[2]/div/div/table[2]/tbody/tr/td[2]/input"));
		lastName.sendKeys("Potter");
		String lName = lastName.getAttribute("value"); System.out.println(lName);
		WebElement asBilling = checkout.findElement(By.xpath("html/body/div[1]/div[2]/fieldset[3]/div/table[1]/tbody/tr/td[2]/input"));
		asBilling.click(); 
		
		
		checkout.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement stateClick = checkout.findElement(By.xpath("html/body/div[1]/div[2]/fieldset[2]/div/div[1]/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/div"));
		stateClick.click();
		int noOfStates = checkout.findElements(By.xpath("html/body/div[3]/div/ul/li")).size();
		System.out.println(noOfStates);
		for(int i=1; i<=noOfStates;i++)
		{
			String states = checkout.findElement(By.xpath("html/body/div[3]/div/ul/li["+i+"]")).getText();
			if(states.equalsIgnoreCase("AA"))
			{
				System.out.println(i);
				checkout.findElement(By.xpath("html/body/div[3]/div/ul/li["+i+"]")).click();
				
				break;
			}
			else if(i==noOfStates)
			{
				System.out.println("The state doesn't exist.");
			}
		}
		
	}

}
