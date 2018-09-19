package com.selenium.classroom_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver_Lunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\SELENIUM_CHROEM_DRIVER\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("newtab-search-text")).sendKeys("selenium");
    Thread.sleep(5000);
    List<WebElement> suggestion=driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
    Thread.sleep(4000);
    System.out.println(suggestion.size());
    suggestion.get(1).click();

	}

}
