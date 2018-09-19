package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected_Options {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html\\");
		WebElement listbox=driver.findElement(By.name("country"));
		Select s=new Select(listbox);
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(4);
		List<WebElement>allselectedoptions=s.getOptions();
		System.out.println(allselectedoptions.size());
		for(int i=0;i<allselectedoptions.size();i++)
		{
			System.out.println(allselectedoptions.get(i).getText());
		}

	}

}
