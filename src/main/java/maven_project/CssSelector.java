package maven_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	
	    //get URL
		driver.get("https://www.saucedemo.com");
		
		//Maximize
		driver.manage().window().maximize();
		
		//Locator CSS selector tag and id =tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");    //Username
		
		//Locator tag and attribute = tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce");  //password
		
		//Locate tag and class =  tag,class value
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();    //login
		
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
        //Locate tag,class and attribute= tag.class[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack")).click();   //Add to cart
	
	   //Locate sub-string = tag[[attribute^=value] start=^,end=$,contains=*
	    driver.findElement(By.cssSelector("button[name$=light]")).click();     //add to cart
	
	}

}