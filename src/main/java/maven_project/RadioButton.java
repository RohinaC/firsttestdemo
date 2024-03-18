package maven_project;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	
	    //get URL
		driver.get("https://demoqa.com/radio-button");
		
		//Maximize
		driver.manage().window().maximize();
		List<WebElement> radiobuttonlist =  driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/input"));
		System.out.println("Total no of radio button:" + radiobuttonlist);
        driver.close();
	}
	

}