package TraditionalScript;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mongodb.assertions.Assertions;

public class trial {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Amazon.in\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://www.w3schools.com/css/css_tooltip.asp");
        

        //2) Get the current window's handle and write to the console window. It must be first window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //Switch to iframeResult iframe because all elements located in this iframe
        driver.switchTo().frame("iframeResult");
        //3) Locate the link and click it
        WebElement visitLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        visitLink.click();
        //4) Get all window handles and hold them in a list.
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<String>(windowHandles); //Set to List Conversion
        //5) Write to total window handle number to the console.
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        //6) Switch to second window
        driver.switchTo().window(windowHandlesList.get(1));
        //7) Get the current window's handle and write to the console window. It must be second window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //8) Check the upper left side logo
        
            
            driver.close();
            driver.quit();
        }  
	}

