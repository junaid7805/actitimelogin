package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Popus_Americanairlines {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/");
		WebElement from=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.sendKeys("DEN");
		WebElement to=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.sendKeys("SAN");
		WebElement adults=driver.findElement(By.id("flightSearchForm.adultPassengerCount"));
		Select s=new Select(adults);
		s.selectByValue("2");
		driver.findElement(By.id("aa-leavingOn")).click();
		driver.findElement(By.xpath("//a[.='31']")).click();
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		driver.findElement(By.xpath("//a[.='31']")).click();
		WebElement childrens=driver.findElement(By.id("flightSearchForm.childPassengerCount"));
		Select s1=new Select(childrens);
		s1.selectByValue("2");
		driver.findElement(By.id("bookingModule-submit")).click();

	}

}
