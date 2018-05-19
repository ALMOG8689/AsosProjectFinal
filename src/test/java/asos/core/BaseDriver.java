package asos.core;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import asos.util.PropertyUtil;

public class BaseDriver {
	public WebDriver driver;
	
	String path= System.getProperty("user.dir");// where the project is
	PropertyUtil pus = new PropertyUtil(path+ "\\selenium.properties" );// let selenium know where properties file is
	String grid=pus.getProperty("grid");
	String browser=pus.getProperty("browser");// get the properties from the file properties
	String gridUrl=pus.getProperty("gridUrl");//GRIDURL=IP OF THE SERVER-GRID

	public String username=pus.getProperty("username");
	public String password=pus.getProperty("password");


	public WebDriver getDriver(){
		return driver;	
	}


	public void startSession()
	{
		
		try
		{
			if(browser.equalsIgnoreCase("firefox")){
				if(grid.equalsIgnoreCase("true")){
					DesiredCapabilities cap = new DesiredCapabilities();//YEHOLOT
					cap.setBrowserName("firefox");
					cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
					driver= new RemoteWebDriver(new URL(gridUrl),cap);// SOMEONE ELSE GOONE BE THE MASTER
				}
				else 
				{
					driver = new FirefoxDriver();
				}
			}






			else if (browser.equalsIgnoreCase("chrome"))
			{
				if(grid.contains("true"))
				{	
					System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("start-maximized");
					DesiredCapabilities cap= DesiredCapabilities.chrome();
					cap.setCapability(ChromeOptions.CAPABILITY, options);
					driver = new RemoteWebDriver(new URL(gridUrl),cap);

				}
				else{
					System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("start-maximized");
					DesiredCapabilities cap= DesiredCapabilities.chrome();
					cap.setCapability(ChromeOptions.CAPABILITY, options);
					driver = new ChromeDriver(cap);//DEPRECATED- thie version is updated. you should update it.

				}}



			else if (browser.equalsIgnoreCase("ie"))
			{
				if(grid.equalsIgnoreCase("true"))
				{	
					System.setProperty("webdriver.ie.driver","C:\\Users\\ALMOG\\Desktop\\SELENIUM FILES\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					DesiredCapabilities ie= DesiredCapabilities.internetExplorer();
					ie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					driver = new InternetExplorerDriver(ie);
				}
				else{
					System.setProperty("webdriver.ie.driver","C:\\Users\\ALMOG\\Desktop\\SELENIUM FILES\\chromedriver.exe");
					DesiredCapabilities cap= DesiredCapabilities.internetExplorer();
					cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					driver = new InternetExplorerDriver(cap);
				}
			}

			String url = pus.getProperty("url");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// wait till the element will appear
			driver.get(url);
			driver.manage().window().maximize();

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}





//
//		PropertyUtil pus = new PropertyUtil(path+ "\\selenium.properties" );
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALMOG\\Desktop\\SELENIUM FILES\\chromedriver.exe");
//		driver= new ChromeDriver();
//		String url = pus.getProperty("url");
//
//		driver.manage().window().maximize();
//		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);// wait till the element will appear


	}
	public void stopSession(){
		driver.quit();
	}
}
