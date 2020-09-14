package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class jbLoginBackend {
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
		
		WebElement Logged_User=driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a/span"));
		String LoggedUserName=Logged_User.getText();
		Assert.assertEquals("root", LoggedUserName);
		System.out.println(LoggedUserName  + " Successfully logged in and validated !!");
		
		 
		 
		
	  }
	@AfterMethod 
	public void afterBackend() { 
		driver.quit(); }
	 
}
