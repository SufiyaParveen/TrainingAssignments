package com.training.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/sufiyap/Downloads/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
	
// 1. Dismiss Alert example 
		
		WebElement el=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		el.click();
		
		Alert al=driver.switchTo().alert();
		
		String alertMsg=al.getText();
		System.out.println(alertMsg);
		
		if(alertMsg.equals("I am an alert box!"))
		{
			System.out.println("Correct alert pop up is displayed");
		}
		else
		{
			System.out.println("In-Correct alert pop up is displayed");
		}
		al.dismiss();
		
// 2. Accept Alert pop up
		
		WebElement el1=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
		el1.click();
		
		al=driver.switchTo().alert();
		al.accept();
		
// 3. SendKeys on Alert pop up
		
		WebElement el2=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		el2.click();
		
		al=driver.switchTo().alert();
		
		String str1=al.getText();
		System.out.println(str1);
	
		//This URL has prob in send keys on alert pop up but the expected result can be verified
		al.sendKeys("Sufiya");
		Thread.sleep(5000);
		al.accept();
		
		WebElement verifyText=driver.findElement(By.id("prompt-demo"));
		String actualText=verifyText.getText();
		
		if(actualText.equals("You have entered 'Sufiya' !"))
		{
			System.out.println("Send keys worked on pop up");
		}
		else
		{
			System.out.println("Send keys didn't worked on pop up");
		}
		
		driver.close();
	}
}
