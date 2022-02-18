package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementInteractByXpath {
	

	public static void main(String args[]) throws InterruptedException {
		
	
		System.setProperty("webDriver.chrome.driver",System.getProperty("user.dir")+"/chromdriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");

		
		WebElement FirstNameTextBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		if(FirstNameTextBox.isDisplayed())
		{
			FirstNameTextBox.sendKeys("Tom");
		}
		else
		{
			System.out.println("WebElement with name FirstNameTextBox is not found ");
		}
		
		WebElement genderMaleRadioButton = driver.findElement(By.xpath("//input[@value = 'Male]"));
		
		if(genderMaleRadioButton.isEnabled())
		{
			genderMaleRadioButton.click();
		}
		else
		{

			System.out.println("WebElement with name genderMaleRadioButton is not found");
		}
		
		
		Thread.sleep(4000);
		driver.quit();
		
		}
}