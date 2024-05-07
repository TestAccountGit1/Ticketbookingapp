package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.actions.Action;
import com.test.base.BaseClass;


public class confirmTktPage extends BaseClass{
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement buttonOption;
	
	public confirmTktPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkVisibility()
	{
		Action.wait1(driver, 1000);
		boolean result = Action.eleDisplayed(buttonOption);
		return result;
	}
	
	public TrainDetails clickEle()
	{
		Action.wait2(buttonOption, driver, 1000);
		Action.clicking(buttonOption);
		return new TrainDetails();
	}
	
	public void scrollDown()
	{
		Action.wait1(driver, 1000);
		Action.scrolling();
	}
	
	
}
