package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html\\");
		WebElement listbox=driver.findElement(By.name("country"));
		Select s=new Select(listbox);
		s.selectByValue("AUS");
		s.selectByValue("CAD");
		WebElement firstselected=s.getFirstSelectedOption();
		System.out.println(firstselected.getText());
	}

}
