package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUzNTUzNDQ1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk");
     
		driver.findElement(By.xpath("//div[contains(text(),'mobile')] "));
		driver.findElement(By.xpath("//button[contains(@class,'_4jy6 ')] "));
	}

}
