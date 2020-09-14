package Project1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class jobBoard_Title {
	
	WebDriver driver;
	
	
@BeforeMethod
	public void beforeTitle()
	{
	driver=new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	
	
	}
   
@Test()
  
  	public void titleTest() {
	  String expTitle="Alchemy Jobs – Job Board Application";
	  String actTitle=driver.getTitle().toString();
	  System.out.println(actTitle);
	 // Reporter.log("Title of the page appeared",true);//to print logs in console
	  
	  AssertJUnit.assertEquals(expTitle, actTitle);
	  System.out.println("Title matched as expected.");
  }
	  
@AfterMethod
   	public void afterTitle() {
	driver.quit();
}
	  
	  		
  }

