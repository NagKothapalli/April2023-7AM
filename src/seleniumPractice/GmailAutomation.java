package seleniumPractice;

import java.util.List;

import org.junit.Before;
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
	
	//java.lang.NullPointerException
	
	
	//Selectors / Locators : ID , Name , ClassName , cssSelector , linkText , partialLinkText , TagName , xPath
	
	String expectedTitle = "Gmail";
	WebDriver driver; //null
	
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234 //it will open an empty chrome browser
	}
	
	@Before // method tagged with before annotation will be executed before every test method
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		//open an empty browser -> In selenium s/w we have a class called ChromeDriver ,if we call its constructor 
		   //it will open an empty chrome browser
		//ChromeDriver driver = new ChromeDriver();					
		//call gmail url in the above browser - https://gmail.com
		driver.get("https://gmail.com"); //1234
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
		
		/*
		 * WebElement emailObj = driver.findElement(By.name("identifier"));
		 * emailObj.click(); emailObj.sendKeys("dsfdsfsfsdfs"); emailObj.clear();
		 * emailObj.sendKeys("nag022@gmail.com");
		 */	
	}
	
	//Execution flow : Instance variables -> Constructor -> Before -> Test
	@Test
	public void loginToApplication_index() //1234
	{
		driver.findElement(By.name("identifier")).sendKeys("9959775757");
		//driver.findElement(By.id("identifierId")).clear();
		//driver.findElement(By.id("identifierId")).sendKeys("ram@google.com");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1); //0 1
		element.click();
		
	}
	@Test
	public void loginToApplication() //1234
	{
		driver.findElement(By.name("identifier")).sendKeys("9959775757");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // i=0 1 2 3 4 .......
			String text = element.getText();
			System.out.println("My text :" + text);
			if(text.toUpperCase().equals("NEXT"))
			{
				element.click();
				System.out.println("Came inside if condition at 95 line");
				break;
			}
		}
		
	}
	@Test
	public void createAccount() //1234
	{		
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // i=0 1 2 3 4 .......
			String text = element.getText();
			System.out.println("My text :" + text);
			if(text.toUpperCase().equals("CREATE ACCOUNT"))
			{
				element.click();
				System.out.println("Came inside if condition at 95 line");
				break;
			}
		}
		
	}
	@Test
	public void forgotEmail() //1234
	{
		driver.findElement(By.tagName("button")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { WebElement element = elements.get(i); //
		 * i=0 1 2 3 4 ....... String text = element.getText();
		 * System.out.println("My text :" + text.toUpperCase());
		 * if(text.toUpperCase().equals("FORGOT EMAIL?")) { element.click();
		 * System.out.println("Came inside if condition at 95 line"); break; } }
		 */
		
	}
	
	@Test
	public void learnMore() //1234
	{
		//driver.findElement(By.tagName("a")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); // i=0 1 2
		 * 3 4 ....... String text = element.getText(); System.out.println("My text :" +
		 * text); if(text.toUpperCase().equals("LEARN MORE")) { element.click();
		 * System.out.println("Came inside if condition at 95 line"); break; } }
		 */
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
