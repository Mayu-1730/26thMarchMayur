package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class facebook {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\chromedriver.exe");
        
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.name("firstname")).sendKeys("mayur");
		driver.findElement(By.name("lastname")).sendKeys("kute");
		driver.findElement(By.name("reg_email__")).sendKeys("abc");
		driver.findElement(By.name("reg_passwd__")).sendKeys("234");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select d=new Select(day);
		d.selectByVisibleText("17");
		
		
		//WebElement month = driver.findElement(By.id("	month"));
	//	select m =new select(month);
	//	WebElement year = driver.findElement(By.id("	year	"));
		//select y =new select(year);
	
		
	}

}
