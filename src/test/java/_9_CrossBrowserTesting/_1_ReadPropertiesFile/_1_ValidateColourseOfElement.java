package _9_CrossBrowserTesting._1_ReadPropertiesFile;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import junit.framework.Assert;

public class _1_ValidateColourseOfElement {
	WebDriver driver;
	 String url = "https://www.facbook.com/";
	 final String fbLogInButtonColureValue = "#1877f2";
	 
	 @Before
	 public void setup()
	 {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();driver.get(url);
		 
	 }
	 @Test
	 public void testcoloureofElement()
	 {
		 WebElement loginButtonElement = driver.findElement(By.xpath("//button[@name='login']"));
		 
		 System.out.println("The Colore For\"Login\"button is ->"+ loginButtonElement.getCssValue("background-color"));
		 
		 String actualColorValForElement = loginButtonElement.getCssValue("background-color");
		 
		 System.out.println("After Converting RGB color value for \"Login\" button to the HEX Value Output is:"+ rgbToHexValue(actualColorValForElement));
		 
		 Assert.assertEquals("The Color for \"Login\"button is not matching with expect value.",loginButtonElement,rgbToHexValue(actualColorValForElement));
		 System.out.println("Test For Color of Element is passed.");
		 
	 }
	 
	 public static String rgbToHexValue(String rbgValue)
	 {
		 
		return Color.fromString(rbgValue).asHex();
		 
	 }
	 
	 @After
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
