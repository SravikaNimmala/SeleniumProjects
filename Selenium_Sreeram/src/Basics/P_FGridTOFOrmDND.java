package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P_FGridTOFOrmDND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dnd = new FirefoxDriver();
		dnd.manage().window().maximize();
		dnd.get("http://localhost/extjs-4.1.1/examples/dd/dnd_grid_to_formpanel.html");
		WebElement src = dnd.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]/div"));
		WebElement tgt = dnd.findElement(By.xpath("html/body/div[1]/div/div[1]/div[2]/div[2]/table[1]/tbody/tr/td[2]/input"));
		Actions act = new Actions(dnd);
		act.dragAndDrop(src, tgt).build().perform();
		//act.click().dragAndDrop(src, tgt).build().perform();
		//act.doubleClick().dragAndDrop(src, tgt).clickAndHold().build().perform();
		int totalRows = dnd.findElements(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[3]/div/table/tbody/tr")).size();
		String userRecord = "Record 9";
		for(int i=2;i<=totalRows;i++)
		{
			String currentRow = dnd.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[1]/div")).getText();
			if(currentRow.equals(userRecord))
			{
				WebElement src1 = dnd.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[1]/div"));
				Actions act2 = new Actions(dnd);
				act2.dragAndDrop(src1, tgt).build().perform();
				break;
			}
		}
	}
}
