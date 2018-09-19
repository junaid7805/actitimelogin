package com.selenium.classroom_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DEMO1 {
	public static void main(String[] args) {
	      WebDriver driver=new FirefoxDriver();
			//get()open a specific url in the browser window
					driver.get("https://www.facebook.com/");
					driver.navigate().refresh();
					//get() returns the title of the browser
					/*String titel=driver.getTitle();
					System.out.println(titel);*/
					/*String pagesource=driver.getPageSource();
					System.out.println(pagesource);*/
					/*String url=driver.getCurrentUrl();
					System.out.println(url);*/
					driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
					driver.navigate().back();
					driver.navigate().refresh();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.navigate().forward();
					driver.navigate().refresh();
					driver.close();
					/*driver.navigate().to("https://mail.google.com");
					//to get from previous page
					driver.navigate().back();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.navigate().refresh();
					// to go to forward page
					driver.navigate().forward();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					driver.navigate().refresh();
					
					String title=driver.getTitle();
					System.out.println(title);
					System.out.println(driver.getTitle());
					
					//for printing current url
					System.out.println(driver.getCurrentUrl());
					//to get page source code
					System.out.println(driver.getPageSource());
					 */
		}

}
