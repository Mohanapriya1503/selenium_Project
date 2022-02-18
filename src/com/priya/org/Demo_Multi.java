package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Multi {
public static void main(String[] args)  {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("ravichandran6405@gmail.com");
			
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("Mathematics");
			
			//driver.findElement(By.xpath("//button[@value='1']")).click();
			
			driver.findElement(By.xpath("//a[contains(@href,'token')]")).click();
			WebElement mob = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
			mob.sendKeys("9380437911");
			
			driver.findElement(By.xpath("//button[@value='1']")).click();
		
			}
			


		}





