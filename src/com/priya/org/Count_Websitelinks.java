package com.priya.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Websitelinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=upsc&rlz=1C1CHBF_enIN982IN982&oq=upsc&aqs=chrome.0.69i59j46i199i433i465i512j0i20i263i433i512j0i433i512j0i20i263i433i512j0i433i512j69i60l2.2728j0j4&sourceid=chrome&ie=UTF-8");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("h3"));
		List<WebElement> a = driver.findElements(By.tagName("a"));
		System.out.println("no.of.links a :"  +a.size());
		System.out.println("no of links h3 :" +links.size());
		
	}

}
