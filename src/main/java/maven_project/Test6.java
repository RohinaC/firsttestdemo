package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	
	 
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
    driver.get("https://demoqa.com/droppable/");
    
	WebElement Source = driver.findElement(By.id("draggable"));   //drag  (Drag me)
	WebElement Target = driver.findElement(By.id("droppable"));   //drop  (Drop me)
	
	Actions act = new Actions(driver);   //Action class
	act.dragAndDrop(Source, Target).perform();
	
	
	

			
	}

}
