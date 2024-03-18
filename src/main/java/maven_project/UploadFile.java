
package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
	 
		//Setup 
	WebDriverManager.chromedriver().setup();
	
	//Object
	WebDriver driver = new ChromeDriver();
	
	//get URL
	driver.get("https://demoqa.com/upload-download");
	
	//Maximize
	driver.manage().window().maximize();

	//find webelement 
	driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Dell\\Desktop\\Resume.docx");
	
	
	

			
	}

}
