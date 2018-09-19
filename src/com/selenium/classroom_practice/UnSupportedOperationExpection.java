package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UnSupportedOperationExpection {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html");
		WebElement element=driver.findElement(By.name("country"));
		Select s=new Select(element);
		s.selectByValue("canada");
		
	}

}
