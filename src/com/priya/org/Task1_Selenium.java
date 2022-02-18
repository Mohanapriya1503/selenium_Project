package com.priya.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 String Title=driver.getTitle();
		 System.out.println("pageTitle: +title");
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("currentUrl" +currentUrl);
		 
		 driver.navigate().to("https://twitter.com/?lang=en");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 driver.close();
       
		
	}

}
