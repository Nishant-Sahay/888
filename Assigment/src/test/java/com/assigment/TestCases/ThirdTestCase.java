package com.assigment.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AftoakyerMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.assigment.PageLocator.ThirdTestCasePage;
import com.assigment.base.TestBase;

public class ThirdTestCase extends TestBase implements ThirdTestCasePage{
	
	@BeforeMethod
    public void beforemethod() throws MalformedURLException, InterruptedException{
		
		TestBase.launchPageURL();
	}
	
	@Test
	public void test() throws Exception {
	try {
		
		
		driver.findElement(By.xpath(app)).click();


		Thread.sleep(3000);

		
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role=\"presentation\"]")));

		
		driver.switchTo().frame(driver.findElement(By.xpath(map)));
		
		
		driver.findElement(By.xpath(element)).click();

		//System.out.println(driver.getCurrentUrl());
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(menu)).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath(streetview)).getText());
		
		String expectedText = new String("Flat Earth View");
	} 
	catch(Exception ex)
	{
	ex.printStackTrace();
	
	}
	}
	
		

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
			
	//driver.close();
    	
	}
}
