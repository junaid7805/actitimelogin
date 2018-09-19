package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[.='Accepted Elements']")).click();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		

	}

}
