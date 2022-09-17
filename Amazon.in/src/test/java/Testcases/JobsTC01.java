package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Amazon.gemericutility.BaseClass;


public class JobsTC01 extends BaseClass {
	
	  /*1st Test case(GiveInvalidDataToExpectedCloseDate)*/
@Test
	public  void TC01() throws Throwable {
	
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
	    System.out.println("Checking balance");
	    System.out.println("Amazon Pay balace is "+(driver.findElement(By.xpath("//div[@class='a-column a-span4 a-text-right onep-instrument-amount-desktop a-span-last']//following::span[@class='currency-green']"))));
		String expmsg ="0.00";
		WebElement actualmsg = driver.findElement(By.xpath("//div[@class='a-column a-span4 a-text-right onep-instrument-amount-desktop a-span-last']//following::span[@class='currency-green']"));
		Assert.assertEquals(actualmsg, expmsg);
		Thread.sleep(10000);
		
		if(actualmsg.equals(expmsg)) {
		System.out.println("PASS::valid msg is displayed"+ expmsg);
	}
	else {
		System.out.println("FAIL::valid msg is not displayed"+expmsg);
	}	
	}
}
