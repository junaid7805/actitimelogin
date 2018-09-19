package com.selenium.classroom_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser_Naukri {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		ArrayList<String> al=new ArrayList<>(windows);
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(al.get(2));
		driver.close();
		System.out.println(driver.getTitle());

	}

}
