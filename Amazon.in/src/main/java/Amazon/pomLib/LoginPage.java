package Amazon.pomLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	private WebElement Logo;
	
	@FindBy(xpath="//a[text()='Sign in securely']")
	private WebElement Popupsignin;
	
	@FindBy(name = "email")
		private WebElement usernameedt;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(name = "password")
	private WebElement userpasswordedt;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement loginbtn;
	

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement Account;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement Signin;
	

	public WebElement getLogout() {
		return Account;
	}

	public WebElement getSignout() {
		return Signin;
	}

	public WebElement getUserLogo(){
		return Logo;
	}
	public WebElement getUsercontinue(){
		return continuebtn;
	}
	
	public WebElement getUsernameedt(){
		return usernameedt;
	}

	public WebElement getUserpasswordedt() {
		return userpasswordedt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
 public void LoginToApp(String username,  String password) {
//	Actions action = new Actions(driver);
	//action.moveToElement(Account).perform();
	Logo.click();
	 Popupsignin.click();
	 usernameedt.sendKeys(username);
	 continuebtn.click();
	 userpasswordedt.sendKeys(password);
	 loginbtn.click();
 }
 
}


