package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Junit : Unit Test Framework . Used to execute Java test methods.
	//Unit Test Frameworks : Junit , TestNG
	//TestMethod : A Java function added with "@Test" annotation
//*******************Test Suites **********************
	@Test
	public void smokeSuite() //BVT : Build Validation Test
	{
		System.out.println("TestSuite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail(); // we may have around 10|15 test cases as SMOKE
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail(); // we may have around 100 test cases as Regression
		forwardAnEmail();
		deleteAnEmail();
	}
//**********************Test Cases *********************
	@Test
	public void composeAndSendAnEmail() //Raj
	{
		System.out.println("TestCase : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail() // Ramesh
	{
		System.out.println("TestCase : ReplyToAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
				//login - 20 lines code
	}
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
	//*****************Reusable Components***********************
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//here i will write total 10 lines of code to launch the application
	}
	public void loginToApplication()
	{
		System.out.println("Login to Application");
		//here i will write total 20 lines of code to launch the application
	}
	public void logoutFromApplication()
	{
		System.out.println("Logout From Application");
		//here i will write total 10 lines of code to launch the application
	}
	public void closeApplication()
	{
		System.out.println("Close Application");
		//here i will write total 20 lines of code to launch the application
	}
	public void compose()
	{
		System.out.println("Compose Email");
	}	
	public void send()
	{
		System.out.println("Send Email");
	}	
	public void open()
	{
		System.out.println("Open an Email");
	}	
	public void reply()
	{
		System.out.println("Reply to Email");
	}
	public void forward()
	{
		System.out.println("Forward an Email");
	}
	public void delete()
	{
		System.out.println("Delete an Email");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
