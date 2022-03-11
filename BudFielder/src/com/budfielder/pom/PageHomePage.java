package com.budfielder.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHomePage {
	@FindBy(xpath = "(//a[@class='topLink'])[6]")
	private WebElement logOut;
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leads;
	@FindBy(xpath = "//a[text()='Accounts']")
	private WebElement account;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	@FindBy(xpath = "//a[text()='Potentials']")
	private WebElement potentials;
	@FindBy(xpath = "//a[text()='Campaigns']")
	private WebElement campaign;
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement Products;
	// Campaign custom page details
	@FindBy(className = "button")
	private WebElement newCampaign;
	@FindBy(className = "title hline")
	private WebElement createCampaign;
	@FindBy(xpath="(//input[@name='Button'])[1]")
	private WebElement save1;
	@FindBy(xpath="(//input[@name='Button'])[2]")
	private WebElement save_new1;
	@FindBy(xpath="(//input[@name='Button'])[3]")
	private WebElement save2;
	@FindBy(xpath="(//input[@name='Button'])[4]")
	private WebElement save_new2;


	public PageHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getPotentials() {
		return potentials;
	}

	public WebElement getCampaign() {
		return campaign;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getNewCampaign() {
		return newCampaign;
	}

	public WebElement getCreateCampaign() {
		return createCampaign;
	}

	public WebElement getSave1() {
		return save1;
	}

	public WebElement getSaveNew1() {
		return save_new1;
	}

	public WebElement getSave2() {
		return save2;
	}

	public WebElement getSaveNew2() {
		return save_new2;
	}

}
