package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_Xpath {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\X_PATH.html");
		driver.findElement(By.xpath("//div[2]/input[2]")).click();
		

	}


}
