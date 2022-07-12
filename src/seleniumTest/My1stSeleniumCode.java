package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\chromedriver.exe");
        
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		
	}

}