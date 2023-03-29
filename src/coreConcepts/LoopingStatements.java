package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColor()
	{
		System.out.println("Apply Color to Step #1");
		System.out.println("Apply Color to Step #2");
		System.out.println("Apply Color to Step #3");
		System.out.println("Apply Color to Step #4");
		System.out.println("Apply Color to Step #5"); //10 steps 20 steps ... 100 steps
		System.out.println("Apply Color to Step #1");
		System.out.println("Apply Color to Step #2");
		System.out.println("Apply Color to Step #3");
		System.out.println("Apply Color to Step #4");
		System.out.println("Apply Color to Step #5");
		System.out.println("Apply Color to Step #1");
		System.out.println("Apply Color to Step #2");
		System.out.println("Apply Color to Step #3");
		System.out.println("Apply Color to Step #4");
		System.out.println("Apply Color to Step #5");
		System.out.println("Apply Color to Step #1");
		System.out.println("Apply Color to Step #2");
		System.out.println("Apply Color to Step #3");
		System.out.println("Apply Color to Step #4");
		System.out.println("Apply Color to Step #5");
	}
	
	//WAP to apply color to 50 steps
	
	//for(starting point ; how long ; count) {    Task   } 
	
	//for(int iterator ; expression ; step size) { Task }
	@Test
	public void applyColorToSteps()
	{
		//(int i=1;i<50;i=i+1) // i=1 2 3 49 /   1<50 2<50 3<50......49<50 50<50
		for(int i=1;i<=50;i=i+1) // i=1 2 3 49 /   1<50 2<50 3<50......49<=50 50<=50
		{ //true
			//Task - apply color
			System.out.println("Apply Color to Step #" + i);
		}
	}
	@Test
	public void applyGreenColorToEvenSteps()
	{
		for(int i=2;i<=50;i=i+2) // 2+2 = 4+2 = 6+2 = 8+2 = 10+2 = 12
		{
			System.out.println("Apply Green Color to Step #" + i);
		}
	}
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int i=1;i<=50;i=i+2) //1+2 = 3+2 = 5+2 = 7+2 = 9 .....	
		{
			System.out.println("Apply Red Color to Step #" + i);
		}
	}
	@Test
	public void findStudent() //Roll Num = 22
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("Searching Students :" + i);
			if(i==22)
			{
				System.out.println("Found the Student");
				break;
			}
		}
		System.out.println("This is the line after for loop");
	}
	
	@Test
	public void findStudent_array() //Roll Num = 22
	{
		int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,22,18,79};
		for(int i=0;i<=stdNumbers.length;i++)
		{
			System.out.println("Searching Students :" + stdNumbers[i]);
			if(stdNumbers[i]==22) // i = 0 1 2 3 4 5 6 ......
			{
				System.out.println("Found the Student");
				break;
			}
		}
		System.out.println("This is the line after for loop");
	}
	@Test
	public void findTheStudent_test()
	{
		int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,22,18,79};
		boolean result = findTheStudent(stdNumbers,18);
		if(result)
		{
			System.out.println("Given Std Num paid the fee");
		}
		else
		{
			System.out.println("Given Std did not paid the fee");
		}
	}
	
	public boolean findTheStudent(int[] allStudents,int stdNoToFind)
	{
		boolean flag = false;
		for(int s=0;s<allStudents.length;s++)
		{
			System.out.println("Searching Students :" + allStudents[s]); // 0 1 2 3 4 5 ....
			if(stdNoToFind == allStudents[s])
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	@Test
	public void findDuplicate()
	{
		int[]  stdNumbers = {2,24,6,4,7,8,9,56,23,22,18,79,34,45,67,3,23,56,7,45,34,22,56,78,34,22};
		int count = 0;
		for(int i=0;i<stdNumbers.length;i++)
		{
			if(stdNumbers[i] == 22)
			{
				count++; // count = count+1;
			}
		}
		System.out.println("Total Count :"+count);
	}
	
	//WAP to demonstrate nested for loop	
	//Building - 5 Floors - Each Floor 20 steps - 	
	//Contractor  - he will count floors
	//5 workers - he will count steps in a floor
	@Test
	public void applyColorToFiveFloors()
	{
		for(int floor=1;floor<=5;floor++)
		{
			System.out.println("Work is going on in Floor :" + floor);
			//In ith floor apply color to 20 steps
			for(int step=1;step<=20;step++)
			{
				System.out.println("Apply Color to Step :" + step);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
