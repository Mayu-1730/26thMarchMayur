package kiteAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteApp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		WebElement userID = driver.findElement(By.id("userid"));
 		WebElement password = driver.findElement(By.id("password"));
 		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
       
 userID.sendKeys("ELR321");
 	password.sendKeys("Dhana1111");
 		loginButton.click();
 		
 		Thread.sleep(1000);
 		
 		WebElement pin = driver.findElement(By.id("pin"));
 		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
 		
 		pin.sendKeys("982278");
 	continueButton.click();
 	
 		Thread.sleep(1000);
 		WebElement userNmae = driver.findElement(By.xpath("//span[@class='user-id']"));
 		
 		String actualUserID = userNmae.getText();
 	String expectedUserID="ELR321  ";
 		
 		if( actualUserID.equals(expectedUserID))
 		{
 		System.out.println("User ID Matching TC is Passed");
 		}
 			else {
				System.out.println("User ID Not Maching TC Is Failed");
			}
 		userNmae.click();
 		Thread.sleep(1000);
 		
 	driver.findElement(By.xpath("//a[@target='_self']")).click();
 		
 	Thread.sleep(3000);
 		
 		driver.close();
 		}

		
	
 		
	}

