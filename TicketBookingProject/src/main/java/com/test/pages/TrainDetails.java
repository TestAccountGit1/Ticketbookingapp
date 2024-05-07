package com.test.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.actions.Action;
import com.test.base.BaseClass;
import com.test.testutility.Screenshot;

public class TrainDetails extends BaseClass {
	
	public TrainDetails()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-9']/div")
	private List<WebElement> trainsList;
	
	public List<WebElement> trainDetails()
	{
		Action.wait1(driver, 1000);
		return trainsList;
	}
	
	public void screenshotMethod()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Screenshot.screenshot();
	}


}
