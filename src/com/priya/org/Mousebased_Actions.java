package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousebased_Actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		
		Actions ac =new Actions(driver);
		
		ac.moveToElement(dress).build().perform();
		
		WebElement evedress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		
		ac.click(evedress).build().perform();
		
		
		
		
		
		
		
		
		

	}

}
