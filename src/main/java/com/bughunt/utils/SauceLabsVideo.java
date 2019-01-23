package com.bughunt.utils;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.bughunt.config.BugHuntConfig;
import com.bughunt.domain.VideoCapture;
import com.bughunt.util.SecurityUtils;

public class SauceLabsVideo implements VideoCapture {

	public String getSauceVideoUrl() {
		String videoUrl = null;
		try {
			SessionId session = ((RemoteWebDriver) DriverFactory.instance().getWebDriver()).getSessionId();
			String sessionId = session.toString();
		    String sauceUsernameAccessKey =	BugHuntConfig.getBugHuntProperty("SauceLabURL").split("@")[0].replace("http://", "");
		    String authToken = SecurityUtils.HMAC_MD5_encode(sauceUsernameAccessKey, sessionId);
		    videoUrl = "https://saucelabs.com/video-embed/"+sessionId+".js?auth=" +authToken;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	    return videoUrl; 
	}
}
