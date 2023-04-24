package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation
{
	WebDriver driver; //null
	
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234 //it will open an empty chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Before // method tagged with before annotation will be executed before every test method
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		driver.get("https://www.apsrtconline.in/"); //1234
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
