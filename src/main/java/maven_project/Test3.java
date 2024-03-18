package maven_project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	private static final Duration Timeout = null;
	private static int imeoutsecond;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		
        //Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.quit();
		
		
	}

}