package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFC_PHONE_BANKING {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/personal/customer-centre");
		driver.findElement(By.xpath("//span[text()='Locate Us']")).click();
		driver.findElement(By.xpath("//a[text()='PhoneBanking']")).click();
		Thread.sleep(2000);
		

	}


}
