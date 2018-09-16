package com.bughunt.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ReusableCoponents {

	public static void takeScreenshot(String file) {
		WebDriver driver = DriverFactory.instance().getWebDriver();
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(file);
		/*try {
			// FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	
}
