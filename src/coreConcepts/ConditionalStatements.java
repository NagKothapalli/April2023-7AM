package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//if , if else , else if , nested if , switch case
	int a = 22;
	int b = 22;
	//if(Expression -> boolean : true/false){ Task }
	@Test
	public void compareNumbers()
	{
		int c = 28;
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		System.out.println("Third Number :" + c);
		if(a==b)  // = : assignment    , == : relational 
		{ //true
			System.out.println("Both A and B are equal");
		}
		System.out.println("End of my program");
	}
	@Test
	public void compareNumbers_abc()  //TDD : Test Driven Development
	{
		compareNumbers(44,44);
		compareNumbers(24,44);
	}
	public void compareNumbers(int a,int b) //Dev code / source code
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if(a==b)  // = : assignment    , == : relational 
		{ //true
			System.out.println("Both A and B are equal");
		}
		System.out.println("End of my program");
	}
	@Test
	public void compareNumbers_ifelse_test()
	{
		compareNumbers_ifelse(55,88); // 4/8   = 50
		compareNumbers_ifelse(55,55); // 4/8   = 50
	}
	//Code Coverage = Lines covered / Total Lines * 100
	public void compareNumbers_ifelse(int a,int b) //Dev code / source code
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if(a==b)  // = : assignment    , == : relational 
		{ //true
			System.out.println("Both A and B are equal");
		}
		else
		{ //false
			System.out.println("Both A and B are  equal");
		}
		System.out.println("End of my program");
	}
	@Test
	public void printAll()
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		//System.out.println("Third Number :" + c);
	}

}
