package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class X_pathbyText {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
	    System.out.println(element.getText());
		element.click();

		}


}
