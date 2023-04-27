package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation
{
	WebDriver driver; //null
	ReadTestData readTestData;
	WebDriverUtilities driverUtils;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234 //it will open an empty chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		readTestData = new ReadTestData("Stage");
		driverUtils = new WebDriverUtilities(driver);
	}
	
	@Before // method tagged with before annotation will be executed before every test method
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		//driver.get("https://www.apsrtconline.in/"); //1234
		driver.get(readTestData.getData("URL"));
	}
	//Exceptions : checked / unchecked 
	
	//Checked / Compile Time exception : FileNotFoundException , InterruptedException
	
	//UnChecked / Run Time exception : ArrayIndexOutofBounds , Divide by zero
	@Test
	public void readPropertiesData() throws IOException
	{
		//Get the file as java object - FileInputStream
		FileInputStream myfile = new FileInputStream("TestData/DevData.properties");//news paper
		Properties prop = new Properties(); //news reader
		prop.load(myfile); // give the paper to reader
		String abc = prop.getProperty("URL");
		System.out.println(abc);
		System.out.println(prop.getProperty("UserName"));
	}
	

	@Test
	public void bookBusTicket_relativexpath()
	{
		//driver.findElement(By.xpath("//input[@type='text' and @name='source']")).sendKeys("HYDERABAD");
		//*[@id='fromPlaceName']
		//input[@title='Enter bording place name or city and select place from the dropdown list.']
		//input[contains(@title,'Enter bording place name or city')]
		//driver.findElement(By.xpath("//input[@title='Enter bording place name or city and select place from the dropdown list.']")).sendKeys("HYDERABAD");
	    //driver.findElement(By.xpath("//input[contains(@title,'Enter bording place name or city')]")).sendKeys("HYDERABAD");
	    driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("HYDERABAD");
	}
	//org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <input type="button" name="searchBtn" id="searchBtn"
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("HYDERABAD");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='returnDiscountModal-content']/span")).click();
		//actions.sendKeys(Keys.ENTER).build().perform();
	}
	@Test
	public void bookBusTicketWithReturnJourneyDiscount()
	{
		//Step1: Enter from City wait one sec and click enter button
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		//Step2: Enter to City wait one sec and click enter button
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		//Step3:Open Calendar
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//Step4:Select Journey date and click search button
		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		//Step5: click Apply Now in the return journey modal popup
		//Synchronization
		//actions.pause(Duration.ofSeconds(10)).build().perform(); // fixed / static wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // dynamic
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='returnDiscountModal-content']//input[@title='Apply Now']"))).click();
		//driver.findElement(By.xpath("//div[@id='returnDiscountModal-content']//input[@title='Apply Now']")).click();	
	}
	
	@Test
	public void bookBusTicketWithRJD_Utility()
	{
		//Step1: Enter from City wait one sec and click enter button
		driverUtils.enterText("//*[@id='fromPlaceName']","HYDERABAD");//Hard coded data
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step2: Enter to City wait one sec and click enter button
		driverUtils.enterText("//input[@name='destination']","GUNTUR");//Hard coded data
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step3:Open Calendar
		driverUtils.clickElement("//input[@name='txtJourneyDate']");
		//Step4:Select Journey date and click search button
		driverUtils.clickElement("//a[text()='28']");//Hard coded data
		driverUtils.clickElement("//input[@value='Check Availability']");
		//Step5: click Apply Now in the return journey modal popup
		driverUtils.clickElement("//div[@id='returnDiscountModal-content']//input[@title='Apply Now']");
	}
	
	//Framework - POM - Page Object Model
	
	String fromCityXpath = "//*[@id='fromPlaceName']";
	String toCityXpath = "//input[@name='destination']";	
	String openCalendarXpath = "//input[@name='txtJourneyDate']";
	String selectDateXpath = "//a[text()='28']";
	String searchBtnXpath = "//input[@value='Check Availability']";
	String applyNowXpath = "//div[@id='returnDiscountModal-content']//input[@title='Apply Now']";
	
	String timeTableXpath = "//a[@title='TimeTable / Track']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	String homeXpath = "//a[@title='Home']";
	
	@Test
	public void bookBusTicketWithRJD_Utility_xpaths()
	{
		//Step1: Enter from City wait one sec and click enter button
		String fCity = readTestData.getData("FromCity");
		driverUtils.enterText(fromCityXpath,fCity); 
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step2: Enter to City wait one sec and click enter button
		driverUtils.enterText(toCityXpath,readTestData.getData("ToCity"));
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step3:Open Calendar
		driverUtils.clickElement(openCalendarXpath);
		//Step4:Select Journey date and click search button
		//clickElement(selectDateXpath);
		selectJourneyDate(readTestData.getData("JDate"));
		driverUtils.clickElement(searchBtnXpath);
		//Step5: click Apply Now in the return journey modal popup
		driverUtils.clickElement(applyNowXpath);
	}
	//Dynamic xpath
	public void selectJourneyDate(String jDate)
	{
		                              //a[text()='28']
		// Today is my 10 th birthday - "Today is my" +year+  " th birthday"
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}
	
	
	
	@Test
	public void keyboardAndMouseActions()
	{
		WebElement fromPlace = driver.findElement(By.xpath("//*[@id='fromPlaceName']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(fromPlace).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(fromPlace).doubleClick().contextClick().build().perform();
	}
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void workWithMultipleWindows()
	{
		driverUtils.clickElement(timeTableXpath);
		driverUtils.clickElement(allServicesXpath);
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(allWindows);
		int length = windows.size();
		for(int i=0;i<length;i++)
		{
			System.out.println(windows.get(i));
		}
		System.out.println("Title of the first window : "+driver.getTitle());
		driver.switchTo().window(windows.get(1)); //0 - first window  1 - second window
		System.out.println("Title of the second window : "+driver.getTitle());
		driver.close(); // it will close the current active window
		//driver.quit(); //it will close all windows opened by this driver object , driver exe will be killed in taskmanager
		driver.switchTo().window(windows.get(0));
		driverUtils.clickElement(homeXpath);
		driver.quit();
	}
	
	
	
	
	
	
	@Test
	public void navigateToAllTabs() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
		Thread.sleep(1000);  // it will pause the java for 1 sec
		driver.findElement(By.xpath("//a[@title='Cancel Ticket']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Track Service']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Gallery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Wallet']")).click();
	}
	

}
