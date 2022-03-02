package com.nc;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import nc.util.WebEventListener;

public class SanveoBase {
	
	static public WebDriver driver;
	static public Properties prop;
	static public Statement smt;
	static public EventFiringWebDriver edriver;
	static public WebEventListener eventListener; 
	
	public SanveoBase(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/nccpamacbookprom1qa/IdeaProjects/seleniummacdemo/CucumberSelenium/src/main/java/nc/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	
	public static WebDriver initialization() {
		
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/nccpamacbookprom1qa/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.internet explorer.driver","");
			driver = new InternetExplorerDriver();
		}

		else if(BrowserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","C://Webdrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		edriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		edriver.register(eventListener);
		driver = edriver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("site.url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		return driver;
	}
	
}
