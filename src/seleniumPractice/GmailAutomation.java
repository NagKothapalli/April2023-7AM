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
	//Exceptions : 
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 112
	//Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe 
	
	//java.lang.NullPointerException
	
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier1']"}
	
	
	
	//Different Classes in Selenium WebDriver :
	
	//Selectors / Locators : ID , Name , ClassName , cssSelector , linkText , partialLinkText , TagName , xPath
	//WebDriver : get(), getTitle(),getCurrentUrl(),getWindowHandle(),findElement(),findElements()
	//By : id(),name(),className(),cssSelector(),linkText(),partialLinkText(),tagName(),xpath()
	//WebElement : clear(),click(),sendKeys(),getText(),getAttribute()
	
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
		driver.findElement(By.name("identifier1")).sendKeys("9959775757");
		//driver.findElement(By.id("identifierId")).clear();
		//driver.findElement(By.id("identifierId")).sendKeys("ram@google.com");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1); //0 1
		element.click();
		
	}
	@Test
	public void loginToApplication() //1234
	{
		//driver.findElement(By.name("identifier")).sendKeys("9959775757");
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("nag022");
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
	//xpath : xml path : we will form the xpath by taking node to node from the root node till the child
	  //Full xpath / static xpath / absolute xpath
	@Test
	public void createAccount_fullXpath()
	{
		
		///html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
	}
	//xpath - Relative xpath - Is just like SQL query
	 //Employee table : select EmpSal  from Employees where EmpID=1234
	 //Employee table : select EmpSal  from Employees where EmpFName = 'Ram'
	 //Employee table : select EmpSal  from Employees where EmpFName = 'Ram' and EmpLName='K'
	
	//tagName[@attribute='value']
	
	//tagName[@attribute1='value' and @attribute2='value']    -- //4th[@fn='ram' and @ln='K']
	
	//tagName[text()='value']
	
	//tagName[text()='value' and @attribute='value']
	
	
		//*[@attribute='value']
	
		//*[@attribute1='value' and @attribute2='value']    -- //4th[@fn='ram' and @ln='K']
		
		//*[text()='value']
		
		//*[text()='value' and @attribute='value']
	
	//tagName[contains(@attribute,'partial value')]
	
	//tagName[contains(@attribute1,'partial value') and @attribute2='value']    -- //4th[@fn='ram' and @ln='K']
	
	//tagName[contains(text(),'value')]
	
	//tagName[contains(text(),'value') and @attribute='value']
	
	    //*[contains(@attribute,'partial value')]
	
		//*[contains(@attribute1,'partial value') and @attribute2='value']    -- //4th[@fn='ram' and @ln='K']
		
		//*[contains(text(),'value')]
		
		//*[contains(text(),'value') and @attribute='value']
	
	//*[@attribute1='value' or @attribute2='value']    -- //4th[@fn='ram' or @ln='K']
	//tagName[@attribute1='value' or @attribute2='value']    -- //4th[@fn='ram' or @ln='K']
	
	@Test
	public void createAccount_relativeXpath()
	{
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
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
		//driver.findElement(By.tagName("button")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { WebElement element = elements.get(i); //
		 * i=0 1 2 3 4 ....... String text = element.getText();
		 * System.out.println("My text :" + text.toUpperCase());
		 * if(text.toUpperCase().equals("FORGOT EMAIL?")) { element.click();
		 * System.out.println("Came inside if condition at 95 line"); break; } }
		 */
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		//button[@type='button']
		//button[text()='Forgot email?']
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
		//driver.findElement(By.partialLinkText("Learn")).click();
		driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
