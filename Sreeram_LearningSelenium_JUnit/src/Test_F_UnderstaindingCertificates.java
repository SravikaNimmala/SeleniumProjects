import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test_F_UnderstaindingCertificates {
	@Test
	public void USMil(){
		File dir = new File("C:\\Users\\Nimmala611\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\bocdyrsq.default");
		FirefoxProfile ffp = new FirefoxProfile(dir);
		WebDriver driver = new FirefoxDriver(ffp);
		driver.manage().window().maximize();
		driver.get("https://www.us.army.mil/");
		
		
	}

}
