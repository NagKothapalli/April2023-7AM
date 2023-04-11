package calculator;

public class MiniCalculator implements ArithemeticOperations
{
	public void displayMiniLogo()
	{
		System.out.println("Welcome to Casio Mini Calculator");
	}
	
	public int addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public int division(int a,int b)
	{
		int div = a/b;
		return div;
	}
	public int subtraction(int a,int b)
	{
		int diff = a-b;
		return diff;
	}
	public int multiplication(int a,int b)
	{
		int prod = a*b;
		return prod;
	}

}
