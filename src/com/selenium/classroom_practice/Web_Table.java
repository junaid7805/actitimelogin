package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\Student_Details.html");
		WebElement table=driver.findElement(By.xpath("//td[.='2']/..//td[.='CHIRU']"));
		System.out.println(table.getText());

	}

}
