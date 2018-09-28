package facebooklogin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	RemoteWebDriver driver;
	
  @Test
  public void gmail() throws InterruptedException {
	  driver.get("https://accounts.google.com");
		//d.manage().window().maximize();		
		Thread.sleep(3000);
	  
  }
  
  @Test
  public void yahoo() throws InterruptedException {
	  driver.get("https://login.yahoo.com/");
		//d.manage().window().maximize();		
		Thread.sleep(3000);
	  
  }
  
  @Test
  public void facebook() throws InterruptedException {
	  driver.get("https://www.facebook.com/");
		//d.manage().window().maximize();		
		Thread.sleep(3000);
	  
  }
  
 @BeforeTest
 

    public void openingBrowser(){
	   System.setProperty("webdriver.chrome.driver","E:\\Sateesh\\selenium\\chromedriver.exe");
	   driver=new ChromeDriver();		
	  }	

//  public void beforeTest() throws MalformedURLException {
//
//		String browser = "chrome-win-saucelabs";
//		
//		String URL = "https://sateeshlab:c887131a-2d68-45f3-a6d2-a7828822d0ad@ondemand.saucelabs.com:443/wd/hub";
//		
//		//DesiredCapabilities caps = null;
//		
//		DesiredCapabilities caps = DesiredCapabilities.chrome();
//		caps.setCapability("platform", "Windows 10");
//		caps.setCapability("version", "69.0");
//		caps.setCapability("recordVideo", "true");
//		caps.setCapability("recordScreenshots", "true");
//		caps.setCapability("screenResolution", "1024x768");
//
//		RemoteWebDriver driver = new RemoteWebDriver(new URL(URL),caps);
//  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
