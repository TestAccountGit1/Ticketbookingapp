package com.test.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.base.BaseClass;

public class Action extends BaseClass{
	
	public static boolean eleDisplayed(WebElement ele)
	{
		boolean flag = false;
		if(ele.isDisplayed() == true)
		{
		flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
		
	}
	
	public static void clicking(WebElement ele)
	{
		ele.click();
	}
	
	public static void scrolling()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100);");
	}
	public static void wait1(WebDriver driver , int timeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public static void wait2(WebElement ele , WebDriver driver , int timeout) {
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		waiting.until(ExpectedConditions.visibilityOf(ele));
	}

}
