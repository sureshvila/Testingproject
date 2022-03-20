package TestNgMaven.TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import Utility.Browserseltion;

public class B2CTestCases {

	public PageObjects.LoginNCL login = new PageObjects.LoginNCL();
	public PageObjects.B2CTests b2c = new PageObjects.B2CTests();
	public PageObjects.B2CPersonalDetails b2cPD = new PageObjects.B2CPersonalDetails();
	public PageObjects.B2CAddvehicleDetails b2cAddVeh = new PageObjects.B2CAddvehicleDetails();
	public PageObjects.B2CAddDriver b2cDriver = new PageObjects.B2CAddDriver();
	public Utility.Browserseltion browSel= new Browserseltion();
	public Utility.ScreenCapture scrsht= new Utility.ScreenCapture();
	public Utility.ExcelUtils excelutil = new Utility.ExcelUtils();
	public Utility.Constant constvalues= new Utility.Constant();
	
	@Test
    public void TestCase16() throws Exception {
		 String Projpath = System.getProperty("user.dir");
			//String otherFolder = fpath + "\\other";
			System.out.println("Path is "+Projpath);
			//excelutil.getRowsColumnCount();
			
			System.out.println("Login B2C App in IE");
	        System.setProperty("webdriver.ie.driver",Projpath+"\\driverBrowsers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			//driver.get("https://pmic-app06-dev.cgi.int/mic ");
			
			//driver.get(excelutil.getCellData(2,2));
			driver.get("https://ppr.mapfreinsurance.com/b2cwebapp/home");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
			b2c.selectState(driver,"California");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
			b2c.ClickQuotebutton(driver);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			/*Policy Holder details to fill*/
			//assert.b2cPD.FirstName.isDisplayed()).toString();
			//assert.assertEquals("True","true");
			b2cPD.setFirstName(driver,"NAGES");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			b2cPD.setLastName(driver,"FAROOQ");
			b2cPD.setMailingAddress(driver,"1729 GREENTREE DR");
			b2cPD.setZipCode(driver,"94521");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			b2cPD.setDateofBirth(driver,"07051946");
			b2cPD.setemail(driver,"Testemai@test.com");
			b2cPD.Continuebutton(driver);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			/*Vehicle details to fill*/
			b2cAddVeh.ClickAddNevehicleButton(driver);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			b2cAddVeh.setVinNo(driver,"1HGCM72336A008471");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			b2cAddVeh.SelectNooption(driver);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			b2cAddVeh.selectVehicleOwner(driver, "OWNED");
			b2cAddVeh.selectVehicleUse(driver, "PLEASURE");
			b2cAddVeh.setCurrentMileagetxt(driver, "1000");
			b2cAddVeh.setEstimatedAnnualMileagetxt(driver, "2020");
			b2cAddVeh.ClickAddtoquoteBtn(driver);
			System.out.println("Click quote button");
			//b2cAddVeh.ClickAddOthervehbutton(driver);
			//System.out.println("Click add one more vehicle");
			//b2cAddVeh.ClickCancelbutton(driver);
			//System.out.println("Close the window");
			//b2cPD.Continuebutton(driver);
			b2cAddVeh.ClickContinuebutton(driver);
			System.out.println("Continue ..");
			/*VDriver details to fill*/
			b2cDriver.ClickaddToquotebutton(driver);
			System.out.println("Click Add to quote policy holder");
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			//b2cDriver.SelectFemale(driver);
			b2cDriver.SelectMale(driver);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			b2cDriver.selectMaritalStatu(driver,"SINGLE");
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			b2cDriver.setLicenceNotxt(driver, "D123455678");
			b2cDriver.selectDriverStatu(driver,"PRINCIPAL OPERATOR");
			b2cDriver.SelectNooption(driver);
			b2cDriver.ClickfinaladdToquotebutton(driver);
			System.out.println("Default Driver added Sucessfull");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			b2cDriver.ClickContinuebutton(driver);
			
		
	
	}
	
	@Test
    public void TestCase17() throws Exception {
			
	}
	
	@Test
    public void TestCase18() throws Exception {
		
	}
	
}
