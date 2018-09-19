package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload_Popus {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		

	}

}
