package Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserseltion {
	public static String path = System.getProperty("user.dir");
	public static WebDriver driver;

	public WebDriver selectBrowser(String sBrowserName) {

		try {

			if (sBrowserName.equals("Mozilla")) {
				System.setProperty("webdriver.gecko.driver",
						path+"\\driverBrowsers\\geckodriver.exe");
				 driver = new FirefoxDriver();// Log.info("Web application launched with FireFox browser
														// successfully");
			} else if (sBrowserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						path+"\\driverBrowsers\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Log.info("Web application launched with Chrome browser successfully");
			}

			else if (sBrowserName.equals("IE")) {
				System.setProperty("webdriver.ie.driver",
						path+"\\driverBrowsers\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				// Log.info("Web application launched with Internet Explorer successfully");
			}

		} catch (Exception e) {
			System.out.println("None or te broweser opened");
			// Log.error("Class Utils | Method OpenBrowser | Exception desc :
			// "+e.getMessage());
		}

		return driver;

	}

}
