package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPpage_Acti_Time {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_CHROEM_DRIVER\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
	driver.get("https://demo.actitime.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(4000);
	/*driver.findElement(By.xpath("//div[@class='popup_menu_icon settings_icon']")).click();
	driver.findElement(By.xpath("//div[@class='popup_menu_arrow']")).click();*/
	driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[@unselectable='on']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qspider");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	driver.quit();

	
	
	


	}

}
