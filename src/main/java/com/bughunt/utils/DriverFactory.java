package com.bughunt.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.bughunt.config.BugHuntConfig;
import com.bughunt.constants.BugHuntConstants;
import com.bughunt.constants.GlobalConstants;

public class DriverFactory {

	private static DriverFactory driverFactory = null;
	
	private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	
	private DriverFactory() {
		
	}
	
	public static DriverFactory instance() {
		if(driverFactory == null) {
			driverFactory = new DriverFactory();
		}
		return driverFactory;
	}
	
	public void setWebDriver(String browser) {
		WebDriver driver=null;
		String basePath = System.getProperty("user.dir").replace("\\", "/");
		String driversPath = basePath + BugHuntConstants.SRC_MAIN_RESOURCES_PATH + GlobalConstants.DRIVERS_FOLDER_NAME;
		switch(browser) {
		case "Chrome":
			driver = getChromeDriver(driversPath);
			break;
		case "FireFox":
			driver = getFirefoxDriver(driversPath);
			break;
		case "IE":
			driver = getIEDriver(driversPath);
			break;
		default:
			driver = getChromeDriver(driversPath);
			break;
		}
		webDriver.set(driver);
	}
	
	public WebDriver getWebDriver() {
		return webDriver.get();
	}
	
	public void quitWebDriver() {
		WebDriver driver = webDriver.get();
		driver.quit();
		webDriver.remove();
	}

	private WebDriver getIEDriver(String driversPath) {
		WebDriver driver = null;
		String ieDriverPath = driversPath + "/IEDriverServer.exe";
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, ieDriverPath);

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,	true);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,	true);

		try {
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return driver;
	}

	private WebDriver getFirefoxDriver(String driversPath) {
		WebDriver driver = null;
		String geckoDriverPath = driversPath + "/geckodriver.exe"; //New
		System.out.println("geckoDriverPath: "+geckoDriverPath);
		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, geckoDriverPath); 
		 try {
			 	driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		 } catch(Exception ex) {
		     System.out.println(ex.getMessage());
		 }
		 return driver;
	}

	private WebDriver getChromeDriver(String driversPath) {
		WebDriver driver;
		String chromeDriverPath = null;
		if(System.getProperty("os.name").equals("Mac OS X")){
			chromeDriverPath = driversPath + "/chromedriver";
		}else{
			chromeDriverPath = driversPath + "/chromedriver.exe";
		}
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
