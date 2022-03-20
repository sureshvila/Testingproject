package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class B2CAddDriver {

	public WebDriver driver;
	// public WebElement SelectStatedrpdown;
	public WebElement addQuotebutton;
	public WebElement AddNewDriverbutton; //
	public WebElement DriveraddtoQuote;// AddToQuoteBtn0
	public WebElement AddDriverbutton;// addDriverBtn1
	public WebElement SelectFemale;// femaledAddedDriver
	public WebElement SelectMale;// maledAddedDriver
	public WebElement AddDriverFirtsName;// additionalDriverFirstName
	public WebElement AddDriverLastName;// additionalDriverLastName
	public WebElement DriverDOB;// dateOfBirth
	public WebElement MaritalStatu;// maritalStatusAD DD SINGLE
	public WebElement RelationShip;// relationShipAD DD
	public WebElement Profession;// professionAD DD
	public WebElement DrAgeLicence;// driverAgeLicensedAD txt
	public WebElement LicenceNo;// licenseNumberAD txt
	public WebElement LicenceStatu;// licenseStatusAD DD
	public WebElement DriverStatus;// driverStatusAD0 DD
	public WebElement RadioNo;// addedDriverAccidentQstnNo Radono
	public WebElement ClickContinuebtn;//continue

	
	
	public void setLicenceNotxt(WebDriver driver,String inp_Value)
	{
		LicenceNo = driver.findElement(By.id("licenseNumber0"));//.xpath("//*[@id=\"username\"]"));
		LicenceNo.clear();
		//Username.click();	
		LicenceNo.sendKeys(inp_Value);
		LicenceNo.sendKeys(Keys.TAB);
	}
	
	public void setDrAgeLicencetxt(WebDriver driver,String inp_Value)
	{
		DrAgeLicence = driver.findElement(By.id("driverAgeLicensedAD"));//.xpath("//*[@id=\"username\"]"));
		DrAgeLicence.clear();
		//Username.click();	
		DrAgeLicence.sendKeys(inp_Value);
		DrAgeLicence.sendKeys(Keys.TAB);
	}
	
	
	public void setDriverDOBtxt(WebDriver driver,String inp_Value)
	{
		DriverDOB = driver.findElement(By.id("dateOfBirth"));//.xpath("//*[@id=\"username\"]"));
		DriverDOB.clear();
		//Username.click();	
		DriverDOB.sendKeys(inp_Value);
		DriverDOB.sendKeys(Keys.TAB);
	}
	
	public void setAddDriverLastNametxt(WebDriver driver,String inp_Value)
	{
		AddDriverLastName = driver.findElement(By.id("additionalDriverLastName"));//.xpath("//*[@id=\"username\"]"));
		AddDriverLastName.clear();
		//Username.click();	
		AddDriverLastName.sendKeys(inp_Value);
		AddDriverLastName.sendKeys(Keys.TAB);
	}
	
	
	public void setAddDriverFirtsNametxt(WebDriver driver,String inp_Value)
	{
		AddDriverFirtsName = driver.findElement(By.id("additionalDriverFirstName"));//.xpath("//*[@id=\"username\"]"));
		AddDriverFirtsName.clear();
		//Username.click();	
		AddDriverFirtsName.sendKeys(inp_Value);
		AddDriverFirtsName.sendKeys(Keys.TAB);
	}
	
	public void SelectFemale(WebDriver driver) {
		SelectFemale = driver.findElement(By.id("femaledDriver0"));
		SelectFemale.click();
	}

	public void SelectMale(WebDriver driver) {
		SelectMale = driver.findElement(By.id("maledDriver0"));
		SelectMale.click();
	}

	public void selectMaritalStatu(WebDriver driver, String inp_Value) {
		Select MaritalStatu = new Select(driver.findElement(By.id("maritalStatus0")));
		MaritalStatu.selectByVisibleText(inp_Value);

	}

	public void selectRelationShip(WebDriver driver, String inp_Value) {
		Select RelationShip = new Select(driver.findElement(By.id("licenseNumber0")));
		RelationShip.selectByVisibleText(inp_Value);

	}

	public void selectLicenceStatu(WebDriver driver, String inp_Value) {
		Select LicenceStatu = new Select(driver.findElement(By.id("licenseStatusAD")));
		LicenceStatu.selectByVisibleText(inp_Value);

	}

	public void selectDriverStatu(WebDriver driver, String inp_Value) {
		Select DriverStatus = new Select(driver.findElement(By.id("driverStatus0")));
		DriverStatus.selectByVisibleText(inp_Value);

	}

	public void SelectNooption(WebDriver driver) {
		RadioNo = driver.findElement(By.id("accidentQstnPrefillNo0"));
		RadioNo.click();

	}

	public void ClickaddQuotebutton(WebDriver driver) {
		addQuotebutton = driver.findElement(By.id("addPrefilledDriverToQuote0"));
		addQuotebutton.click();

	}

	public void ClickaddToquotebutton(WebDriver driver) {
		DriveraddtoQuote = driver.findElement(By.id("AddToQuoteBtn0"));
		DriveraddtoQuote.click();
	}
	
	public void ClickfinaladdToquotebutton(WebDriver driver) {
		DriveraddtoQuote = driver.findElement(By.id("addPrefilledDriverToQuote0"));
		DriveraddtoQuote.click();
	}

	public void Clickadddriverbutton(WebDriver driver) {
		AddNewDriverbutton = driver.findElement(By.id("addDriverBtn1"));
		AddNewDriverbutton.click();
	}

	
	public void ClickContinuebutton(WebDriver driver) {
		ClickContinuebtn = driver.findElement(By.id("continue"));
		ClickContinuebtn.click();
	}
}