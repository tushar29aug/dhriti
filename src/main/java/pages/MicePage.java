package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MicePage {
	
	public WebDriver driver;
	
	@FindBy (xpath="/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[1]/a/img")
	public WebElement firstItemHover;
	
	@FindBy (xpath="/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div[1]/div[2]/label")
	public WebElement firstMiceItem;
	
	@FindBy (xpath="/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/a/img")
	public WebElement secondMiceHover;
	
	@FindBy (xpath="/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/label")
	public WebElement secondMiceItem;
	
	@FindBy (xpath="/html/body/div[1]/main/div[2]/div[2]/a")
	public WebElement comapreLink;

	public MicePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectFirstItem(){
		Actions action = new Actions(driver);
		action.moveToElement(firstItemHover).build().perform();
		firstMiceItem.click();
	}
	
	public void selectSecondItem(){
		Actions action = new Actions(driver);
		action.moveToElement(secondMiceHover).build().perform();
		secondMiceItem.click();
	}
	
	public void clickOnCompareLink(){
		comapreLink.click();
	}
}
