package com.assigment.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;





public class TestBase {
	


	
	 public static final String URL = "https://www.google.com/"; 
	 public static  WebDriver driver;
	 
	
	 public static void launchPageURL() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get(URL);
		
		
				
		}

	 
	
	
	
	
}
	
	
	
	
	


