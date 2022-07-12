package kiteAppTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteAppUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File myfile=new File("F:\\26th march b\\poi-bin-5.2.2-20220312\\Testexcel26thMArchB.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		
		
System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		WebElement userID = driver.findElement(By.id("userid"));
 		WebElement password = driver.findElement(By.id("password"));
 		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
       
 userID.sendKeys ( UN);
 	password.sendKeys(PWD);
 		loginButton.click();
 		
 		Thread.sleep(1000);
 		
 		WebElement pin = driver.findElement(By.id("pin"));
 		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
 		
 		pin.sendKeys(PIN);
 	continueButton.click();
 	
 		Thread.sleep(1000);
 		WebElement userNmae = driver.findElement(By.xpath("//span[@class='user-id']"));
 		
 		String actualUserID = userNmae.getText();
 	String expectedUserID=UN  ;
 		
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

