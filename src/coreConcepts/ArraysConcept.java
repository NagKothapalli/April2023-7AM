package coreConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class ArraysConcept
{
	//Array : Group of memory locations with similar data type
	//Fixed Array : Length of the array is fixed and Values in the array also fixed.We have to assign
	       //the values at the time of declaration only.
	//Dynamic Array : Length of the array is fixed and values can be assigned in run time.
	
	//Collection : ArrayList
	//               Modifier[opt]   Datatype   name = value;
	public int stdNum = 22;
	//Fixed Array :  Modifier[opt]   Datatype[]   name = {values};
	public int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,18,79};
	//unchecked | run time exception : java will throw at run time
	             //java.lang.ArrayIndexOutOfBoundsException ,//java.lang.ArithmeticException: / by zero
	//checked | compile time exception : java will throw this exception at compile time
	             //throws FileNotFoundException
	//Declaration , Assignment , Length , Reading , Writing  - Array
	// Adding new elements , Deleting the elements from the collection - Collection
	
	@Test
	public void fixedIntegerArray() 
	{
		//          index    0 1  2 3 4 5 6 7  8  9  10
		int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,18,79};
		int len = stdNumbers.length;
		System.out.println("length :" + len);
		int a = stdNumbers[3]; // reading 
		for(int i=0;i<len;i++) //1 - 11     //0-[len-1]
		{
			int val = stdNumbers[i];
			System.out.println(val);
		}
		//int d = 222 / 0;
		//stdNumbers[13] = 252; // 0 1 2 3  //writing		
		for(int i=0;i<len;i++)
		{
			//FileInputStream file = new FileInputStream("C:\\Data\\TestData.xls");
			stdNumbers[i] = 22+i; // i=0 1 2 3 4 5 ..... // writing
			System.out.println("Elements after :" + stdNumbers[i]); // reading
		}
	} 
	
	//Fixed Array   :  Modifier[opt]   Datatype[]   name = {values .......};
	//Dynamic Array :  Modifier[opt]   Datatype[]   name = new int[size];
	@Test
	public void dynamicIntegerArray() 
	{
		//          index    0 1  2 3 4 5 6 7  8  9  10
		//int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,18,79};
		int[] stdNumbers = new int[10];
		int len = stdNumbers.length;
		System.out.println("length :" + len);
		int a = stdNumbers[3]; // reading 
		for(int i=0;i<len;i++) //1 - 11     //0-[len-1]
		{
			int val = stdNumbers[i];
			System.out.println(val);
		}
		//int d = 222 / 0;
		//stdNumbers[13] = 252; // 0 1 2 3  //writing		
		for(int i=0;i<len;i++)
		{
			//FileInputStream file = new FileInputStream("C:\\Data\\TestData.xls");
			stdNumbers[i] = 22+i; // i=0 1 2 3 4 5 ..... // writing
			System.out.println("Elements after :" + stdNumbers[i]); // reading
		}
	} 

	//Collection : ArrayList  - Inheritance - How to create an object of a class
	
	
	
	
	
	
	
	
	
	
	
}
