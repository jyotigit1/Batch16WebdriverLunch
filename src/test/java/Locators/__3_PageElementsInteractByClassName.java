package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __3_PageElementsInteractByClassName {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver",System.getProperty("user.dir")+"/chromdriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http:/zero.webappsecurity.com/");
		
		System.out.println("the page title before clicking on Sing In Button is :"+ driver.getTitle());
		
		WebElement signInButton = driver.findElement(By.className("signin"));
		
		signInButton.click();
		
		Thread.sleep(4000);
		
		System.out.println("The page title after clicking on sign in button is:"+ driver.getTitle());
		
		WebElement LoginTextBox =driver.findElement(By.id("user_login"));
		LoginTextBox.sendKeys("username");
		
		WebElement PsswordTextBox =  driver.findElement(By.id("user_Password"));
		PsswordTextBox.sendKeys("password");
		
		WebElement  SignInButtonLogInPage =  driver.findElement(By.name("submit"));
		SignInButtonLogInPage.click();
		
		System.out.println("the page title after clicking on sign in Button is :" + driver.getTitle());
		driver.quit();
		
		}
	

}
