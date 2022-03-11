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

}
