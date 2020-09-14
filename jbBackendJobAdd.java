package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class jbBackendJobAdd {
WebDriver driver;
	
	
	
	@BeforeMethod
		public void beforeBackend()
		{
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Alchemy\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin ");
		
		
		}
	   
	@Test()
	  
	  	public void jbBackEnd() throws InterruptedException {
		
		WebElement UserName =driver.findElement(By.id("user_login"));
		UserName.sendKeys("root");
		WebElement UserPass =driver.findElement(By.id("user_pass"));
		UserPass.sendKeys("pa$$w0rd");
		
		WebElement Login_Btn=driver.findElement(By.id("wp-submit"));
		Login_Btn.click();
		
		WebElement Job_List=driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/a/div[3]"));
		Job_List.click();
		
		WebElement job_Add=driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/ul/li[3]/a"));
		job_Add.click();
		
		Thread.sleep(5000);
		WebElement Position=driver.findElement(By.id("post-title-0"));
		Position.sendKeys("SDET Engineer");
		
		WebElement Publish_Btn=driver.findElement(By.xpath("//*[@class='edit-post-header__settings']/button[2]"));
		Publish_Btn.click();
		
		WebElement Publish_Btn1=driver.findElement(By.xpath("//*[@class='editor-post-publish-panel__header-publish-button']/button"));
		Publish_Btn1.click();
		
		Thread.sleep(2000);
		
		WebElement viewJob=driver.findElement(By.linkText("View Job"));
		viewJob.click();
		
		WebElement jobDashboard=driver.findElement(By.linkText("Job Dashboard"));
		jobDashboard.click();
		
		WebElement jobTable=driver.findElement(By.xpath("//*[@class='job-manager-jobs']/tbody/tr/td/a"));
		String jobName = jobTable.getText();
		System.out.println(jobName);
		Assert.assertEquals("SDET Engineer", jobName);
		
		
		
		 
		 
		
	  }
	
	  @AfterMethod public void afterBackend() { driver.quit(); }
	 
}
