package ActionClass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingBySelectClass
     {
	
	    WebDriver driver;
	     
	    @Before
	    public void setup()
	    {
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	driver.get("http://WWW.Facebook.com");
	    	
	    }
	    
	    @Test
	    	public void dropdown() throws InterruptedException
	    	{
	    		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@role='button'and text()='Create New Account']"));
	    		createNewAccountButton.click();
	    		
	    		WebElement birthday = driver.findElement(By.id("day"));
	    		WebElement birthmonth = driver.findElement(By.id("month"));
	    		WebElement birthyear = driver.findElement(By.id("year"));
	    	
	    		Select dayselect = new Select(birthmonth);
	    		dayselect.selectByVisibleText("3");
	    		
	    		Thread.sleep(2000);
	    		
	    		Select monthselect = new Select(birthmonth);
	    		monthselect.selectByVisibleText("Dec");
	    		
	    		Thread.sleep(2000);
	    		
	    		Select yearselect = new Select(birthyear);
	    		yearselect.selectByVisibleText("2014");
	    	
	  	}
	    
	    @After
	    public void teardown() throws InterruptedException
	    
	    {
	    	Thread.sleep(2000);
	    	driver.quit();
	    	
	    	
	    }
	    
	    
	

     }
