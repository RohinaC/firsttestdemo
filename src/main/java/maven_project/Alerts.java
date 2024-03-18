package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://demoqa.com/alerts");
        
		// find the webelement to click 
		//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click(); 
		
		//click to confirm
      //  driver.switchTo().alert().accept();
		
        //add text name
		driver.switchTo().alert().sendKeys("Rohina");
		// press ok
       driver.switchTo().alert().accept();  
       Thread.sleep(5000);
		driver.close();
		
	}}

