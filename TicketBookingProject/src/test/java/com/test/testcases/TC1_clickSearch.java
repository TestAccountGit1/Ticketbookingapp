package com.test.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.base.BaseClass;
import com.test.pages.TrainDetails;
import com.test.pages.confirmTktPage;

public class TC1_clickSearch extends BaseClass {
	
	confirmTktPage confirm;
	TrainDetails train;
	
	@Test(description = "First test method", priority=0, groups="smoke")
	public void clickSearchTicket() {
		confirm = new confirmTktPage();
		System.out.println(confirm.checkVisibility());
		Assert.assertTrue(confirm.checkVisibility());
		confirm.scrollDown();
		train = confirm.clickEle();
		train.screenshotMethod();
		List<WebElement> details = train.trainDetails();
		System.out.println(details.size());
		
	}
	
	@Test(expectedExceptions=ArithmeticException.class ,groups="smoke" , priority=1)
	public void division()
	{
		int a=10 , b=0;
		int sum = a/b;
		System.out.println(sum);
		
	}
	
	@Test(dependsOnMethods = "division" ,groups="smoke" ,priority=2 )
	public void addition()
	{
		int a=10 , b=0;
		int sum = a+b;
		System.out.println(sum);
		
	}
	@Test(groups="smoke" ,priority=3)
	public void divisionagain()
	{
		int a=10 , b=0;
		int sum = a/b;
		System.out.println(sum);
		
	}
	
	@Test(dependsOnMethods = "divisionagain" ,groups="smoke" ,priority=4)
	public void additionagain()
	{
		int a=10 , b=0;
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	

}
