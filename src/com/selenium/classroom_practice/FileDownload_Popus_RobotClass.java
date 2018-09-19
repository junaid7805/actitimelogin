package com.selenium.classroom_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload_Popus_RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		FirefoxProfile profile=new FirefoxProfile();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);			
		
		
		

	}

}
