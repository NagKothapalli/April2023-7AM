package coreConcepts;
//Syntax /signature : CLASS
  //Modifier[opt]   class   Name{  Members:variables/ functions }
  //Access Modifier : private , default , protected , public
  //Non-Access  : static , final
public class BasicConcepts
{
	//Naming conventions : It should start with Uppercase letter , no special chars , no space 
	//Class contains members : variables / functions[method]
	//Syntax / signature
	//Syntax /signature : VARIABLE
	 //Modifier[opt]   DataType  Name;   - declaration
	//Modifier[opt]   DataType  Name  = value ; - assignment
	
	public static String collegeName = "JNTU";
	public static final int    intrestRate = 2;
	
	//student - rollNum , Marks , Grade , name , result
	public   int    stdNum = 22; // 24,27,29,12,14,4,8,.....
	private  double  stdMarks  = 98.44;
	protected  char    stdGrade  = 'A'; // A B C D E R G T H DFFHGFDVDSV 
	String   stdName = "Ram"; // Ravi , Raj , RMESH,  dsfdsf, sfdsfdsf, asdsd , tryt, 
	public  boolean stdResult = true; //true / false
	
	String empNum = "Ram"; //   sugar , fdsfdsfds ,vbcvbv, tyytryrt
	
	int sfdfd = 25;
	
	//integer   : byte  ,  short ,  int  ,   long 
	//rice bag  : 10 Kg ,  20 Kg ,  40 Kg  , 80 Kg
	
	byte num1 = 99;
	short num2 = 9999;
	int num3 = 99999999;
	long num4 = 999999999;
	double num5 = 94.45;
	int percentage = 95;
	
	//psvm
	
	public static void main(String[] args)
	{
		//syso  Ctrl+SpaceBar
		System.out.println("Welcome to Selenium Java");
		openDoor();
		
		openDoor(2);
		openDoor(1);
		openDoor(4);
		openDoor(3);
		
		openDoor("East");
		openDoor("West");
		
		openDoor("East",2);
		openDoor("West",4);
		
		openDoor(3,"North");
		
		
	}
	
	//Syntax /signature : FUNCTION
	   //Modifier[opt]   ReturnType   Name(){  body  }
	                    // No - void
	                    // Yes - Datatype
	
	   //Modifier[opt]   ReturnType   Name(arguments[opt]){  body  }
	                                    //Datatype arg1,Datatype arg2,....
	//Naming Conventions for member of a class : variable / function
	
	//Member of a class can start with _ , $ , a-z , A-Z 
	  // It should follow camelCasing
	  // Constructor of a class should be same as class name
	
	int _stdNum; int $stdNum; int studNum; int StdNum; 	int stdNum1; int std1Num;
	//Ivalid names
	// int &stdNum  , int 1StdNum ; int std Num;  int std&Num;  int stdNum&;
	
	//Write a program to open the door , we have single door 
	//  0  0
	public static void openDoor() //Method Overloading  - Polymorphism - Oops
	{
		//i will follow the procedure to open the door 
		System.out.println("Door Opened after following the steps");
	}
	
	//Write a program to open the door , we have multiple doors	
	//  0  1
	public static void openDoor(int doorNumber)
	{
		//i will follow the procedure to open the door 
		System.out.println(doorNumber + "  : Door Opened after following the steps");
	}
	
	//Write a program to open the door , we have doors on four sides	
	// 0  1
	public static void openDoor(String door) //East , West , North , South
	{
		//i will follow the procedure to open the door 
		System.out.println(door + "  : Door Opened after following the steps");
	}
	
	//Write a program to open the door , we have four doors in each sides
	// 0  1
	public static void openDoor(String side,int doorNumber) //East - 1 2 3 4 , West-1 2 3 4 , North - 1 2 3 4 , South - 1 2 3 4
	{
		//i will follow the procedure to open the door 
		System.out.println(side + "  side  " + doorNumber + " : door Opened after following the steps");
	}
	
	//Write a program to open the door , we have four doors in each sides
	//0  1
	public static void openDoor(int doorNumber,String side) //East - 1 2 3 4 , West-1 2 3 4 , North - 1 2 3 4 , South - 1 2 3 4
	{
		//i will follow the procedure to open the door 
		System.out.println(doorNumber + " : door in the " + side + "  : side Opened after following the steps");
	   int num = Yahoo.intrestRate;
	}

}

//Own file of the class : if the class name and file name are same then that file will be the own file of that class
//A file can have only one public class
class Yahoo
{
	int empNumber = 22;
	public static  int intrestRate = 2;
}

class Amazon
{
	
}
