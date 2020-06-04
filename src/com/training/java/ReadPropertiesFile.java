package com.training.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	
		Properties propertiesFile;
				
		propertiesFile=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\sufiyap\\eclipse-workspace\\TrainingAssignments\\src\\config\\config.properties");
		propertiesFile.load(ip);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sufiyap/Downloads/chromedriver.exe");
		driver=new ChromeDriver();
		
		String url=propertiesFile.getProperty("url");
		System.out.println(url);
		driver.get(url);
	}

}
