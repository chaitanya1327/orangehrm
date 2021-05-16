package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericMethods {
	WebDriver driver;
	Properties pro;

	public GenericMethods() throws Exception 
	{
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\HP\\eclipse\\practice programs\\orangeHrmAddUser\\properties\\application.properties");
		pro = new Properties();
		pro.load(fin);
	}

	public void openbrowser(String browsername) throws Exception 
	{

		if (browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		else if (browsername.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver", pro.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
	}

	public void geturl() 
	{
		driver.get(pro.getProperty("url"));
	}
	
	public void timeout() throws InterruptedException
	{
		Thread.sleep(5000);
	}

	public void enterdata(String locatortype, String locatorvalue, String data) 
	{
		if (locatortype.equals("name")) 
		{
			driver.findElement(By.name(locatorvalue)).sendKeys(data);
		} 
		else if (locatortype.equals("xpath")) 
		{
			driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		} 
		else if (locatortype.equals("id"))
		{
			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}

	}

	public void click(String locatortype, String locatorvalue) 
	{
		if (locatortype.equals("name"))
		{
			driver.findElement(By.name(locatorvalue)).click();
		} 
		else if (locatortype.equals("xpath")) 
		{
			driver.findElement(By.xpath(locatorvalue)).click();
		} 
		else if (locatortype.equals("id")) 
		{
			driver.findElement(By.id(locatorvalue)).click();
		}
	}
	public void teardown()
	{
		driver.quit();
	}
	

}
