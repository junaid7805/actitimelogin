package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnable_IsSelected_IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkbox.isDisplayed())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(checkbox.isEnabled())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(checkbox.isSelected())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
