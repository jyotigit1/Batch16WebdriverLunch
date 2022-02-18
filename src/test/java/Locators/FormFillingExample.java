package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillingExample {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement FirstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstNameField.sendKeys("Anshu");
		
		WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastNameField.sendKeys("Patle");  
		
		WebElement addressField = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addressField.sendKeys("301,West Street,NYC");
		
		WebElement emailField = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		emailField.sendKeys("anshupatle@gmail.com");
		
		WebElement phoneNumberField = driver.findElement(By.xpath("//input[@type='tel']"));
		phoneNumberField.sendKeys("9673796796");
		
		WebElement genderField = driver.findElement(By.xpath("//input[@value='male']"));
		genderField.click();
		
		WebElement cricketHobbyRadioBtn = driver.findElement((By.id("checkeBox1")));
		cricketHobbyRadioBtn.click();
		
		WebElement hockeyHobbyRadioBtn = driver.findElement((By.id("checkeBox1")));
		hockeyHobbyRadioBtn.click();
		
		WebElement passwordFielde = driver.findElement((By.id("firstpassword")));
		passwordFielde.sendKeys("123@Xyz");
		
		WebElement confirmPasswordFielde = driver.findElement((By.id("secondpassword")));
		confirmPasswordFielde.sendKeys("123@Xyz");
		
		WebElement submitButton = driver.findElement(By.id("submitbtn"));
		submitButton.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
