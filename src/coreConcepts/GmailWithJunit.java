package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Junit : Unit Test Framework . Used to execute Java test methods.
	//Unit Test Frameworks : Junit , TestNG
	//TestMethod : A Java function added with "@Test" annotation
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("TestCase : ComposeAndSendAnEmail");
	}
	@Test
	public void replyToAnEmail()
	{
		System.out.println("TestCase : ReplyToAnEmail");
	}
	@Test
	public void forwardAnEmail()
	{
		System.out.println("TestCase : Forward An Email");
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("TestCase : Delete An Email");
	}

}
