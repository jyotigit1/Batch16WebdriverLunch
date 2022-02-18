package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingWithoutSelectClass2 {
	public class DropDownHandlingWithoutSelectClass23 {
		WebDriver driver;
			
			@Before
			 public void setup()
			 {
				driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("htpp://demo.automationtesting.in/Register.html");
			 }
			@Test
			public void dropDownHandlingWithoutSelectClass2() throws InterruptedException
			{
				List<WebElement>yearList = driver.findElements(By.xpath("//select[@id='yearbox']/option"));
			
				for(int i=0;i<yearList.size();i++);
				{
					int i=0;
					System.out.println(yearList.get(i).getText());
					if(yearList.get(i).getText().equals("1954"))
					{
						yearList.get(i).click();
					}
					Thread.sleep(3000);
				}
			}
			
			@After
			public void teardown() throws InterruptedException
			{
			Thread.sleep(2000);	
			driver.quit();
			}
		}



}
