package tMethods;

import org.junit.Test;

import rComponents.ReusableComponents;
//             child              parent
public class TestCases extends ReusableComponents
{
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

}
