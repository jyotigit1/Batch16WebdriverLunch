package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {
	
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    driver.get("https://www.google.co.in/");
	    
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
	    
	    
	    driver.quit();
	    
		
		
		
		
	}

}
