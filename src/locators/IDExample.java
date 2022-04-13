package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDExample {
  @Test
  public void IdDemo() {
	  System.setProperty("webdriver.chrome.driver",
			"F:\\DXC Selenium Automation Class\\Locators In Selenium\\SeleniumBrowserJars\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/");
      //using Id I will enter value into Orange HRM 
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      
		
		

	}

}
