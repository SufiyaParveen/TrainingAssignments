package com.training.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityProgram {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/sufiyap/Downloads/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
// Code to check the button is displayed or not on the webpage

		
		WebElement buttonNavigation=driver.findElement(By.xpath("//div[@class='widget-area']/aside[2]/ul/li[3]/a"));
		buttonNavigation.click();
		
		System.out.println("Clicked on Button in the LHS ");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement button1=driver.findElement(By.xpath("(//button[contains(text(),'A button element')])[1]"));
		boolean buttonState=button1.isDisplayed();
		System.out.println("Button is displayed: "+buttonState);
		System.out.println("Clicked on Button1");
		WebElement button2=driver.findElement(By.xpath("//a[@class='ui-button ui-corner-all ui-widget']"));
		button2.click();
		System.out.println("Clicked on Button3");
		Thread.sleep(3000);

// Code to check the radio button is selected or not
		driver.switchTo().defaultContent();
		System.out.println("Switched to default");
				
		WebElement radioButtonNavigation=driver.findElement(By.xpath("//a[text()='Checkboxradio']"));
		radioButtonNavigation.click();
				
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
				
		WebElement radioBtn=driver.findElement(By.xpath("//div[@class='widget']/fieldset[1]/label[1]/span[1]"));

		System.out.println("Radio button state before: "+radioBtn.isSelected());
			
		radioBtn.click();
				
		WebElement actualRadiobutton=driver.findElement(By.xpath("//div[@class='widget']/fieldset[1]/input[1]"));
		Thread.sleep(5000);
		System.out.println("Radio button state after: "+actualRadiobutton.isSelected());


// Code to check the button is enabled or not on the webpage
		driver.get("https://emamt-uat.devensoft.com/Login/SignIn?ReturnUrl=%2f");
		boolean btnState=driver.findElement(By.id("signin_btn")).isEnabled();
		System.out.println("button is enabled: "+btnState);
		

		driver.close();
	}

}
