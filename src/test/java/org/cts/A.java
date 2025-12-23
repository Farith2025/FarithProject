package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("Farith");
	WebElement passbox = driver.findElement(By.id("pass"));
	passbox.sendKeys("qwertyuio");
	driver.findElement(By.id("forgetpassword")).click();
	
	
	
	}

}
