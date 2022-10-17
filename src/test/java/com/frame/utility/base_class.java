package com.frame.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	
	public static Properties prop; 
	public static WebDriver driver; 
	
	public base_class () {
		prop = new Properties ();
		
try {
	FileInputStream fls = new FileInputStream (System.getProperty("user.dir")+"\\src/test\\java\\com\\frame_configure\\configurefile.properties");
	prop.load(fls);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}



      public void initialize_browser () {
    	  
    	  String browserset = prop.getProperty("Browser1");
    	  if (browserset.equals("Chrome")) {
    		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");
   		   driver = new ChromeDriver();
   	       driver.get("https://www.demoblaze.com");          
   	       driver.manage().window().maximize();
   	       driver.manage().timeouts().pageLoadTimeout(test_data.pageLoadTimeout, TimeUnit.SECONDS);   
   	       driver.manage().timeouts().implicitlyWait(test_data.implicitlyWait, TimeUnit.SECONDS); 
    		  }
    	  else if (browserset.equals("FF"));
      }

 
public static void getURL () {
	
	driver.get(prop.getProperty("URL"));
	
}
}