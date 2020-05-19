package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy (xpath="/html/body/div[1]/div/section/div[4]/div[4]/div/div/a[1]")
	public WebElement productMenuLink;
	
	@FindBy (xpath="/html/body/div[1]/div/section/div[4]/div[5]/section/div/div/section[1]/figure/ul[1]/li[1]/a")
	public WebElement productLinkMice;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnProductLink(){
		Actions action = new Actions(driver);
		action.moveToElement(productMenuLink).build().perform();
	}
	
	public MicePage clickOnMiceLink(){
		productLinkMice.click();
		return new MicePage(driver);
	}
	
	public String getProductLinkFontSize(){
		return productMenuLink.getCssValue("font-size");
	}

}
