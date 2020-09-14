package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class jbJobSearch {
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
	  
	  	public void jbSearch() throws InterruptedException {
		  WebElement jobTab=driver.findElement(By.xpath("//li[@id=\'menu-item-24\']/a"));
		 jobTab.click();
		 WebElement KeyWords_bar=driver.findElement(By.cssSelector("input#search_keywords"));
		 KeyWords_bar.sendKeys("API");
		 WebElement searchTab =driver.findElement(By.xpath("//div[@class='search_submit']/input"));
		 searchTab.click();
		 Thread.sleep(2000);
		 WebElement APIJob =driver.findElement(By.xpath("//*[@class='job_listings']/li[2]"));
		 APIJob.click();
		 WebElement applyJob=driver.findElement(By.xpath("//*[@class='application_button button']"));
		 applyJob.click();
		 String emailText=driver.findElement(By.xpath("//a[@class='job_application_email']")).getAttribute("innerHTML");//getAttribute("href") gives entire value
		 System.out.println("Send the email to --> " + emailText);
		 
		 
		
	  }
		  
	/*
	 * @AfterMethod public void afterHeader() { driver.quit(); }
	 */
}
