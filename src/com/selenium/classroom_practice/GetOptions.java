package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\single_multi_country.html\\");
		WebElement listbox=driver.findElement(By.name("country"));
		Select s=new Select(listbox);
		List<WebElement>alloptions=s.getOptions();
		System.out.println(alloptions.size());
		for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
	}

	

}
