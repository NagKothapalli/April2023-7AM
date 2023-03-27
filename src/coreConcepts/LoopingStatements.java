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
