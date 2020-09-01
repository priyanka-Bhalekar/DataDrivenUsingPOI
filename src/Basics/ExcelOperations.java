package Basics;

import com.util.Xls_Reader;

public class ExcelOperations {	
	public static void main(String args[])
	{
	
		//get the test data from excel
	Xls_Reader reader = new Xls_Reader("C:\\Users\\priyanka.bhalekar\\eclipse-workspace\\Selenium_project\\resources\\Testdata.xlsx");

	if( !reader.isSheetExist("Homepage"))
	{
	reader.addSheet("Homepage");
	}
	
	
	int columncount =reader.getColumnCount("registerationtestdata");
	System.out.println("The number of colums in registration sheet is" + columncount);
	
	System.out.print(reader.getCellRowNum("registerationtestdata", "firstname", "tom"));
	}
	


}
