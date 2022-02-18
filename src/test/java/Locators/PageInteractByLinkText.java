package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageInteractByLinkText {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+"/chromedriver.exe"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://dzone.com/articles/find-element-with-link-text-amp-partial-link-text");
		
		WebElement IDLocatorseleniumLink = driver.findElement(By.linkText("ID Locator In Selenium"));
		
		String textOFTheClickedLink = IDLocatorseleniumLink.getText();
		System.out.println("Text for the Link Over The Page:" +textOFTheClickedLink  );
		
		IDLocatorseleniumLink.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
