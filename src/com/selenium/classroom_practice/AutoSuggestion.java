package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.bing.com/");
   driver.findElement(By.xpath("//input[@class='b_searchbox']")).sendKeys("selenium");
   Thread.sleep(5000);
    List<WebElement> suggestion=driver.findElements(By.xpath("(//div[@class='sa_tm'])[3]"));
    Thread.sleep(8000);
    System.out.println(suggestion.size());
    suggestion.get(0).click();

	}

}
