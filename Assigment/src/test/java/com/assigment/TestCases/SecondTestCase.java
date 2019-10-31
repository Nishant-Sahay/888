package com.assigment.TestCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.assigment.PageLocator.Chemtrails1;
import com.assigment.PageLocator.SecondTestCasePage;
import com.assigment.base.TestBase;

public class SecondTestCase extends TestBase implements SecondTestCasePage{
	
	

	@BeforeMethod
    public void beforemethod() throws MalformedURLException, InterruptedException{
		
		TestBase.launchPageURL();
		
			
		
    }
	
	
	
	@Test
	public void test() throws Exception{
		
		try {
			
			driver.findElement(By.name(btn_search)).sendKeys("Dealey Plaza");
			
			
			driver.findElement(By.name(btn_search)).sendKeys(Keys.ENTER);
			
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"dimg_46\"]"));
	        String resultTextValue = element2.getAttribute("title");

	        String inputText = new String("Dealey Plaza");
		    //inputText = inputText.toLowerCase();
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