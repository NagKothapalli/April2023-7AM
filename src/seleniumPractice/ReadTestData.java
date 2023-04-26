package seleniumPractice;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadTestData
{
	
	Properties prop;
	FileInputStream myfile;
	String filePath;
	public ReadTestData(String environment)
	{
		filePath = "TestData/"+environment+"Data.properties";
	}
	public String getData(String mykey) //URL
	{		
		try {
			myfile = new FileInputStream(filePath);
			prop = new Properties(); //news reader
			prop.load(myfile); // give the paper to reader
		} catch (Exception  e) {
			System.out.println("Got this exception :" + e);
		}//news paper		
		String myvalue = prop.getProperty(mykey);	//URL
		return myvalue;
	}

}
