package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageinteractionByID {
	
	public static void main(String args[]) throws InterruptedException
	{
System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    driver.get("http://demo.automationtesting.in/index.html");
	    
	    String titleofpage = driver.getTitle();
	    System.out.println("Title of page is:" + titleofpage);
	    if(titleofpage.equals("Index"))
	    {
	    	System.out.println("Title of page is correct pass");
	    }
	    else
	    {
	    	System.out.println("Title of page is incorrect test fail");
	    	
	    }
       	WebElement emailIdTextBox =   driver.findElement(By.id("email"));
       	
        emailIdTextBox .sendKeys("test@gmail.com");
      WebElement submitButton =  driver.findElement(By.id("enterimg"));
      submitButton.click();
      Thread.sleep(4000);
      
      if(driver.getTitle().equals("Register")) 
      {
    	  System.out.println("New page for Registration displayed");
      }
      else
      {
    	  System.out.println("Test fail");
    	  
      }
	    
	    
	    
	    
	    driver.quit();
	    
	    
	}

}
