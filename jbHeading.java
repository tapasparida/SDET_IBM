package Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

public class jbHeading {
	WebDriver driver;
	
	
	
	@BeforeMethod
		public void beforeTitle()
		{
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Alchemy\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
		
		}
	   
	@Test()
	  
	  	public void titleTest() {
		  String expHeader="Welcome to Alchemy Jobs";
		  WebElement header=driver.findElement(By.xpath("//h1[@class=\"entry-title\"]"));
		  String actHeader=header.getText();
		  System.out.println(actHeader);
		 // Reporter.log("Title of the page appeared",true);//to print logs in console
		  
		  AssertJUnit.assertEquals(expHeader, actHeader);
		  System.out.println("Headers matched as expected.");
	  }
		  
	@AfterMethod
	   	public void afterTitle() {
		driver.quit();
	}
		  
}


