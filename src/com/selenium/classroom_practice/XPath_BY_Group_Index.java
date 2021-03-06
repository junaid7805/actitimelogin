package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath_BY_Group_Index {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demo.actitime.com");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	  driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[1]")).click();	  
      driver.close();
	}

}
