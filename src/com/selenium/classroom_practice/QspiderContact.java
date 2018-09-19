package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QspiderContact {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.qspiders.com/contact");
		WebElement element=driver.findElement(By.xpath("//a[.='Bhubaneswar ']/../../..//div[@class='branch_contact']"));
	     element.getText();
	     driver.close();
		}

}
