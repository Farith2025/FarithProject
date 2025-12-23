package org.cts;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	@Nullable
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	@Nullable
	String title = driver.getTitle();
	System.out.println(title);
	
	
	}

}
