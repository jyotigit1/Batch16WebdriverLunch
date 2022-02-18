package _9_CrossBrowserTesting._1_ReadPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_ReadPropFile {
	 
			public Properties prop;
			WebDriver driver;
			
			@Test
			public void read_propFile()
			{
				prop = new Properties();
				try
				{
			
				FileInputStream ip = new FileInputStream (System.getProperty("user.dir")+"/src/test/java/_9_CrossBrowserTesting/_1_ReadPropFileTesting/configProperties");
				
				prop.load(ip);
				}catch(FileNotFoundException e)
				{
					System.out.println("Config.properties file not found please give correct path");
					e.printStackTrace();
				}catch(IOException e)
				{
					System.out.println("IOException ocuured while loading the config.properties file ");
					e.printStackTrace();
				}
				 
				driver = new ChromeDriver();
				if(prop.getProperty("maximize").equalsIgnoreCase("yes"))
				{
					driver.manage().window().maximize();
				}
				
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("Selenium");
				
				WebElement searchButton = driver.findElement(By.name("btnk"));
				searchButton.click();
				driver.quit();
				
			}
			

		}



