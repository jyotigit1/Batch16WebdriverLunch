package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		
		WebElement firstElement= driver.findElement(By.id("draggable"));
		WebElement secondElement= driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(firstElement, secondElement).build().perform();
		
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
		
		
	}
}
