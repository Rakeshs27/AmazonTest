package TraditionalScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class aa {

	
		    public static void main(String[] args) throws InterruptedException {
		        
		        //Creating a driver object referencing WebDriver interface
		        WebDriver driver;
		        
		        //Setting the webdriver.chrome.driver property to its executable's location
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Amazon.in\\chromedriver.exe");
			
		        //Instantiating driver object
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		        
		        driver.get("https://www.saucedemo.com/");
		        Thread.sleep(20000);
			  	  //Capturing the title and validating if expected is equal to actual
			  	  String expectedTitle = "";
			  	  String actualTitle = driver.getTitle();
			  	  System.out.println(actualTitle);
			  	 // Assert.assertEquals(actualTitle, expectedTitle);
			  	Thread.sleep(20000);
			 // driver.findElement(By.xpath("//div[@class='login-button']")).click();
			  	// driver.findElement(By.xpath("//span[text()='Text Box']")).click();
			  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			  driver.findElement(By.xpath("//input[@id='login-button']")).click();
			  driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack' and @class='inventory_item_name']")).click();
			  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			  driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
			  driver.findElement(By.xpath("//button[@id='checkout']")).click();
			  
			  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("standard_user");
			  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("secret_sauce");
			  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500032");
		   	 driver.findElement(By.xpath("//input[@id='continue']")).click();
		   	driver.findElement(By.xpath("//button[text()='Finish']")).click();
		   	String ordermsg=driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		   	 System.out.println(ordermsg);
		   	 //driver.close();
		   	// driver.quit();
		   	driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and text()='Add to cart']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' and text()='Add to cart']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt' and text()='Add to cart']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie' and text()='Add to cart']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket' and text()='Add to cart']")).click();
		    driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)' and text()='Add to cart']")).click();
			 // driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			  driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
			  driver.findElement(By.xpath("//button[@id='checkout']")).click();
			  
			  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("standard_user");
			  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("secret_sauce");
			  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500032");
		   	 driver.findElement(By.xpath("//input[@id='continue']")).click();
		   	driver.findElement(By.xpath("//button[text()='Finish']")).click();
		   	String multiordermsg=driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		   	 System.out.println(multiordermsg);
		   driver.close();
			   driver.quit();

		    }
	}


