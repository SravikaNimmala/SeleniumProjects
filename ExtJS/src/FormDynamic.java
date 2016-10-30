import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormDynamic {

	public static void main(String[] args) {


		WebDriver sencha = new FirefoxDriver();
		sencha.manage().window().maximize();
		sencha.get("http://docs.sencha.com/extjs/4.2.1/#!/example/form/dynamic.html");
		WebElement firstName = sencha.findElement(By.xpath("html/body/div[2]/div[2]/table/tbody[1]/tr/td[2]/input"));
		firstName.sendKeys("Harry");
		
		
	}


	}


