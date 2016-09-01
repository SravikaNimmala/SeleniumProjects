package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class P_Practice_SimpleTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver task = new FirefoxDriver();
		task.manage().window().maximize();
		task.get("http://localhost/extjs-4.1.1/examples/simple-tasks/index.html");
		WebElement allLists = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/div")); 
		Actions act = new Actions(task);
		act.contextClick(allLists).build().perform();
		WebElement newFolder = task.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div[2]/a"));
		act.click(newFolder).build().perform();
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys("Context Click Example").build().perform();
		WebElement contextClick = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[3]/td[1]/div"));
		act.contextClick(contextClick).build().perform();
		WebElement newTask = task.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div[3]/a"));
		act.click(newTask).sendKeys("Task 1").build().perform();

	}

}
