package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleToolTip {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String actualattribute = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		
		String expectedattribute = "Sign Up for Facebook";
		
		if(actualattribute.equals(expectedattribute))
		{
			System.out.println("Test pass");	
		}
			
		else	
		{
			System.out.println("Test fail");
		}
		
		driver.close();
	}}

