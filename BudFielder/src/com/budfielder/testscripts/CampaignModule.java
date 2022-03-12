package com.budfielder.testscripts;

import java.util.Set;

import org.testng.Reporter;
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
//		driver.switchTo().alert().accept();
		String parent = driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();

//		childs.forEach(x->(x==parent)? :driver.close());
		for (String string : childs) {
			Reporter.log(string);
			if (!string.equals(parent)) {
				driver.switchTo().window(string);
				driver.close();
			}
		}
		as.assertEquals(h1.getSave1().isEnabled(), true);
		as.assertEquals(h1.getSave2().isEnabled(), true);
		as.assertEquals(h1.getSaveNew2().isEnabled(), true);
		as.assertEquals(h1.getSaveNew1().isEnabled(), true);
		as.assertAll();
	}
}
