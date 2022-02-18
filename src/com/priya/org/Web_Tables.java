package com.priya.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		
		ch.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(ch);
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> All_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		System.out.println("-----All data-----");
		
		for (WebElement table_data : All_Data) {
			
			System.out.println(table_data.getText());
		}
		
		System.out.println("-----row data------");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		for (WebElement data : row) {
			
			System.out.println(data.getText());
		}
		
		System.out.println("------column data------");
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		
		for (WebElement data1 : column) {
			
			System.out.println(data1.getText());
		}
		
		System.out.println("-----particular data------");
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		
		System.out.println("-----heading------");
		
		List<WebElement> head = driver.findElements(By.xpath("//table/tbody/tr[1]/th[3]"));
		
		for (WebElement data2 : head) {
			
			System.out.println(data2.getText());
			
		}
		
		
		

	}

}
