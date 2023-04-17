package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 112
	//Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe 
	String expectedTitle = "Gmail";
	//Selectors / Locators : ID , Name , ClassName , cssSelector , linkText , partialLinkText , TagName , xPath
	@Test
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		//open an empty browser -> In selenium s/w we have a class called ChromeDriver ,if we call its constructor 
		   //it will open an empty chrome browser
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		//call gmail url in the above browser - https://gmail.com
		driver.get("https://gmail.com");
		String sessionID = driver.getWindowHandle();
		System.out.println("The Session ID of the Window :" + sessionID);
		String actualTitle = driver.getTitle();
		System.out.println("Application Title :" + actualTitle);
		String myCurl = driver.getCurrentUrl();
		System.out.println("My Current URL : " +myCurl );
		//Assert.assertEquals(expectedTitle, actualTitle);
		boolean result = false;//default
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("LaunchApplication is PASSED");
			result = true;
		}
		else
		{
			System.out.println("LaunchApplication is FAILED");
		}
		System.out.println("We came out of if condition");
		//Assert myassert = new Assert();
		Assert.assertTrue(result);
		driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("ram@google.com");
		/*
		 * WebElement emailObj = driver.findElement(By.name("identifier"));
		 * emailObj.click(); emailObj.sendKeys("dsfdsfsfsdfs"); emailObj.clear();
		 * emailObj.sendKeys("nag022@gmail.com");
		 */	
	}
	
	public void loginToApplication()
	{
		
	}

}
