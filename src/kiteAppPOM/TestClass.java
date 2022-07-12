package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		
		kiteLoginPage login=new kiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		
		Thread.sleep(2000);
		
		kiteHomePage home=new kiteHomePage(driver);
		home.validateUserNmae();
		home.lougOut();
		
		driver.close();
		
		

	}

}
