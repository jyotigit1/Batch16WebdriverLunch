package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownHandlingWithoutSelectClass {
	WebDriver driver;

@Before
public void setup()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
}

@Test
public void dropdown() throws InterruptedException
{
	WebElement rightClickeMeButton= driver.findElement(By.xpath("//span[text()='right clicke me']"));
	Thread.sleep(3000);
	
	 Actions act  = new  Actions (driver);
	 
	 act.contextClick(rightClickeMeButton).build().perform();
	 
	 List<WebElement>rightClickMeOption = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root ']//li/span"));
	 
	 for(int i =0;i<rightClickMeOption.size();i++)
	 {
		System.out.println("Option No" + (i+1)+"is"+rightClickMeOption.get(i).getText()); 
		if(rightClickMeOption.get(i).getText().equals("Copy"))
				{
			Thread.sleep(2000);
			rightClickMeOption.get(i).click();
			Thread.sleep(2000);
				}
	 }
	 }


@After
public void teardown() throws InterruptedException
{
Thread.sleep(2000);
driver.quit();
}
}






