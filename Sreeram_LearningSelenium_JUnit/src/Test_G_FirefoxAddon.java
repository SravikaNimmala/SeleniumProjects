import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_G_FirefoxAddon {
	@Test
	public void AddOn(){
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

}
