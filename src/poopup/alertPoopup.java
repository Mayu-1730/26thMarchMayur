package poopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPoopup {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		
		
		

	}

}
