package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Confirmation_Popups {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.xpath("//div[.='TASKS']")).click();
	driver.findElement(By.xpath("//div[.='Add New']")).click();
	driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
	driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("subha");
	driver.findElement(By.xpath("//div[@id='customerLightBox_cancelBtn']")).click();
	
	Alert alt=driver.switchTo().alert();
	alt.accept();
	//alt.dismiss();
	driver.findElement(By.id("logoutLink")).click();  //UnHandeledAlertException we cant perform this operation bcz of popups
	


	
	}

}
