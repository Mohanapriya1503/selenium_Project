package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script2 {

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				
				driver.manage().window().maximize();
				
				WebElement amazlogo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].scrollIntoView();",amazlogo );
				
				Thread.sleep(3000);
				
				js.executeScript("window.scrollBy(0,-3000)");
				
				Thread.sleep(3000);
				
				js.executeScript("window.scrollBy(0,1000)");
				
			}
			
			
			
			
			
			

		

	}


