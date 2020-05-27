package com.training.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverExample {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "C:/Users/sufiyap/Downloads/chromedriver_win32/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.manage().window().maximize();
	
//Login to Orange HRM
	WebElement UserName =driver.findElement(By.xpath("//input[@id='txtUsername']"));
	UserName.sendKeys("Admin");
	WebElement Password =driver.findElement(By.xpath("//input[@name='txtPassword']"));
	Password.sendKeys("admin123");
	WebElement Button =driver.findElement(By.xpath("//input[@class='button']"));
	Button.click();
	System.out.println("Login to the application Successfully");

	Thread.sleep(5000);

// Hover over Admin>>Job>>Job categories
   WebElement ad=driver.findElement(By.className("firstLevelMenu"));
   ad.click();
   
   Actions act=new Actions(driver);
   
   act.moveToElement(driver.findElement(By.id("menu_admin_Job"))).build().perform();
   driver.findElement(By.xpath("//a[text()='Job Categories']")).click();
   }
	
}
