package maven_project;

import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("input-country"));
		Select dropdown = new Select(element);      //Make Select Class
		
		dropdown.deselectByVisibleText("India");
		//dropdown.deselectByValue("45");
		//dropdown.deselectByIndex(1);
		if(dropdown.isMultiple())
		{
			System.out.println("Dropdown is multiple");
		}
		else
		{
		   System.out.println("Dropdown is not multiple");
	    }		
	
        List<WebElement> alldropdownoptions = dropdown.getOptions();
		
        System.out.println("Total option");
       
        for(WebElement el : alldropdownoptions)
		{
			System.out.println(el.getText());
		}
	
		
	}}

