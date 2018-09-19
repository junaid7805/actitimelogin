package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class SelectClass_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html");
		WebElement element=driver.findElement(By.name("country"));
		Select s=new Select(element);
		s.selectByValue("AUS");
		Thread.sleep(2000);
		s.selectByVisibleText("Canada");
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("AUS");
		s.deselectByVisibleText("United States");
		s.deselectByIndex(5);
		s.deselectAll();
		System.out.println(s.isMultiple());
	}

}
