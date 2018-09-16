package com.bughunt.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bughunt.domain.ScreenShot;

public class WebDriverScreenShot implements ScreenShot {
	WebDriver driver = null;
	
	@Override
	public void takeScreenShot(String file) {
		driver = DriverFactory.instance().getWebDriver();
		try {
			TakesScreenshot scrShot =(TakesScreenshot)driver;
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(file);
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
