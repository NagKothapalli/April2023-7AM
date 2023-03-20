package coreConcepts;

public class DifferentMethods
{
	//psvm
	//Java Compiler , Run Time System
	public static void main(String[] args)
	{
		System.out.println("Here we will write some methods to return value");
		//return 44;
		addition();
		addition(44,66);
		int result = addition(22,44,66);
		System.out.println(result);
	}
	// 0  0
	public static void addition()
	{
		int sum = 22+25; //fixed | hard code values
		//System.out.println("Sum of two numbers :"+ sum);
	}
	// 0 1
	public static void addition(int a,int b)
	{
		int sum = a+b;
		//System.out.println("Sum of two numbers [a b] :"+ sum);
	}
	// 1   1
	public static int addition(int a,int b,int c)
	{
		int sum = a+b+c;
		return sum;
	}

}
