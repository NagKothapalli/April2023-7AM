package heairarchialInheritance;

import org.junit.Test;

public class TestCases_M1 extends ReusableComponents
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

}
