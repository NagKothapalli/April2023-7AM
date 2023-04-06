package inheritanceByObject;

import org.junit.Test;
//             child              parent
public class TestCases //extends ReusableComponents ,Father,Mother,GrandFather
{
	//Execution flow : all class level variables will be loaded -> my constructor -> test methods
	//Modifier  ClassName  objectName = new Constructor();
	//public ReusableComponents  rcObj = new ReusableComponents(); //default constructor
	//public ReusableComponents  rcObj = new ReusableComponents("firefox");
	public ReusableComponents  rcObj = new ReusableComponents("firefox",99);
	public int number = 22;
	public String name = "Ram";
	//public Father fatherObj = new Father();
	//public Mother motherObj = new Mother();
	//public GrandFther gfObj = new GrandFather();
	@Test
	public void composeAndSendAnEmail() //Raj
	{
		System.out.println("TestCase : ComposeAndSendAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.compose();
		rcObj.send();
		rcObj.loginToApplication();
		rcObj.closeApplication();
	}
	@Test
	public void replyToAnEmail() // Ramesh
	{
		System.out.println("TestCase : ReplyToAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.reply();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
				//login - 20 lines code
	}
	@Test
	public void forwardAnEmail() // Rajesh
	{
		System.out.println("TestCase : Forward An Email");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.forward();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}
	@Test
	public void deleteAnEmail() //Ram
	{
		System.out.println("TestCase : Delete An Email");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.delete();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}

}
