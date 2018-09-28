package facebooklogin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FacebookLogin {
	WebDriver d;
  
  @BeforeTest
  public void openingBrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\Sateesh\\selenium\\chromedriver.exe");
	     d=new ChromeDriver();		
	  }	
 
  @Test
  public void facebookLogin() throws InterruptedException{		
		d.get("https://www.facebook.com/");
		//d.manage().window().maximize();		
		Thread.sleep(3000);
		String s=d.getTitle();
		System.out.println("Title is: " +s);
	}

  @AfterTest
   public void closingBrowser(){
	d.quit();
   }

}
