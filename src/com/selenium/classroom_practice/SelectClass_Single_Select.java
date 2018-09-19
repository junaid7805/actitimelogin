package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Single_Select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html");
		WebElement element=driver.findElement(By.name("country"));
		Select s=new Select(element);
		s.selectByVisibleText("United States");
		Thread.sleep(4000);
		s.selectByIndex(3);
		Thread.sleep(4000);
		s.selectByValue("AUS");
		Thread.sleep(4000);
		s.selectByVisibleText("Canad");
		Thread.sleep(4000);
		s.selectByIndex(5);
		

	}

}
