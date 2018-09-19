package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_Division_Popus_Handeling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		driver.findElement(By.xpath("//div[.='Budget']/../../..//div[@class='img']")).click();;
		driver.findElement(By.xpath("(//div[@class='deleteButton'])[1]")).click();
		driver.findElement(By.xpath("//div[.='Cancel']")).click();
	}

}
