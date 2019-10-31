package com.assigment.TestCases;
import java.io.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.assigment.PageLocator.FirstTestCasePage;
import com.assigment.base.TestBase;




public class FirstTestCase extends TestBase implements FirstTestCasePage{

	
	
	
	
	@BeforeMethod
    public void beforemethod() throws MalformedURLException, InterruptedException{
		
		TestBase.launchPageURL();
		
			
		
    }
	
	
	
	@Test
	public void test() throws Exception{
		
		try {
			
			driver.findElement(By.xpath(btn_search)).sendKeys("Chemtrails");
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			  String resultTextValue = driver.findElement(By.xpath(requiredText)).getText();
			  
			  //System.out.println(driver.findElement(By.xpath("//ul[@role='listbox']//li[1]/descendant::div[@class='sbl1']")).getText());
		      String inputText = new String("Chemtrails");
		      inputText = inputText.toLowerCase();
		      //System.out.println(inputText);
		       
		      System.out.println(resultTextValue.contains(inputText));
		
	}
	catch(Exception ex)
		{
		ex.printStackTrace();
		
		}	
		}
	
	
	 @AfterMethod
		public void afterMethod(ITestResult testResult) {
				
		driver.close();
	    	
		}
	
	
	
	
	
}
