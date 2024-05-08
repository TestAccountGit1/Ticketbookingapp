package com.test.testinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.test.base.BaseClass;

public class ReadInputData extends BaseClass{
	static Properties prob;
	public static String readData(String key) {
		String value =null;
		try {
			FileInputStream fis = new FileInputStream("src\\test\\resources\\PropertiesFile\\Input.properties");
			prob = new Properties();
			prob.load(fis);
			 value = prob.getProperty("URL");
           			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	
}
