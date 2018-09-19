package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bput_Exam_Schedule {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://bputexam.in/schedule.aspx");
	WebElement examsession=driver.findElement(By.xpath("//select[@id='ddlSession']"));
	Select s=new Select(examsession);
	s.selectByValue("SP");
	Thread.sleep(5000);
	WebElement course=driver.findElement(By.xpath("//select[@id='ddlCourse']"));
	Select s1=new Select(course);
	s1.selectByValue("4");
	Thread.sleep(5000);
	WebElement branch=driver.findElement(By.xpath("//select[@id='DDLBranch']"));
	Select s2=new Select(branch);
	s2.selectByValue("1");
	Thread.sleep(5000);
	WebElement semester=driver.findElement(By.xpath("//select[@id='DDLSemester']"));
	Select s3=new Select(semester);
	s3.selectByValue("1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='btnView']")).click();
	WebElement table=driver.findElement(By.xpath("//td[.='BS1101']/..//td[.='14 Aug 2018']"));
	System.out.println(table.getText());
	driver.close();

	}

}
