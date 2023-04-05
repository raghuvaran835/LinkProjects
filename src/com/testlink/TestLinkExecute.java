package com.testlink;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestLinkExecute extends Base {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=launch("Chrome");
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Checklink.testlink(driver.findElement(By.id("myLink1")), currentUrl);
		driver.navigate().back();
		
		Checklink.testlink(driver.findElement(By.id("myLink2")), currentUrl);
		driver.navigate().back();
		
		Checklink.testlink(driver.findElement(By.id("myLink3")), currentUrl);
		driver.navigate().back();
		
		Checklink.testlink(driver.findElement(By.id("myLink4")), currentUrl);
		driver.navigate().back();
		
		

	}

}
