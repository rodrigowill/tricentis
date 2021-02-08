package br.sp.rodrigo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodri\\Downloads\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
