package com.priya.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	private static final int FILE = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("hjugfdio");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("jayanthi");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File start = ts.getScreenshotAs(OutputType.FILE);
		
		File end=new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Screenshot\\image1.png");
		
		FileHandler.copy(start, end);
		
		
		
		
		
		
	}

}
