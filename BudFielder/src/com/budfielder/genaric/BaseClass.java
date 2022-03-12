package com.budfielder.genaric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.budfielder.pom.PageHomePage;
import com.budfielder.pom.PageSignIn;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeTest
	public void logIn() throws EncryptedDocumentException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.150.128:8080/crm/HomePage.do");
		PageSignIn p1 = new PageSignIn(driver);
		FileLib f = new FileLib("./Support/GenaricData1.xlsx");
		p1.getUserName().sendKeys(f.getExtranalData("Sheet1", 1, 2));
		p1.getPassWord().sendKeys((String) f.getExtranalData("Sheet1", 1, 3));
		p1.getSignIn().click();
	}

	@AfterTest
	public void LogOut() {
		PageHomePage h1 = new PageHomePage(driver);
		h1.getLogOut().click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
