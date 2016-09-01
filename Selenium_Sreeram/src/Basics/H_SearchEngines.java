package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class H_SearchEngines{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebDriver amazon = new FirefoxDriver();
		amazon.get("www.amazon.com");
		Actions act2 = new Actions(amazon);
		WebElement searchEngine = amazon.findElement(By.name("field-keywords"));
		act2.moveToElement(searchEngine).sendKeys("harry potter").build().perform();
		
		
		WebDriver emirates = new FirefoxDriver();
		emirates.get("http://www.emirates.com");
		WebElement bookFlight = emirates.findElement(By.xpath("//html/body/form[1]/div[4]/div[1]/div/div[3]/div/div/div/ul/li[1]/a"));
		bookFlight.click();
	
		WebDriver bing = new FirefoxDriver();
		bing.get("https://www.bing.com/");
		WebElement searchBox = bing.findElement(By.xpath("//td[@id='hp_cellCenter']/div/div[6]/div[2]/form/div/input[1]"));
		searchBox.sendKeys("Harry Potter");
		
		
		WebDriver google = new FirefoxDriver();
		google.manage().window().maximize();
		google.get("www.google.com");
		//Actions act = new Actions(google);
		WebElement searchBox1 = google.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]"));
		//act.moveToElement(searchBox1).sendKeys("Harry Potter").build().perform();
		//searchBox1.click();
		searchBox1.sendKeys("Harry Potter");
		//google.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div/button")).click();
	*/
		
		WebDriver yahoo = new FirefoxDriver();
		yahoo.manage().window().maximize();
		yahoo.get("https://www.yahoo.com/");
		//Actions act2 = new Actions(yahoo);
		WebElement searchBox = yahoo.findElement(By.xpath(".//*[@name='p']"));
		//div[@id='mega-uh']/div/form/table/tbody/tr/td[1]/input[1]
		//act2.moveToElement(searchBox).build().perform();
		searchBox.sendKeys("Harry Potter");
		//yahoo.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/form/table/tbody/tr/td[3]/button")).click();
		
	}

}
