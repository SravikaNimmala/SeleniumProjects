package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class P_PracticePatientHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/extjs-4.1.1/examples/dd/dragdropzones.html");
		int noOfNames = driver.findElements(By.xpath("html/body/div[2]/div[2]/div[1]/div")).size();
		for(int i=1;i<=noOfNames;i++)
		{
			String names = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div["+i+"]/table/tbody/tr[1]/td[2]")).getText();
			if(names.contains("Fred")){
				WebElement src = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div["+i+"]"));
				WebElement tgt = driver.findElement(By.xpath("html/body/div[3]/div[3]/div/table/tbody/tr[3]/td/div"));
				Actions act = new Actions(driver);
				act.dragAndDrop(src, tgt).build().perform();
				WebElement alrt = driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div[1]/em/button"));
				alrt.click();
				
			}
		}

	}

	
}
