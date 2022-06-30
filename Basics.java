package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","./driver1//msedgedriver.exe");
		Thread.sleep(5000);
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		//driver1.get("https://www.amazon.in/");
		
		String ac= driver.getTitle();
		String ec="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("12345666");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Assert.assertEquals(true, ac, ec);
	

	}

}
