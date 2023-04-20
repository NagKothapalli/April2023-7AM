package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation
{
	WebDriver driver; //null
	
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234 //it will open an empty chrome browser
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
