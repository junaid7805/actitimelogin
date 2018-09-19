package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickHold_Release {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.id("toPasswordRecoveryPageLink"));
		Actions act=new Actions(driver);
		act.clickAndHold(link).perform();
		Thread.sleep(4000);
		act.release(link).perform();
				

	}

}
