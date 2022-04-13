package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForOpenCart {
	@Test
	  public void IdDemo() {
		  System.setProperty("webdriver.chrome.driver",
				"F:\\DXC Selenium Automation Class\\Locators In Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.opencart.com/");
	      // counting no of links in easy calculations
	      List<WebElement>  Links  = driver.findElements(By.xpath("//a"));
	      int Nolinks = Links.size();
	      System.out.print("No of Links in Calculation is....." + Nolinks);
	     

	}

}
