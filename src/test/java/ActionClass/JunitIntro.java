package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JunitIntro {
	
	
	WebDriver driver;
	Actions act;
	
	@Before
	public void setup()
	{
    driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	act = new Actions(driver);
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void rightClickOperation() throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		WebElement rightclickbtn =driver.findElement(By.xpath("//span[text()='right click me']"));
	
		act.contextClick(rightclickbtn).build().perform();
		WebElement rightClickBox = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
		boolean listShouldeDisplay = true;
		
		Assert.assertEquals(listShouldeDisplay,rightClickBox.isDisplayed());
		
		
	}
	@Test()
	public void doubleClickOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleClickBtn).build().perform();
		
	}
		
	@After
	public void teardown() throws InterruptedException
	{		
		Thread.sleep(2000);

		driver.quit();
	}
	
	
}
