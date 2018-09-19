package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Popup_Handeling_Guru99 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
