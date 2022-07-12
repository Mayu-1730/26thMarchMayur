package kiteAppPomUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {
	//1
	
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement lougOutButton;
	
	//2
	
	public kiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3
	
	public void validateUserNmae(String ExpectedUserName)
	
	{
		String expecteduserName=ExpectedUserName;
	String actualUserNmae = userName.getText();
	
	if(expecteduserName.equals(actualUserNmae))
	{
		System.out.println("actual and expextedUserId are Matching TC IS Passed");
	}
	else {
		System.out.println("actual and expextedUserId aerNot Matching TC IS failed");
		
	}
	
				
				
	}
	public void lougOut() throws InterruptedException
	{
		userName.click();
		Thread.sleep(200);
		lougOutButton.click();
	}
	
}
