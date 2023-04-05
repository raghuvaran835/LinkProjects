package com.testlink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	static WebDriver driver;
	
	protected static WebDriver launch(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\raghuvr\\Documents\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\Users\\raghuvr\\Documents\\ChromeDriver\\firefoxdriver.exe");
			driver=new FirefoxDriver();	
		}
		else {
			System.out.println("Mentio Chrome or Firefox");
			return null;
		}
		driver.get("https://seleniumbase.io/demo_page/");
		driver.manage().window().maximize();
		return driver;
	}

}
