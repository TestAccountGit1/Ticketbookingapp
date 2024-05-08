package com.test.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.base.BaseClass;
import com.test.pages.TrainDetails;
import com.test.pages.confirmTktPage;
import com.test.testinput.DataProviders;

public class TC2_TrainDetailComparison extends BaseClass{
	TrainDetails train;
	confirmTktPage confirm;
	@Test(dataProvider="dp" ,dataProviderClass= DataProviders.class , priority=5,groups="smoke")
	public void getTrainName(Object[] name) {
		Object name1 = null;
		
		confirm = new confirmTktPage();
		confirm.scrollDown();
		train = confirm.clickEle();
		
		for(Object data :name) {
		  name1 = data;
		  System.out.println(name1);
		}
		
		List<WebElement> details = train.trainDetails();
		for(WebElement detail : details)
		{
				System.out.println(detail.getText());
			
			
		}
		
		
	}

}
