package TestNgMaven.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import Utility.Browserseltion;
import Utility.ScreenCapture;

public class LoginNCLApplication {
	public PageObjects.LoginNCL login = new PageObjects.LoginNCL();
	public Utility.Browserseltion browSel= new Browserseltion();
	public Utility.ScreenCapture scrsht= new Utility.ScreenCapture();
	public Utility.ExcelUtils excelutil = new Utility.ExcelUtils();
	public Utility.Constant constvalues= new Utility.Constant();
	

	
	@Test
    public void LoginwithGivenCrediantials() throws Exception {
		//System.out.println("PRDURL"+constvalues.PRDURL);
		 String Projpath = System.getProperty("user.dir");
		//String otherFolder = fpath + "\\other";
		System.out.println("Path is "+Projpath);
		//excelutil.getRowsColumnCount();
		excelutil.setExcelFileSheet("NCL_InputData_801","Login");
		System.out.println("Login NCL App in IE");
        System.setProperty("webdriver.ie.driver",Projpath+"\\driverBrowsers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		//driver.get("https://pmic-app06-dev.cgi.int/mic ");
		
		driver.get(excelutil.getCellData(2,2));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//login.initializeLogin(driver);
	    login.setUsername(driver,(excelutil.getCellData(2,3)));
		//login.Username.sendKeys(excelutil.getCellData(2,3));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//.implicitlyWait(5,) ;
		login.setPassword(driver,(excelutil.getCellData(2,4)));
		System.out.println("Password");
		//login.Password.sendKeys(excelutil.getCellData(1,4));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		login.AgreeChecboxselect(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		login.ClickLogibutton(driver);
		//login.LoginButton.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//scrsht.takeSnapShot(driver,"sureshLogin");
		//scrsht.screenshots(driver);
		login.newquote(driver);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		login.Selectlob(driver);
			
    }
     
   // @Test
     public void exampleOfTestNgMaven()throws Exception {
      		String Projpath = System.getProperty("user.dir");
      		excelutil.setExcelFileSheet("AFE_InputData_601","Login");
      		//excelutil.getRowsColumnCount();
      		//excelutil.getColumnNumber();
              System.out.println("This is secondTest Example Launch IE");
              System.setProperty("webdriver.ie.driver",Projpath+"\\driverBrowsers\\IEDriverServer.exe");
      		WebDriver driver = new InternetExplorerDriver();
      		driver.manage().window().maximize();
      		//for (int i = 1; i < 3; i++) {
      		//	System.out.println("selected Row"+i);
      		//	int j=3;
      		driver.get(excelutil.getCellData(1,2));
      		//driver.get("https://xd.mapfreinsurance.com/vpn/index.html");
      		//login..initializeLogin(driver);
      		//System.out.println("selected Row"+i);
      		//System.out.println("selected column"+i);
      		login.Username.sendKeys(excelutil.getCellData(1,3));
      		login.Password.sendKeys(excelutil.getCellData(1,4));
      		System.out.println("'Suresh Print");
      		login.AgreeChecboxselect(driver);
      		login.LoginButton.click();
      		//scrsht.takeSnapShot(driver,"sureshsecond");
      		//scrsht.screenshots(driver);
      		String data1=excelutil.getCellData(1,1).toString();
      		System.out.println("cell data"+data1);
      		
      }   		
      		}