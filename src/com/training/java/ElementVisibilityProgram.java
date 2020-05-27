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
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		
		// Code to check the radio button is selected or not
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement radioBtn=driver.findElement(By.xpath("//div[@class='widget']/fieldset[1]/label[1]/span[1]"));

		System.out.println("Radio button state before: "+radioBtn.isSelected());
	
		radioBtn.click();
		
		WebElement actualRadiobutton=driver.findElement(By.xpath("//div[@class='widget']/fieldset[1]/input[1]"));
		Thread.sleep(5000);
		System.out.println("Radio button state after: "+actualRadiobutton.isSelected());

		driver.close();
	}

}
