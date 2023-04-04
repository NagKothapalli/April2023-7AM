package multilevelInheritance;

import org.junit.Test;
//              A      extends B   extends C  -> A inherits C automatically
public class TestSuites extends TestCases
{
	/*
	 * public void launchApplication() {
	 * System.out.println("Launch Application  from TS"); //here i will write total
	 * 10 lines of code to launch the application }
	 */
	//*******************Test Suites **********************
		@Test
		public void smokeSuite() //BVT : Build Validation Test
		{
			System.out.println("TestSuite : SMOKE");
			launchApplication();
			//composeAndSendAnEmail();
			//replyToAnEmail(); // we may have around 10|15 test cases as SMOKE
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

}
