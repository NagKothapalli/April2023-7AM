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
	public void printAll()
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		//System.out.println("Third Number :" + c);
	}

}
