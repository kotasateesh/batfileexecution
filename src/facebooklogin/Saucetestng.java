package facebooklogin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Saucetestng {
	RemoteWebDriver driver;	  
	  @Test
	  public void facebook() throws InterruptedException, MalformedURLException {
		  		  
		  String browser = "chrome-win-saucelabs";
			
			String URL = "https://sateeshlab:c887131a-2d68-45f3-a6d2-a7828822d0ad@ondemand.saucelabs.com:443/wd/hub";
			
			//DesiredCapabilities caps = null;
			
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "69.0");
			caps.setCapability("recordVideo", "true");
			caps.setCapability("recordScreenshots", "true");
			caps.setCapability("screenResolution", "1024x768");

			RemoteWebDriver driver = new RemoteWebDriver(new URL(URL),caps);
		   driver.get("https://www.facebook.com/");
				
		Thread.sleep(10000);	  
	 
			driver.get("https://login.yahoo.com/");
					
			Thread.sleep(10000);
			driver.get("https://accounts.google.com");
				
			Thread.sleep(3000);
			 
	 
	 
//	    public void openingBrowser(){
//		   System.setProperty("webdriver.chrome.driver","E:\\Sateesh\\selenium\\chromedriver.exe");
//		   driver=new ChromeDriver();		
//		  }	
	// 
			
	  }

	}

