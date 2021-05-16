package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelRead() throws IOException
	{
		File src=new File("C:\\Users\\HP\\eclipse\\practice programs\\orangeHrmAddUser\\testdata\\testdata 1.xlsx");
		FileInputStream fin=new FileInputStream(src);
		wb=new XSSFWorkbook(fin);	
	}
	public String data(int sheetnum,int rownum,int columnnum) throws Exception
	{
	
	XSSFSheet sheet=wb.getSheetAt(sheetnum);
	String data=sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
	return data;

}
}