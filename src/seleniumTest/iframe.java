package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\26th march b\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		
	String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();

		System.out.println(text);
		
		
	
		
		
	
		
		driver.switchTo().frame("Frame1");//changing focus from main page to frame1
		
   

   String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text1);
		
		
		//xpath by linked text
		driver.switchTo().parentFrame();// switch focus from frame to main page
		String text2 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(text2);
	
	}
        
	

}
