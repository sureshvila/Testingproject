package TestNgMaven.TestNG;

import static org.testng.Assert.assertEquals;
//import org.safs.selenium.webdriver.lib.SearchObject.DOJO
import java.io.File;
import java.io.FileOutputStream;
import java.lang.System.Logger;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.commons.jexl2.internal.AbstractExecutor.Set;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.jcg.logging.Log4j2Example;

import Utility.Browserseltion;
import Utility.ScreenCapture;


public class LoginAFEApplication {
	public PageObjects.LoginAFE loginAFE = new PageObjects.LoginAFE();
	public Utility.Browserseltion browSel= new Browserseltion();
	public Utility.ScreenCapture scrsht= new Utility.ScreenCapture();
	public Utility.ExcelUtils excelutil = new Utility.ExcelUtils();
	public Utility.Constant constvalues= new Utility.Constant();
	public WebDriver driver;
	public Utility.InsertImageindoc  docmentcre =new Utility.InsertImageindoc();
	
	//String Currentwindow;
	
	//private static final Logger LOG = LogManager
	//private static final Logger LOG = LogManager.getLogger(LoginDemosite.class);
	
	//@Test
	public void Companyselect() throws Exception{
		LoginDemosite();
		//System.out.println("First window "+driver.getTitle());
    	driver.findElement(By.linkText("New Quote")).click(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Click on New Quote");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//System.out.println("First window "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	driver.findElement(By.linkText("New Quote")).click(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Click on New Quote");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.switchTo().frame(0);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.findElement(By.id("widget_company")).click();
    	
    	
	}
	//@Test
    public void LoginDemosite() throws Exception {
		
    	//Log.error("Error");
		String Projpath = System.getProperty("user.dir");
 		//String otherFolder = fpath + "\\other";
 		System.out.println("Path is "+Projpath);
      	System.setProperty("webdriver.chrome.driver",Projpath+"\\driverBrowsers\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		//driver.
 		//scrsht.ImagewithName(driver, "Home URL");
 		//loginAFE.setUsername("AGTCA");
 		
 		driver.get("https://afeppr.mapfreconnect.com/agent/login");//PPR
 		//driver.get("http://afeint03.mapfreconnect.com/agent/login");// D02
    	driver.findElement(By.name("j_username")).click();//.xpath("//*[@id=\"username\"]"));
    	driver.manage().timeouts().implicitlyWait(23,TimeUnit.SECONDS);	
    	highLighterObject(driver,driver.findElement(By.name("j_username")));
    	driver.findElement(By.name("j_username")).sendKeys("AGTCA");
    	driver.findElement(By.name("j_username")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).click();
    	driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).sendKeys("Password1");
    	driver.findElement(By.id("loginBtn")).click();
    	driver.manage().timeouts().implicitlyWait(75,TimeUnit.SECONDS);
    	//String Currentwindow = driver.getWindowHandle();
    	
    	scrsht.ImagewithtimestampandName(driver, "Suresh");
    	if (driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li[1]/a")).isDisplayed());
    	{
    		System.out.println("Loging Sucess");
    	
    	}
 				
    }
	
	//@Test
    public void LoginwithGivenCrediantials() throws Exception {
		String Projpath = System.getProperty("user.dir");
 		//String otherFolder = fpath + "\\other";
 		System.out.println("Path is "+Projpath);
 		//Log.info(Projpath);
    	System.setProperty("webdriver.chrome.driver",Projpath+"\\driverBrowsers\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		//loginAFE.setUsername("AGTCA");
 		
 				
    }
    
    
   // @Test(priority=1)
    public void selectcompany() throws Exception {
    	
    	driver.quit();
    	
	 }
    
  @Test
    public void selectWindow() throws Exception {
    	String Projpath = System.getProperty("user.dir");
 		//String otherFolder = fpath + "\\other";
 		System.out.println("Path is "+Projpath);
        //-Chrome
 		//System.setProperty("webdriver.chrome.driver",Projpath+"\\driverBrowsers\\chromedriver.exe");
 		//WebDriver driver = webdriver.Chrome(ChromeDriverManager().install())
 		//WebDriver driver = new ChromeDriver();
 		///--Firefox
    	System.setProperty("webdriver.gecko.driver",Projpath+"\\driverBrowsers\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		
 		driver.get("https://afeppr.mapfreconnect.com/agent/login");//PPR
 		//driver.get("http://afeint03.mapfreconnect.com/agent/login");// D02
    	//driver.findElement(By.name("j_username")).click();//.xpath("//*[@id=\"username\"]"));
    	//driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	//scrsht.ImagewithtimestampandName(driver, "Suresh123");
    	//String enetertxt=driver.getCurrentUrl().toString();
    	//create doc
    	
    	//End Testlogin
    	
    	
    	//docmentcre.image_insert("101_NB",scrsht.Imagewithtimestamp(driver));
    	//docmentcre.insertText("Smoktet",""+enetertxt);
    	//end
    	//highLighterObject(driver,driver.findElement(By.name("j_username")));
    	
    	//driver.findElement(By.name("j_username")).sendKeys("AGTCA");
    	 	
    	driver.manage().timeouts().implicitlyWait(53,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_username")).click();//.xpath("//*[@id=\"username\"]"));
    	driver.manage().timeouts().implicitlyWait(23,TimeUnit.SECONDS);	
    	highLighterObject(driver,driver.findElement(By.name("j_username")));
    	driver.findElement(By.name("j_username")).sendKeys("AGTCA");
    	driver.findElement(By.name("j_username")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).click();
    	driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).sendKeys("Password1");
    	driver.findElement(By.id("loginBtn")).click();
    	driver.manage().timeouts().implicitlyWait(75,TimeUnit.SECONDS);
    	String Currentwindow = driver.getWindowHandle();
    	
    	scrsht.ImagewithtimestampandName(driver, "login");
    	if (driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li[1]/a")).isDisplayed());
    	{
    		System.out.println("Login Success");
    	
    	}
    	//*[@id="company"]
    	System.out.println("First window "+driver.getTitle());
    	driver.findElement(By.linkText("New Quote")).click(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Click on New Quote");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    	//driver.switchTo().frame("newQuoteDialog"); //switching the frame by ID
    	
    	//select_104_Lob(driver);
    	
    	driver.switchTo().frame(0);
    	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	driver.findElement(By.id("company")).sendKeys("COMMERCE WEST INSURANCE COMPANY");
    	driver.findElement(By.id("company")).sendKeys(Keys.TAB);
    	System.out.println("Select Company");
    	driver.findElement(By.id("lineofBusiness")).sendKeys("AUTOMOBILE");
    	driver.findElement(By.id("lineofBusiness")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Select Lob");
    	driver.findElement(By.id("program")).sendKeys("CA PROTECTION AUTO");
    	driver.findElement(By.id("program")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Select Programe");
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	driver.findElement(By.id("submitPopupButton")).click();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	    	
    		if(driver.findElement(By.id("submitPopupButton")).isEnabled())
    		{
    			driver.findElement(By.id("submitPopupButton")).click();
    			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    		}
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	driver.switchTo().window(Currentwindow);
    	String cururl=driver.getCurrentUrl().toString();
    	System.out.println("Window switched"+cururl);
	   // driver.switchTo().defaultContent();
    	
    	//driver.switchTo().window(Currentwindow);
    	
	    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	       
	   // widgetid
	    //General Screen
	   
	    if (driver.findElement(By.id("policyTermSpan")).isDisplayed()) {
	    	
	    	driver.findElement(By.id("policyTerm")).clear();
		    driver.findElement(By.id("policyTerm")).sendKeys("6 MONTH");
		    driver.findElement(By.id("policyTerm")).sendKeys(Keys.ENTER);	
	    }
	    else
	    {
	    	System.out.println("Policy tem is not Visible");
	    	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
	    }
	      
	       
	    driver.findElement(By.id("firstName")).click();
    	driver.findElement(By.id("firstName")).sendKeys("Testing");
    	
    	driver.findElement(By.id("lastName")).sendKeys("Lastname");
    	
    	driver.findElement(By.id("resAddress1")).sendKeys("Main St 104");
    	driver.findElement(By.id("resZipCode1")).sendKeys("92805");
    	driver.findElement(By.id("resZipCode1")).sendKeys(Keys.TAB);
    	driver.findElement(By.id("resZipCode2")).sendKeys(Keys.TAB);
    	driver.findElement(By.id("city")).click();
    	driver.findElement(By.id("city")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	driver.findElement(By.id("state")).click();
    	driver.findElement(By.id("state")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	//driver.findElement(By.id("mailAddressConfNo")).click();
    	//driver.findElement(By.id("mailAddressConfNo")).sendKeys(Keys.TAB);
    	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	 	
    	if(driver.findElement(By.id("homePhone1")).isDisplayed())
    	{
    		highLighterObject(driver,driver.findElement(By.id("homePhone1")));
    		driver.findElement(By.id("homePhone1")).click();
    	}
    	//System.out.println(driver.findElement(By.id("homePhone1")).isEnabled());
		//System.out.println(driver.findElement(By.id("homePhone1")).wait();
    	driver.findElement(By.id("homePhone1")).click();
		driver.findElement(By.id("homePhone1")).sendKeys("1112223333");
    	driver.findElement(By.id("nextId")).click();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	System.out.println("click next in genscreen");
    	scrsht.ImagewithtimestampandName(driver, "General Screen");
    	
    	//Vehicle screen
    	
    	//driver.switchTo().activeElement().findElement(By.id("vinId"));
    	driver.findElement(By.id("vinId")).click();
    	driver.findElement(By.id("vinId")).sendKeys("5J8TB4H31HL013493");
    	driver.findElement(By.id("vinId")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	driver.switchTo().activeElement().findElement(By.id("vehicleOwnerId"));
    	////------------- sample code
		/*
		 * String option = "OWNED";
		 * driver.findElement(By.id("vehicleOwnerId")).sendKeys(option); //optionXpath =
		 * "//div[text()='"+option+"']" //optEle =
		 * driver.findElement(By.xpath(optionXpath )) JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript(""arguments[0].click();",optEle
		 * ); //driver.findElement(By.id("vehicleOwnerId")).sendKeys("OWNED");;
		 * //SelVehiclOwn.selectByValue("OWNED"); //------ Avtion Actions action = new
		 * Actions(driver); action.moveToElement(element).click().perform();
		 */
    			
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("vehicleUseId")).sendKeys("PLEASURE");
    	driver.findElement(By.id("vehicleUseId")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	driver.findElement(By.id("annualMileageId")).sendKeys("1234");
    	//driver.findElement(By.id("annualMileageId")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	driver.findElement(By.id("nextId")).click();
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	System.out.println("click next in vehicle screen");
    	scrsht.ImagewithtimestampandName(driver, "Vehicle Screen");
    	//Driver screen
    	driver.findElement(By.id("widget_month")).click();
    	driver.findElement(By.id("widget_month")).sendKeys("10101980");
    	driver.findElement(By.id("male")).click();
    	
    	driver.findElement(By.id("maritalstatus")).sendKeys("SINGLE");
    	
    	driver.findElement(By.id("driverstatus")).sendKeys("PRINCIPAL-ACTIVE");
    	
    	driver.findElement(By.id("licensestatus")).sendKeys("ACTIVE"); 
    	
    	driver.findElement(By.id("statelicensed")).sendKeys("CALIFORNIA"); 
    	 
    	driver.findElement(By.id("usorcanad")).click();
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("nextId")).click();
    	System.out.println("click next in Driver screen");
    	//Coverage Screen
    	
    	driver.findElement(By.id("collectormethodmb")).click();
    	
    	driver.findElement(By.id("paymentPlanSelect")).sendKeys("SEMI-ANNUAL MONTHLY PMTS 16.7%"); 
    	
    	driver.findElement(By.id("4")).sendKeys("500");
    	driver.findElement(By.id("5")).sendKeys("500");
    	
    	    	
    	String  Quote_no= driver.findElement(By.className("userNameText")).toString();
    	System.out.println("Quote"+Quote_no);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	driver.findElement(By.id("nextId")).click();
    	
    	System.out.println("click next in Driver screen");
    	scrsht.ImagewithtimestampandName(driver, "Coverage Screen");
    	 //       full quote
    	
    	
    	
    	
    	    
    }
    

    //
    
    
    public void select_104_Lob (WebDriver driver)
    
    {
    	
    	driver.switchTo().frame(0);
    	//driver.switchTo().frame("newQuoteDialog"); //switching the frame by ID
    	
    	driver.findElement(By.id("company")).sendKeys("COMMERCE WEST INSURANCE COMPANY");
    	System.out.println("Select Company");
    	driver.findElement(By.id("lineofBusiness")).sendKeys("AUTOMOBILE");
    	System.out.println("Select Lob");
    	
    	driver.findElement(By.id("program")).sendKeys("CA PROTECTION AUTO");
    	System.out.println("Select Programe");
    	
    	driver.findElement(By.id("submitPopupButton")).click();
    	
    		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    		if(driver.findElement(By.id("submitPopupButton")).isDisplayed()==true)
    		{
    			driver.findElement(By.id("submitPopupButton")).click();
    		}
    		
    		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    		//driver.switchTo().window(Currentwindow);	
    	
    }
    
    
public void select_105_Lob (WebDriver driver)
    
    {
    	driver.switchTo().frame(0);
    	//driver.switchTo().frame("newQuoteDialog"); //switching the frame by ID
    	
    	driver.findElement(By.id("company")).sendKeys("COMMERCE WEST INSURANCE COMPANY");
    	System.out.println("Select Company");
    	driver.findElement(By.id("lineofBusiness")).sendKeys("AUTOMOBILE");
    	System.out.println("Select Lob");
    	
    	driver.findElement(By.id("program")).sendKeys("CA GROUP AUTO");
    	System.out.println("Select Programe");
    	
    	driver.findElement(By.id("submitPopupButton")).click();
    	
    		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    		if(driver.findElement(By.id("submitPopupButton")).isDisplayed()==true)
    		{
    			driver.findElement(By.id("submitPopupButton")).click();
    		}
    		
    		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
    }

public void select_101_Lob (WebDriver driver)

{
	driver.switchTo().frame(0);
	//driver.switchTo().frame("newQuoteDialog"); //switching the frame by ID
	
	driver.findElement(By.id("company")).sendKeys("MAPFRE INSURANCE COMPANY");
	//driver.findElement(By.id("company")).sendKeys(Keys.TAB);
	System.out.println("Select Company");
	//driver.findElement(By.id("company")).sendKeys(Keys.TAB);
	//driver.findElement(By.id("lineofBusiness")).click();
	driver.findElement(By.id("lineofBusiness")).sendKeys("AUTOMOBILE");
	//driver.findElement(By.id("lineofBusiness")).sendKeys(Keys.TAB);
	System.out.println("Select Lob");
	
	driver.findElement(By.id("program")).sendKeys("ROAD AMERICA AUTO ASSIST PLUS");
	//driver.findElement(By.id("program")).sendKeys(Keys.TAB);
	System.out.println("Select Programe");
	
	driver.findElement(By.id("submitPopupButton")).click();
	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		if(driver.findElement(By.id("submitPopupButton")).isDisplayed()==true)
		{
			driver.findElement(By.id("submitPopupButton")).click();
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
}

    public void highLighterObject(WebDriver driver, WebElement element){
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    	}
    	

   //@Test
     public void exampleOfTestNgMaven()throws Exception {
    	 String Projpath = System.getProperty("user.dir");
 		//String otherFolder = fpath + "\\other";
 		System.out.println("Path is "+Projpath);
 		//excelutil.getRowsColumnCount();
 		//excelutil.setExcelFileSheet("AFE_InputData","Login");
 		/*System.out.println("Login AFE App in IE");
        System.setProperty("webdriver.ie.driver",Projpath+"\\driverBrowsers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();*/
 			
 		//---//*[@id="company"]
 		/*System.setProperty("webdriver.gecko.driver",
 				Projpath+"\\driverBrowsers\\geckodriver.exe");
 		WebDriver driver = new FirefoxDriver();*/
		 //---
 		System.setProperty("webdriver.chrome.driver",Projpath+"\\driverBrowsers\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		//
 		driver.get("https://afeppr.mapfreconnect.com/agent/login");
    	driver.findElement(By.name("j_username")).click();;//.xpath("//*[@id=\"username\"]"));
    	driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_username")).sendKeys("AGTCA");
    	driver.findElement(By.name("j_username")).sendKeys(Keys.TAB);
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).click();
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
    	driver.findElement(By.name("j_password")).sendKeys("Password1");
    	driver.findElement(By.id("loginBtn")).click();
    	driver.manage().timeouts().implicitlyWait(65,TimeUnit.SECONDS);
    	if (driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li[1]/a")).isDisplayed());
    	{
    		System.out.println("Loging Sucess");
    	
    	}
    	//*[@id="company"]
    	
    	driver.findElement(By.linkText("New Quote")).click(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	System.out.println("Click on New Quote"); 
    	//Alert alert = driver.switchTo().alert();
    	//String alertMessage= driver.switchTo().alert().getText();
    	//driver.switchTo().alert().sendKeys("MAPFRE INSURANCE COMPANY");
    	
    
    	//driver.findElement(By.id("company")).sendKeys("intended-drop-down-value",Keys.ARROW_DOWN,Keys.RETURN);
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	System.out.println("Wait for general PAge");
    	/*String myWindowHandle = driver.getWindowHandle();
    	driver.switchTo().window(myWindowHandle);
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]")).click();
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("MAPFRE INSURANCE COMPANY");
    	*/
    	
    	
    	//WebElement email_id= driver.findElement(By.xpath("//*[@id='signin_info']/a[1]"));
    	
    	//email_id.sendKeys("hi");
    	
    	
    	
    	//------
    	
    	
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]")).click();
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	//driver.findElement(By.xpath("//*[@id=\"company\"]")
    	//driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[1]/div[1]/div[2]/div/div[1]/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("MAPFRE INSURANCE COMPANY");
    	//driver.findElement(By.id("company")).sendKeys("MAPFRE INSURANCE COMPANY");
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	driver.findElement(By.id("lineofBusiness")).sendKeys("AUTOMOBILE");
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	driver.findElement(By.id("program")).sendKeys("ROAD AMERICA AUTO ASSIST PLUS");
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	driver.findElement(By.id("submitPopupButton")).click();
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    	
//    	Select selcom =  new  Select(driver.findElement(By.name("company")));
//    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    	selcom.selectByValue("MAPFRE INSURANCE COMPANY");
//    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    	Select selLob =  new  Select(driver.findElement(By.name("lineofBusiness")));
//    	selLob.selectByVisibleText("AUTOMOBILE");
//    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    	Select selprg =  new  Select(driver.findElement(By.name("program")));
//    	selprg.selectByVisibleText("ROAD AMERICA AUTO ASSIST PLUS");
//    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    	
//    		//	.sendKeys("MAPFRE INSURANCE COMPANY"));
//    	
//    	//driver.findElement(By.name("lineofBusiness")).sendKeys("AUTOMOBILE");
//    	//driver.findElement(By.name("program")).sendKeys("ROAD AMERICA AUTO ASSIST PLUS");
//    	driver.findElement(By.id("submitPopupButton")).click();
//    	
    	
    	//*[@id="header"]/ul/li[1]/a
    	     		
      }   		
      		}