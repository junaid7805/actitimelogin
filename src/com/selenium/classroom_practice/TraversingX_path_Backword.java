package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraversingX_path_Backword {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.findElement(By.xpath("//div[3]/input[1]/. ./. .//div[1]/input[1]")).click();

		}


}
