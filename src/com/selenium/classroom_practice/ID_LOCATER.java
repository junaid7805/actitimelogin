package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID_LOCATER {
	public static void main(String[] args) {
	    WebDriver driver=new FirefoxDriver(); 
	    driver.get("https://www.facebook.com/");
	    WebElement emailTextField=driver.findElement(By.id("email"));
	    emailTextField.sendKeys("subha");
	//driver.findElement(By.id("email")).sendKeys("subha");
		}

}
