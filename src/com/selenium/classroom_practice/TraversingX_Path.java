package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraversingX_Path {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.findElement(By.xpath("//body//div[3]/input[1]")).click();

	}


}
