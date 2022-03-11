package com.budfielder.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.budfielder.genaric.BaseClass;
import com.budfielder.pom.PageHomePage;

@Listeners(com.budfielder.genaric.ListenerImplemantation.class)
public class CampaignModule extends BaseClass {
	@Test
	public void createCampaingn() {
		PageHomePage h1 = new PageHomePage(driver);
		h1.getCampaign().click();
		h1.getNewCampaign().click();
		SoftAssert as = new SoftAssert();
		as.assertEquals((h1.getNewCampaign().getText()), " Create Campaign");
		as.assertAll();
	}

}
