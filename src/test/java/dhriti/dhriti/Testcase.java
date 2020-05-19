package dhriti.dhriti;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BasePage;
import pages.HomePage;
import pages.MicePage;

public class Testcase extends BasePage {
	
	HomePage home;
	MicePage micepage;
	
	@BeforeTest
	public void setUp() throws IOException{
		initialize();
	}
	
	@Test
	public void testCompare(){
		home = new HomePage(driver);
		System.out.println(home.getProductLinkFontSize());
		home.hoverOnProductLink();
		micepage = home.clickOnMiceLink();
		micepage.selectFirstItem();
		micepage.selectSecondItem();
		micepage.clickOnCompareLink();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
