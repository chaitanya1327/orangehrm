package exceldataread;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadAllData 
{
	@Test
	public void readalldata() throws Exception
	{
		File src=new File("C:\\Users\\HP\\git\\orangehrm\\orangeHrmAddUser\\testdata\\testdata1.xlsx");
		FileInputStream fin=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			int columncount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<columncount;j++)
			{
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("get the all data from excel is: "+data);
			}
		}
		
	}

}
