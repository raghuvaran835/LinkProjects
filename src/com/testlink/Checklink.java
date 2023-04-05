package com.testlink;

import org.openqa.selenium.WebElement;

public class Checklink extends Base {
	
	public static void testlink(WebElement e,String currentUrl) {
		e.click();
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
	
		if(curl.equals(currentUrl))
		{
			System.out.println("Page not configured Properly");
			
		}
		else {
			System.out.println("page configured properly");
		}
	}

}
