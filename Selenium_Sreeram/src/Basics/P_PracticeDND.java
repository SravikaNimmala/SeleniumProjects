package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class P_PracticeDND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/extjs-4.1.1/examples/dd/dnd_grid_to_grid.html");
		int noOfRows = driver.findElements(By.xpath("html/body/div[2]/div/div[1]/div/div/div[1]/div[3]/div/table/tbody/tr")).size();
		String userReq = "Rec 9";
		for(int i=2; i<=noOfRows; i=i+1)
			
		{
			String recordName = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[1]/div")).getText();
			System.out.println(recordName);
			if(recordName.equals(userReq))
			{
				WebElement src = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div/div[1]/div[3]/div/table/tbody/tr["+i+"]"));
				WebElement tgt = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div/div[2]/div[3]/div"));
				Actions act1 = new Actions(driver);
				act1.dragAndDrop(src, tgt).build().perform();
			}
		} 
	}

}
