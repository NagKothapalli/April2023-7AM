package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 112
	//Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe 
	@Test
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		//open an empty browser -> In selenium s/w we have a class called ChromeDriver ,if we call its constructor 
		   //it will open an empty chrome browser
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		for(int i=1;i<=5;i++)
		{			
			//call gmail url in the above browser - https://gmail.com
			driver.get("https://gmail.com");
			String sessionID = driver.getWindowHandle();
			System.out.println("The Session ID of the Window :" + sessionID);
		}
		
	}

}
