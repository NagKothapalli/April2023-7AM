package heairarchialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents//,TestCases_M2
{
	@Test
	public void forwardAnEmail() // Rajesh
	{
		System.out.println("TestCase : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail() //Ram
	{
		System.out.println("TestCase : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
