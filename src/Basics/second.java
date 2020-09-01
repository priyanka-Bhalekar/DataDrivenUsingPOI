package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.yahoo.com/");
	System.out.println(	driver.getTitle());
	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
	
	driver.navigate().back();
	System.out.println(driver.getWindowHandle());
	
	driver.close();// it closes current browser window
	//driver.quit();// it closes all opened windows
	
	
	
	
		
		
		
	}

}
