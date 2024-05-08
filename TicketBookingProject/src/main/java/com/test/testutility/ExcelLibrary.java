package com.test.testutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelLibrary {
	
	    @Test
	    public Object[] excelread() {
	        Object[] data = null;
	        try {
	            FileInputStream fis = new FileInputStream("src\\test\\resources\\Excelsheet\\NewProject.xlsx");
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);
	            XSSFSheet sheet = workbook.getSheet("Sheet1");
	            XSSFRow row = sheet.getRow(1);
	            int totalCells = row.getLastCellNum(); // Get the total number of cells in the row
	            data = new Object[totalCells];
	            for (int i = 0; i < totalCells; i++) {
	                XSSFCell cell = row.getCell(i);
	                switch (cell.getCellType()) {
	                    case STRING:
	                        data[i] = cell.getStringCellValue();
	                        break;
	                    case NUMERIC:
	                        data[i] = cell.getNumericCellValue();
	                        break;
	                    case BOOLEAN:
	                        data[i] = cell.getBooleanCellValue();
	                        break;
	                    case BLANK:
	                        data[i] = ""; // Or any other default value you prefer for blank cells
	                        break;
	                    default:
	                        data[i] = null; // Handle other cell types as needed
	                }
	            }
	            fis.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return data;
	    }
	}
