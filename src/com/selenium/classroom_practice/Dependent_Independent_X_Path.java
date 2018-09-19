package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dependent_Independent_X_Path {
	

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[@id='close']")).click();
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Javadoc']")).click();
		driver.close();

	}


}
