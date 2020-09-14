package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jbHeadURL {
WebDriver driver;
	
	
	
	@BeforeMethod
		public void beforeHeader()
		{
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Alchemy\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
		
		}
	   
	@Test()
	  
	  	public void headerURL() {
		  WebElement header=driver.findElement(By.xpath("//h1[@class='site-title']/a"));
		  String headerURL=header.getText();
		  
		  //Reporter.log("Title of the page appeared",true);//to print logs in console
		  
		  
		  System.out.println("Header URL -->" + headerURL);
	  }
		  
	@AfterMethod
	   	public void afterHeader() {
		driver.quit();
	}
}
