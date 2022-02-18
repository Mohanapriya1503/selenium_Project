package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		WebElement single = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		single.sendKeys("single_frame");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

	    driver.switchTo().frame(inner);
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Multiple_frame");
	
	    driver.switchTo().defaultContent();
	
	
	
	}
	

}
