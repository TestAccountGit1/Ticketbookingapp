package com.test.testinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.base.BaseClass;

public class ReadInputData extends BaseClass{
	static Properties prob;
	@Test
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	@DataProvider(name="dp")
	public void excelValue(String sheetName)
	{
		//Object[][] data = new Object[][];
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src\\test\\resources\\Excelsheet\\NewProject.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		
		
	}

}
