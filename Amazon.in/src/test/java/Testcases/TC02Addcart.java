package Testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Amazon.gemericutility.BaseClass;
import Amazon.gemericutility.WebDriverUtility;

public class TC02Addcart extends BaseClass{
@Test
	public  void TC02() throws Throwable {
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 Thread.sleep(10000);
	 driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	 driver.findElement(By.xpath("//input[@ID='twotabsearchtextbox']")).sendKeys("MI Poco M2 Pro");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 driver.findElement(By.xpath("//span[text()='MI Poco M2 Pro (Out of The Blue, 4GB RAM, 64GB Storage)']")).click();
	 
 /*  String parentWin = driver.getWindowHandle();
     System.out.println(parentWin);
     Set<String> windows = driver.getWindowHandles();
     System.out.println(windows);

	 WebElement iframe_element = driver.findElement(By.id("OtherSellersIframe;"));
	 System.out.println(iframe_element);
	 driver.switchTo().frame(driver.findElement(By.id("OtherSellersIframe;")));
	 String parentWindowHandle = driver.getWindowHandle();
	// driver.findElement(By.xpath("//p[text()='6GB RAM , 64GB Storage']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	 driver.findElement(By.xpath("//a[@class='a-link-normal close-button']")).click();
	 driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	 WebElement actmsg = driver.findElement(By.xpath("//span[text()='MI Poco M2 Pro (Out of The Blue, 6GB RAM, 64GB Storage)' and @class='a-truncate-full a-offscreen']"));
	 String expmsg = "MI Poco M2 Pro (Out of The Blue, 6GB RAM, 64GB Storage)";
	 Assert.assertEquals(expmsg, actmsg);
	 System.out.println("Price of product"+(driver.findElement(By.xpath("//span[@class='currencyINR']"))));  */
	 
	}
}
