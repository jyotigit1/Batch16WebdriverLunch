package Locators;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageInteractionByName {

		
		public static void main (String args[]) throws InterruptedException
		{
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		    driver.get("http://www.google.co.in/");
		    
		    String titleofpage = driver.getTitle();
		    System.out.println("Title of page is:" + titleofpage);
		    if(titleofpage.equals("Google"))
		    {
		    	System.out.println("Title of page is correct pass");
		    }
		    else
		    {
		    	System.out.println("Title of page is incorrect test fail");
		    	
		  
		    	
		    }
		    WebElement searchBox = driver.findElement(By.name("q"));
		    searchBox.sendKeys("Selenium");
		    Thread.sleep(5000);
		    
		    if(driver.getTitle().equals("Selenium - Google Search"))

		    {
		    	System.out .println("Test pass");
		    }
		    else
		    {
		    	System.out.println("Test fail");
		    }
		    
		    
		    
		    
		    driver.quit();
		    
		    
		}


	}
