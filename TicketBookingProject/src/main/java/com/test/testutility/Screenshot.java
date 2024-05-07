package com.test.testutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.test.base.BaseClass;

public class Screenshot extends BaseClass{
	
	public static void screenshot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File imgLocation = ss.getScreenshotAs(OutputType.FILE);
		File folderLocation = new File("src\\test\\resources\\screenshot\\test1.png");
		try {
			FileHandler.copy(imgLocation, folderLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
