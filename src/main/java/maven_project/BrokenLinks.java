package maven_project;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.List;

import javax.print.DocFlavor.URL;
import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver = new  ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
	    driver.get("http://www.deadlinkcity.com/");
	    driver.manage().window().maximize();
	    
	    //Wait 
	    Thread.sleep(5000);
	    //find elements by list and tag name
	List<WebElement> links = driver.findElements(By.tagName("a")); 

	   //Size of links
	System.out.println(links.size());
	
	//Ittration each link
		
	for(WebElement link : links) {
		//link address
		String linkURL = link.getAttribute("href");
	   // Create instance URL
		URL url = new URL(linkURL);
		//Open the connection
		URLConnection  urlconnection =url.openConnection();
		HttpURLConnection HttpURLConnection = (HttpURLConnection) urlconnection;
		//set connection and wait
		HttpURLConnection.setConnectTimeout(2000);	
		// send request to the server
		HttpURLConnection.connect();
		
		if(HttpURLConnection.getResponseCode()==200) 
		{
			System.out.println(linkURL + "-" + HttpURLConnection.getResponseCode());
		}
		else
		{
			System.out.println(linkURL + "-" +HttpURLConnection.getResponseCode() );
		}
		
		
	}
	
	
		
	}}

