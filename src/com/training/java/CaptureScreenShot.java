package com.training.java;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sufiyap/Downloads/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot screenShot= (TakesScreenshot) driver;
		File actualScreenshot= screenShot.getScreenshotAs(OutputType.FILE);
		File destFile= new File("C:\\Users\\sufiyap\\eclipse-workspace\\TrainingAssignments\\Screenshots\\GoogleScreenshot.png");
		FileUtils.copyFile(actualScreenshot, destFile);
	}
}