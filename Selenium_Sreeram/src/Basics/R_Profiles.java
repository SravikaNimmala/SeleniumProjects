package Basics;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class R_Profiles {
	@Test
	public void profile1(){
		File location = new File("C:\\Users\\Nimmala611\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\9yiu219y.HomeUser2");
		FirefoxProfile ffp = new FirefoxProfile(location);
		WebDriver driver = new FirefoxDriver(ffp);
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
	
	}
	

}
