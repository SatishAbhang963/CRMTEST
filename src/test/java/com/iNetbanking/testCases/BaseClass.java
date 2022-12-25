package com.iNetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public String url="https://www.demo.guru99.com/V4/";
	public String uname="mngr444882";
    public String password="nyvupet";
    
    
    @BeforeClass
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    }
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
    

}
