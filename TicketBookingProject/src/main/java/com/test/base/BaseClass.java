package com.test.base;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.testinput.ReadInputData;
import com.test.testutility.ExtentReport;
import com.test.testutility.Log;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite(groups="smoke")
	public void startAutomationSuite()
	{
		DOMConfigurator.configure("log4j.xml");
		ExtentReport.setExtent();
		System.out.println("Project started");
	}
	
	@AfterSuite(groups="smoke")
	public void endAutomationSuite()
	{
		System.out.println("Project ended");
	}
	
	@Parameters("browserName")
	@BeforeMethod(groups="smoke")
	public void launchBrowser(@Optional("chrome") String browserName)
	{
	
		try {
		if(browserName.equalsIgnoreCase("chrome") ) {
			driver = new ChromeDriver();
			
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(ReadInputData.readData("URL"));
		driver.manage().window().maximize();
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}

}
	@AfterMethod(groups="smoke")
	public void tearDown()
	{
		ExtentReport.endReport();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	
	}
	
}
