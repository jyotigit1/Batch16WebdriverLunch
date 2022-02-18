package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserInvocation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		
		System.out.println("Title for facebook is:"+ driver.getTitle());
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			System.out.println("Test is pass title match");
		}
		else
		{
			System.out.println("Test is not pass title matched");
			
		}
			driver.quit();
			
		
		
		
		
	}

}
