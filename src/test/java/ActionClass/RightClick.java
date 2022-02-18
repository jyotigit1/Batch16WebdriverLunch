package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String [] args) throws InterruptedException
	{
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclickbtn =driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act =new Actions(driver);
		
		act.contextClick(rightclickbtn).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
