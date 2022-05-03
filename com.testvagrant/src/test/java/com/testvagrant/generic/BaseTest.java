package com.testvagrant.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoconst {
	public static WebDriver driver;

	@BeforeClass
	public void setUp() throws Throwable 
	 { 
		FileLib flib = new FileLib();
		String browserValue = flib.getPropkeyValue(PROP_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(Chrome_Key, Chrome_Value);
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("Enter correct browser name");
		}
	

}
	@AfterClass
	public void tearDown()  
	 { 
		driver.quit();
	 }
}
