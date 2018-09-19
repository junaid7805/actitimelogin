package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Webelements_Checkbox {

	public static void main(String[] args) { 
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\multipelElement.html");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		checkbox.get(4).click();
		/*for(int i=0;i<checkbox.size();i=i+2)
		{
			checkbox.get(i).click();
		}*/
		for(int i=checkbox.size(); i>0; i=i-2)
		{
			checkbox.get(i).click();
		}

  }
}
