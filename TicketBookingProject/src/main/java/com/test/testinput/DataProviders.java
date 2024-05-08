package com.test.testinput;

import org.testng.annotations.DataProvider;

import com.test.testutility.ExcelLibrary;

public class DataProviders {
	ExcelLibrary excel = new ExcelLibrary();
	@DataProvider(name="dp")
	public Object[] retriveData() {
		
		Object[] value = excel.excelread();
		return value;
		
		
	}

}
