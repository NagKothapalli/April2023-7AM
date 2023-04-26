package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities
{
	WebDriver driver; //null
	public WebDriverUtilities(WebDriver mydriver)
	{
		driver = mydriver;
	}
	//Handle button , Handle Textbox , Handle dropdown
		//generic | utility function
		public void clickElement(String myxpath)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath))).click();
		}
		public void enterText(String myxpath,String text)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath))).sendKeys(text);;
		}	
		public void fixedWait(int timeInSec)
		{
			Actions actions = new Actions(driver);
			actions.pause(Duration.ofSeconds(timeInSec)).build().perform();
		}	
		public void clickEnter()
		{
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ENTER).build().perform();
		}
		public void clickTab()
		{
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB).build().perform();
		}


}
