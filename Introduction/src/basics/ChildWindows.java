package basics;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=12&ct=1450927026&rver=6.4.6456.0&wp=MBI_SSL_SHARED&wreply=https:%2F%2Fmail.live.com%2Fdefault.aspx&lc=1033&id=64855&mkt=en-us&cbcxt=mai");
		driver.findElement(By.xpath("//body[@uitheme='Web']/div[2]/div/div/div/div[2]/div[6]/div/form/div/div[3]/span/a")).click();
		System.out.println(driver.getTitle());
		java.util.Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
	}

}
