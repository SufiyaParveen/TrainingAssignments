package com.training.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileAllData {

	public static void main(String[] args) throws Exception {


		for (int i=0;i<=4;i++)
		{
			for (int j=0;j<=1;j++)
			{
				getData("C:\\Users\\sufiyap\\eclipse-workspace\\TrainingAssignments\\src\\TestDataFile.xlsx", "Sheet1", i,j);		
			}
			System.out.println(" ");
		}

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
