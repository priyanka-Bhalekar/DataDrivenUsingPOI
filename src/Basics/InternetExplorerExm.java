package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\IEdriver\\MicrosoftWebDriver.exe");
		WebDriver driver = new  InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Hello");

	}

}
