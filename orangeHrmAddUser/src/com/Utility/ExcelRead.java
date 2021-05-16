package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	public String exceldata(int sheetnum, int rownum, int columnnum) throws Exception 
	{

		File src = new File("C:\\Users\\HP\\git\\orangehrm\\orangeHrmAddUser\\testdata\\testdata1.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheetAt(sheetnum);
		String data = sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
		wb.close();
		return data;
		

	}
}