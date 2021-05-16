package com.Test;

import java.util.Properties;

import org.testng.annotations.Test;

import com.Utility.ExcelRead;
import com.Utility.GenericMethods;

public class OrangeHrmLoginDemo 
{
	Properties pro;
	@Test
	public void hrmlogin() throws Exception
	{
		GenericMethods gen=new GenericMethods();
		ExcelRead exl=new ExcelRead();
		gen.openbrowser("chrome");
		gen.geturl();
		gen.enterdata("xpath",pro.getProperty("usernamexpath"),exl.data(0, 0,0));
		
		
	}
	

}
