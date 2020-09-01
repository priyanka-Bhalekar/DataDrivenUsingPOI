package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.Xls_Reader;

public class DataDrivenByExcelTest {
	static WebDriver driver ;
	public static void main(String args[])
	{
	        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usag=294&ru=");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			
			
			 Xls_Reader reader = new Xls_Reader("C:\\Users\\priyanka.bhalekar\\eclipse-workspace\\Selenium_project\\resources\\Testdata.xlsx");
			
	         int i=reader.getRowCount("registerationtestdata");
			 for(int rownum=2;rownum<=i ;rownum++)
	    {
			System.out.println("******");
	    	String firstname =reader.getCellData("registerationtestdata", "firstname", rownum);
	    	System.out.println(firstname);
	    	String lastname =reader.getCellData("registerationtestdata", "lastname", rownum);
	    	System.out.println(lastname);
	    	String address1 =reader.getCellData("registerationtestdata", "address1", rownum);
	    	System.out.println(address1);
	    	String address2 =reader.getCellData("registerationtestdata", "address2", rownum);
	    	System.out.println(address2);
	    	String city =reader.getCellData("registerationtestdata", "city", rownum);
	    	System.out.println(city);
	    	String state =reader.getCellData("registerationtestdata", "state", rownum);
	    	System.out.println(state);
	    	String zip =reader.getCellData("registerationtestdata", "zip", rownum);
	    	System.out.println(zip);
	    	String email =reader.getCellData("registerationtestdata", "email", rownum);
	    	System.out.println(email);
	    	
	    	driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	    	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	    	driver.findElement(By.xpath("//input[@id='lastname']")).clear();
	    	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
	    	driver.findElement(By.xpath("//input[@id='address1']")).clear();
	    	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
	    	driver.findElement(By.xpath("//input[@id='address2']")).clear();
	    	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
	    	driver.findElement(By.xpath("//input[@id='city']")).clear();
	    	driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	    	
	    	Select statedd= new Select(driver.findElement(By.xpath("//select[@id='state']")));
	    	statedd.selectByVisibleText(state);
	    	
	    	driver.findElement(By.xpath("//input[@id='zip']")).clear();
	    	driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
	    	driver.findElement(By.xpath("//input[@id='email']")).clear();
	    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    	driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
	    	driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(email);
	    	
	    
	    
	    
	    
	    
	    
	    }
			
	}
}
