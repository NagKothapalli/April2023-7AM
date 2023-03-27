package coreConcepts;

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
	//java.lang.ArrayIndexOutOfBoundsException
	@Test
	public void fixedIntegerArray()
	{
		//          index    0 1  2 3 4 5 6 7  8  9  10
		int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,18,79};
		int len = stdNumbers.length;
		System.out.println("length :" + len);
		for(int i=0;i<len;i++) //1 - 11     //0-[len-1]
		{
			int val = stdNumbers[i];
			System.out.println(val);
		}
	}

}
