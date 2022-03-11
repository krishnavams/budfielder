package com.budfielder.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSignIn {
	@FindBy(id = "userName")
	private WebElement userName;
	@FindBy(id = "passWord")
	private WebElement passWord;
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement SignIn;

	public PageSignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

}
