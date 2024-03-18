package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver  = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/buttons");
	 
	// WebElement button= driver.findElement(By.id("rightClickBtn"));
	 WebElement button= driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
	 
	Actions act = new Actions(driver);
	 act.contextClick(button).perform();    //Right click
	 
	
     

	}

}
