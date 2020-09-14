package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class jobAdd {
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
		  WebElement jobPost=driver.findElement(By.linkText("Post a Job"));
		 jobPost.click();
		 
		 WebElement email1=driver.findElement(By.id("create_account_email"));
		 email1.sendKeys("sdet2113@ibm.com");
		 
		 
		 WebElement jobTitle=driver.findElement(By.id("job_title"));
		 jobTitle.sendKeys("SDET_FullStack2113");
		 
		 driver.switchTo().frame("job_description_ifr");
		 WebElement desc=driver.findElement(By.id("tinymce"));
		 desc.sendKeys("SDET_Test");
		 driver.switchTo().defaultContent();
		 
		 
		 
		 WebElement email2=driver.findElement(By.id("application"));
		 email2.clear();email2.sendKeys("sdet222@ibm.com");
		 
		 driver.findElement(By.id("company_name")).sendKeys("IBM");
		 driver.findElement(By.name("submit_job")).click();//preview
		 
		 driver.findElement(By.id("job_preview_submit_button")).click();
		 driver.findElement(By.id("menu-item-24")).click();
		 driver.findElement(By.id("search_keywords")).sendKeys("SDET_FullStack2113");
		 driver.findElement(By.className("search_keywords")).click();
		 
		 driver.findElement(By.xpath("//*[@class='search_submit']/input")).click();
		 Thread.sleep(3000);
		 String positionName=driver.findElement(By.xpath("//ul[@class='job_listings']/li/a/div/h3")).getText();
		 
		 Assert.assertEquals("SDET_FullStack2113", positionName);
		 System.out.println("Job posted successfully with position name :" + positionName);
		 
		 
		 
		
		 
		 
		
	  }
		  
	/*
	 * @AfterMethod public void afterHeader() { driver.quit(); }
	 */
}
