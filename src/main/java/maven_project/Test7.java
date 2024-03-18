package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	
	 
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
    driver.get("https://demoqa.com/droppable/");
    
	WebElement element = driver.findElement(By.linkText("Shipping & Checkout"));
	Actions act = new Actions(driver);

    act.moveToElement(element).perform();   //Mouse Over on text 
	
	
	

			
	}

}
