package com.training.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
	
	getData("C:\\Users\\sufiyap\\eclipse-workspace\\TrainingAssignments\\src\\TestDataFile.xlsx", "Sheet1", 0,0);		
	
	}
	
	public static void getData(String srcPath, String sheetName, int rowData, int colData) throws IOException
	{
		File src=new File(srcPath);
		FileInputStream ip=new FileInputStream(src);

		XSSFWorkbook myWorkBook = new XSSFWorkbook (ip);
		XSSFSheet mySheet = myWorkBook.getSheet(sheetName); 
			
		String str=mySheet.getRow(rowData).getCell(colData).getStringCellValue();
		System.out.print(str);
				
		myWorkBook.close();

	}

}
