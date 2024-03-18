package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		String Title = driver.getTitle();

		driver.manage().window().maximize();
	    //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15"+Keys.ENTER);
	  //  driver.findElement(By.linkText("Apple iPhone 15 Plus (128 GB) - Black")).click();
	    //driver.findElement(By.xpath("//*[@id=\"p_89/Apple\"]/span/a/div/label/i")).click();
	    driver.findElements(By.cssSelector("h2[class^ ='a-color-base headline truncate-2line']"));
	    
	    //driver.navigate().to("https://www.amazon.in");
	   // driver.navigate().back();
	    Thread.sleep(2000);
	    driver.close();	
	
	}

}