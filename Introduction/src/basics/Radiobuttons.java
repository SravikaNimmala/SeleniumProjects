package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.echoecho.com/htmlforms10.htm");
System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
int count = driver.findElements(By.xpath("//input[@name='group2']")).size();

for(int i=1;i<count;i++){
	//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	String text = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
	if(text.equals("Wine"))
	{
		driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
	}
	else{
		System.out.println("There is no juice in the list");
	}
		
		}

	}
}
