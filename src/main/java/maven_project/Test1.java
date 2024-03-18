package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone15"+Keys.ENTER);
		Thread.sleep(5000);
	    driver.close();
	}

}
