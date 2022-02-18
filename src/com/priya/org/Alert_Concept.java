package com.priya.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@onclick,'normalAlert()')]")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		driver.findElement(By.xpath("//button[contains(@onclick,'confirmAlert()')]")).click();
		Alert al1 = driver.switchTo().alert();
		al1.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        Alert al2 = driver.switchTo().alert();                                                  
        al2.sendKeys("selenium");
        String text = al2.getText();
        System.out.println(text);
        al2.accept();
	}
}