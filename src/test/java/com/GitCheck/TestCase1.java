package com.GitCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	WebDriver driver;
	@Test
	public void method1(){
		
		System.out.println("1");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madan\\Documents\\New folder\\GitCheck\\chromedriver.exe");
		 driver =new ChromeDriver();
	        String baseurl = "http://www.google.com/";
	        driver.get(baseurl);
	        System.out.println();
	    }
	}
	

