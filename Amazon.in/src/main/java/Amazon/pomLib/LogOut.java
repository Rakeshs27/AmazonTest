package Amazon.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    WebDriver driver;
	public LogOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement Account;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement Signout;
	

	public WebElement getLogout() {
		return Account;
	}

	public WebElement getSignout() {
		return Signout;
	}
	
	public void logOut() {
	//	homepagelink.click();
		Actions action = new Actions(driver);
		action.moveToElement(Account).perform();
		//Account.click();
		Signout.click();
	}

	

}
