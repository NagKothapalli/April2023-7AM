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
	//WAP to read two numbers as inputs and perform addition if they are equal if not perform subtraction
	@Test
	public void workWithIfElse_test()
	{
		workWithIfElse(55,55);
		workWithIfElse(85,55);
		workWithIfElse(25,55);
		workWithIfElse(-55,55);
		workWithIfElse(85,-55);
	}
	
	public void workWithIfElse(int a,int b) //Dev code / source code
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		boolean flag = (a==b);
		System.out.println("My flag value :" + flag);
		if(flag)
		{ //true
			int sum = (a+b);  // int = int+int
			System.out.println("Sum of two Numbers :" + sum);
		}
		else
		{ //false
			int diff = (a-b);
			System.out.println("Difference of two Numbers :" + diff);
		}
	}
	
	//WAP to read two numbers as inputs and perform addition if they are equal,do subtraction if a>b and do multiplication if a<b
	@Test
	public void workWithElseIf_test()
	{
		workWithElseIf(44,44);
		workWithElseIf(22,88);
		workWithElseIf(66,12);
	}
	public void workWithElseIf(int a,int b) //Dev code / source code
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if(a==b) //true|false
		{ //true
			int sum = (a+b);  // int = int+int
			System.out.println("Sum of two Numbers :" + sum);
		}
		else if(a>b)
		{ //true
			int diff = (a-b);
			System.out.println("Difference of two Numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = (a*b);
			System.out.println("Product of two Numbers:"+prod);
		}
	}
	
	//WAP to read two numbers as inputs and perform the below task if and only if both inputs are above 10
	 //Task : perform addition if they are equal,do subtraction if a>b and do multiplication if a<b
	@Test
	public void workWithNestedIfCondition_test()
	{
		workWithNestedIfCondition(4,8);
		workWithNestedIfCondition(4,88);
		workWithNestedIfCondition(44,8);
		workWithNestedIfCondition(44,44);
		workWithNestedIfCondition(44,88);
		workWithNestedIfCondition(14,12);		
	}
	public void workWithNestedIfCondition(int a,int b)
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		//    T        T   -> T
		if((a>10) && (b>10)) // Outer if // &&(AND) : Logical Operator
		{
			//Task
			if(a==b) //Nested if - inner if  // == , < , > : Relational Operators
			{ //true
				int sum = (a+b); // + , - , * : Arithmetic Operators  // int = int+int
				System.out.println("Sum of two Numbers :" + sum);
			}
			else if(a>b)
			{ //true
				int diff = (a-b); // = : Assignment Operator
				System.out.println("Difference of two Numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = (a*b);
				System.out.println("Product of two Numbers:"+prod);
			}			
		}
		else
		{
			//not above 10
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}
	@Test
	public void workWithNestedIfCondition2_test()
	{
		workWithNestedIfCondition2(4,6);
		workWithNestedIfCondition2(44,6);
		workWithNestedIfCondition2(4,66);
		workWithNestedIfCondition2(24,24);
		workWithNestedIfCondition2(44,26);
		workWithNestedIfCondition2(24,66);
	}
	
	public void workWithNestedIfCondition2(int a,int b)
	{		
		//    T        T   -> T
		if((a>10) && (b>10)) // Outer if // &&(AND) : Logical Operator
		{
			workWithElseIf(a,b);//Task			
		}
		else
		{	//not above 10
			System.out.println("First Number :" + a);
			System.out.println("Second Number :" + b);
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void printAll()
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		//System.out.println("Third Number :" + c);
	}

}
