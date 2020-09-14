package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class jbJobsPage {
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
		  WebElement jobTab=driver.findElement(By.xpath("//li[@id=\'menu-item-24\']/a"));
		 jobTab.click();
		 String headerText =driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
		 System.out.println("The new page title header is -- > " + headerText);
		  //Reporter.log("Title of the page appeared",true);//to print logs in console
		  Assert.assertEquals("Jobs", headerText);
		  System.out.println("Headers matched in the new Job page");
		
	  }
		  
	@AfterMethod
	   	public void afterHeader() {
		driver.quit();
	}
}
