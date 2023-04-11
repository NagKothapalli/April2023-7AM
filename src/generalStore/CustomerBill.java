package generalStore;

import org.junit.Test;

import calculator.ArithemeticOperations;
import calculator.MiniCalculator;

public class CustomerBill
{
	@Test
	public void giveBilltoCustomer()
	{
		int prod1=12332434;
		int prod2=17867534;
		//ClassName  obj   = new ClassName();
		MiniCalculator mCalc = new MiniCalculator();		
		mCalc.displayMiniLogo();
		int bill = mCalc.addition(prod1, prod2);
		System.out.println("Customer Bill :" + bill);
		//InterfaceName obj = new ClassName();
		//WebDriver driver = new ChromeDriver();
		ArithemeticOperations aCalc  = new MiniCalculator();		
		aCalc.addition(prod1, prod2);
	}

}
