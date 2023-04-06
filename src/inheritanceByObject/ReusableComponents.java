package inheritanceByObject;

public class ReusableComponents
{
	public ReusableComponents() //default constructor
	{
		System.out.println("Open Google Chrome as Default Browser");
		System.out.println("Delete the temp records in data base");
	}
	public ReusableComponents(String browser)
	{
		System.out.println("Open Browser of user choice :" + browser);
		System.out.println("Delete the temp records in data base");
	}
	public ReusableComponents(String browser,int version)
	{
		System.out.println("Open Browser of user choice :" + browser + " with version as :" + version);
		System.out.println("Delete the temp records in data base");
		//we have to write the required logic to open browser
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
