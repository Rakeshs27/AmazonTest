package TraditionalScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial_1 {
	
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Amazon.in");
		  	//Setting the driver to chrome driver
		  driver = new ChromeDriver();
		  	  driver.get("https://demoqa.com/");
		  	  //Capturing the title and validating if expected is equal to actual
		  	  String expectedTitle = "© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.";
		  	  String actualTitle = driver.getTitle();
		  	  System.out.println(actualTitle);
		  	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	 
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("user");
		  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("user@gmail.com");
		  driver.findElement(By.xpath("//input[@id='currentAddress']")).sendKeys("com");
		  driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("8");
		  driver.findElement(By.xpath("//button[@id='submit']")).click();

	  
		  System.out.println(driver.findElement(By.xpath("//div[@id='output']")));
	 
	}

}
