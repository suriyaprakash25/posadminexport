package Commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonfunction {
	public static Properties properties=null;
	public static WebDriver driver;
	
Logger logger = Logger.getLogger(commonfunction.class);

	public Properties loadpropertyfile() throws IOException 
	{
		//property file need  to load . return 
		FileInputStream fileInput = new FileInputStream ("config.properties");
		
		// need to create object for property file and load the file input stream
		
		properties = new Properties();
		
         properties.load(fileInput);
		
		return properties;
		
	}
	
	

	@BeforeSuite
	public void launchbrowser() throws IOException{
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("loading property file");
		loadpropertyfile();
		String browser= properties.getProperty("browser");
		logger.info("starting browser");
		String url= properties.getProperty("url");
		logger.info("getting url");
		String Driverlocation= properties.getProperty("Driverlocation");
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Driverlocation);
			 driver = new ChromeDriver();				
		}else
		{
			System.out.println("wrong browser");
		}
		
		//driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	@AfterSuite
	public void closebrowser()
	{
		//driver.close();
		
		
		
		
	}
}
