package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4_Sel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement mul = driver.findElement(By.xpath("(//select)[6]"));
		Select s=new Select(mul);
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("Selenium");
		Thread.sleep(5000);
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
