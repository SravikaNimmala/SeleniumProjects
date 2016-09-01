import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Test_E_SimpleTaskTest {
	//static File ffpDir = new File("C:\\Users\\Nimmala611\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\bocdyrsq.default");
	//static FirefoxProfile ffp = new FirefoxProfile(ffpDir);
	static WebDriver task = new FirefoxDriver();
	@BeforeClass
	public static void openSimpleTask(){
		task.manage().window().maximize();
		task.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		task.get("http://localhost/extjs-4.1.1/examples/simple-tasks/index.html");
		
	}
	@Test
	public void Folder1()
	{
		//Step 1: Finding the All List Element.
		WebElement allList = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/div"));
		Actions menu = new Actions(task);
		menu.contextClick(allList).build().perform();
		WebElement newFolder = task.findElement(By.xpath("//span[@id='new-folder-item-textEl']"));
		menu.click(newFolder).build().perform();
		menu.sendKeys(Keys.CLEAR).build().perform();
		menu.sendKeys("Folder 1").build().perform();
		Actions list = new Actions(task);
		WebElement folder1 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[3]/td[1]/div"));
		list.contextClick(folder1).build().perform();
		WebElement newList = task.findElement(By.xpath("//span[@id='new-list-item-textEl']"));
		newList.click();
		WebElement list1 = task.findElement(By.xpath("//td/input[@name='name']"));
		list1.sendKeys("List 1");
		list1.sendKeys(Keys.RETURN);
		WebElement newTask = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[4]/td[1]/div"));
		list.contextClick(newTask).build().perform();
		WebElement task1 = task.findElement(By.xpath("//span[@id='new-task-item-textEl']"));
		task1.click();
		task.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div/table[1]/tbody/tr/td[2]/input")).sendKeys("Task 1");
		task.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div/table[1]/tbody/tr/td[2]/input")).sendKeys(Keys.RETURN);
	}
	@Test
	public void Folder2()
	{
		WebElement allList2 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/div"));
		Actions menu2 = new Actions(task);
		menu2.contextClick(allList2).build().perform();
		WebElement newFolder2 = task.findElement(By.xpath("//span[@id='new-folder-item-textEl']"));
		newFolder2.click();
		menu2.sendKeys(Keys.CLEAR).sendKeys("Folder 2").sendKeys(Keys.RETURN).build().perform();
		WebElement folder2 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[5]/td[1]/div"));
		menu2.contextClick(folder2).build().perform();
		WebElement newList2 = task.findElement(By.xpath("//span[@id='new-list-item-textEl']"));
		newList2.click();
		WebElement list2 = task.findElement(By.xpath("//input[@name='name']"));
		list2.sendKeys(Keys.CLEAR);
		list2.sendKeys("List 2");
		list2.sendKeys(Keys.RETURN);
		WebElement newTask2 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[6]/td[1]/div"));
		menu2.contextClick(newTask2).build().perform();
		WebElement task2 = task.findElement(By.xpath("//span[@id='new-task-item-textEl']"));
		task2.click();
		WebElement taskName2 = task.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div/table[1]/tbody/tr/td[2]/input"));
		taskName2.sendKeys("Task 2");
		taskName2.sendKeys(Keys.RETURN);
		
	}
	@Test
	public void Folder3()
	{
		WebElement allList3 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/div"));
		Actions menu3 = new Actions(task);
		menu3.contextClick(allList3).build().perform();
		WebElement newFolder3 = task.findElement(By.xpath("//span[@id='new-folder-item-textEl']"));
		newFolder3.click();
		menu3.sendKeys(Keys.CLEAR).sendKeys("Folder 3").sendKeys(Keys.RETURN).build().perform();
		WebElement folder3 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[7]/td[1]/div"));
		menu3.contextClick(folder3).build().perform();
		WebElement newList3 = task.findElement(By.xpath("//span[@id='new-list-item-textEl']"));
		newList3.click();
		WebElement list3 = task.findElement(By.xpath("//input[@name='name']"));
		list3.sendKeys("List 3");
		list3.sendKeys(Keys.RETURN);
		WebElement newTask3 = task.findElement(By.xpath("html/body/div[2]/div[3]/div/table/tbody/tr[8]/td[1]/div"));
		menu3.contextClick(newTask3).build().perform();
		WebElement task3 = task.findElement(By.xpath("//span[@id='new-task-item-textEl']"));
		task3.click();
		WebElement taskName3 = task.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div/table[1]/tbody/tr/td[2]/input"));
		taskName3.sendKeys("Task 3");
		taskName3.sendKeys(Keys.RETURN);
		
	}

}
