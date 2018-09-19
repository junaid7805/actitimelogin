package com.selenium.classroom_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_popus {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("input_resumeParser")).click();
		StringSelection file=new StringSelection("D:\\RESUME\\Subhadarshini_Jena_Manual.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
