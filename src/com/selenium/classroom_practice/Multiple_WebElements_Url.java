package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_WebElements_Url {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\multipelElement.html");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		System.out.println(links.get(0).getAttribute("href"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}
	}

}
