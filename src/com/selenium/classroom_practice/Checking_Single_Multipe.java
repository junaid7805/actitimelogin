package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checking_Single_Multipe {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		WebElement element=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(element);
		s.selectByVisibleText("INDIA");
		System.out.println(s.isMultiple());

	}

}
