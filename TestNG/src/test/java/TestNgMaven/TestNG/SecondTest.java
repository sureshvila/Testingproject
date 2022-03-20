/*package TestNgMaven.TestNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



import Utility.*;

public class SecondTest {
	public PageObjects.Login login = new PageObjects.Login();
	public Utility.ScreenCapture scrsht= new Utility.ScreenCapture();
	public Utility.ExcelUtils exlLogin = new Utility.ExcelUtils();
	//public com.RBA.PageObjects.Login  Login = new com.RBA.PageObjects.Login();
	
	
	@Test
    public void exampleOfTestNgMaven()throws Exception {
		String Projpath = System.getProperty("user.dir");
		exlLogin.setExcelFileSheet("AFE_InputData_601","Login");
		//excelutil.getRowsColumnCount();
		//excelutil.getColumnNumber();
        System.out.println("This is secondTest Example Launch IE");
        System.setProperty("webdriver.ie.driver",Projpath+"\\driverBrowsers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		//for (int i = 1; i < 3; i++) {
		//	System.out.println("selected Row"+i);
		//	int j=3;
		driver.get(exlLogin.getCellData(1,2));
		//driver.get("https://xd.mapfreinsurance.com/vpn/index.html");
		login.initializeLogin(driver);
		//System.out.println("selected Row"+i);
		//System.out.println("selected column"+i);
		login.Username.sendKeys(exlLogin.getCellData(1,3));
		login.Password.sendKeys(exlLogin.getCellData(1,4));
		login.LoginButton.click();
		scrsht.takeSnapShot(driver,"sureshsecond");
		scrsht.screenshots(driver);
		String data1=exlLogin.getCellData(1,1).toString();
		System.out.println("cell data"+data1);
		
		
		}
	//}
	
	
}
*/