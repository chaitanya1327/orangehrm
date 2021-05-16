package com.Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.Utility.ExcelRead;
import com.Utility.GenericMethods;

public class OrangeHrmLoginDemo 
{
	Properties pro;
	public OrangeHrmLoginDemo() throws Exception
	{
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\HP\\eclipse\\practice programs\\orangeHrmAddUser\\properties\\application.properties");
		pro = new Properties();
		pro.load(fin);
	}
	
	@Test
	public void hrmlogin() throws Exception
	{
		GenericMethods gen=new GenericMethods();
		ExcelRead exl=new ExcelRead();
		gen.openbrowser("chrome");
		gen.geturl();
		gen.enterdata("xpath",pro.getProperty("usernamexpath"),exl.exceldata(0,0,0));
		gen.timeout();
		gen.enterdata("xpath",pro.getProperty("passwordxpath"),exl.exceldata(0,0,1));
		gen.click("xpath",pro.getProperty("login"));
		
		
		
	}
	

}
