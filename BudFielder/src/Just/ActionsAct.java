package Just;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAct {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d1 = new ChromeDriver();
		d1.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement abc = d1.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement bcd = d1.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a = new Actions(d1);
		a.dragAndDrop(abc,bcd).perform();
	}

}
