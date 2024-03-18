package maven_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Capture full page Screenshot
		//step1: Convert webdriver to TakesScreenShot
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshot method to create image
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		
		// step2: save the location for file
	    File des = new File("C:\\Users\\Dell\\eclipse-workspace\\project1\\ScreenShot\\FileScreenShot.png");
		
		//step3: Copy to desire location by using library
		FileUtils.copyFile(scr,des);
		
		driver.close();
	}}

