package com.Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.ExcelRead;
import com.Utility.GenericMethods;

public class OrangeHrmLoginDemo 
{
	Properties pro;
	WebDriver driver;
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
		gen.click("xpath",pro.getProperty("PIM"));
		gen.click("xpath", pro.getProperty("AddEmployee"));
		gen.enterdata("xpath",pro.getProperty("middlename"),exl.exceldata(0, 2, 0));
		gen.enterdata("xpath",pro.getProperty("lastname"),exl.exceldata(0, 3,0));
		gen.click("xpath",pro.getProperty("craetelogin"));
		gen.enterdata("xpath",pro.getProperty("username"),exl.exceldata(0, 4, 0));
		gen.enterdata("xpath",pro.getProperty("password"),exl.exceldata(0, 5, 0));
		gen.enterdata("name",pro.getProperty("confirmpassword"),exl.exceldata(0, 6, 0));
		
		
		System.out.println("done");
		//gen.teardown();
		
		
		
			
	}
	

}
