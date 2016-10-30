package chapter_three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//for chrome	
	System.setProperty("webdriver.chrome.driver","C:\\selenium-2.48.2\\chromedriver.exe" );
	//WebDriver driver =new ChromeDriver();
	//driver.get("http://google.com");
	//driver.close();
	// for IE
	System.setProperty("webdriver.ie.driver", "C:\\selenium-2.48.2\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("http://google.com");
	}

}
