package kiteAppPomUsingExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

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
		
		
		kiteLoginPage login=new kiteLoginPage(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin(PIN);
		pin.clickOnContinueButton();
		
		
		Thread.sleep(2000);
		
		kiteHomePage home=new kiteHomePage(driver);
		home.validateUserNmae(UN);
		home.lougOut();
		
		driver.close();
		 
		

	}

}
