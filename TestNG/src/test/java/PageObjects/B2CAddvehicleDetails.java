package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class B2CAddvehicleDetails {

	public WebDriver driver;
	public WebElement SelectStatedrpdown;
	public WebElement Quotebutton;
	public WebElement AddNewVehiclebutton;
	public WebElement AddVehicletoQuotebutton;
	public WebElement VinNumtxt;
	
	public WebElement YesRadiobutton;//garagedYes
	public WebElement NoRadiobutton;//garagedNo
	public WebElement VehicleOwnerDrpdnvalue;//ownership
	public WebElement VehicleUseDrpdnvalue;//vehicleUseAdd
	public WebElement CurrentMileagetxt;
	public WebElement EstimatedAnnualMileagetxt;
	public WebElement AddtoquoteButton;
	public WebElement AddOtherVehiclebutton;
	public WebElement Cancebutton;
	
	//resetVehPopup_1
	//next
	////
	
	

	
	public void setVinNo(WebDriver driver,String inp_Value)
	{
		VinNumtxt = driver.findElement(By.id("vinNumber"));//.xpath("//*[@id=\"username\"]"));
		VinNumtxt.clear();
		//Username.click();	
		VinNumtxt.sendKeys(inp_Value);
		VinNumtxt.sendKeys(Keys.TAB);
	}
	
	

public void selectVehicleOwner(WebDriver driver,String inp_Value)
{
	Select VehicleOwnerDrpdnvalue = new Select(driver.findElement(By.id("ownership")));
	VehicleOwnerDrpdnvalue.selectByVisibleText(inp_Value);
	
}

public void selectVehicleUse(WebDriver driver,String inp_Value)
{
	Select VehicleUseDrpdnvalue = new Select(driver.findElement(By.id("vehicleUseAdd")));
	VehicleUseDrpdnvalue.selectByVisibleText(inp_Value);
	
}


public void setCurrentMileagetxt(WebDriver driver,String inp_Value)
{
	CurrentMileagetxt = driver.findElement(By.id("cuurentMileage"));//.xpath("//*[@id=\"username\"]"));
	CurrentMileagetxt.clear();
	//Username.click();	
	CurrentMileagetxt.sendKeys(inp_Value);
	CurrentMileagetxt.sendKeys(Keys.TAB);
}

public void setEstimatedAnnualMileagetxt(WebDriver driver,String inp_Value)
{
	EstimatedAnnualMileagetxt = driver.findElement(By.id("annualMileage"));//.xpath("//*[@id=\"username\"]"));
	EstimatedAnnualMileagetxt.clear();
	//Username.click();	
	EstimatedAnnualMileagetxt.sendKeys(inp_Value);
	EstimatedAnnualMileagetxt.sendKeys(Keys.TAB);
}

//NoRadiobutton

public void SelectNooption(WebDriver driver)
{
	NoRadiobutton = driver.findElement(By.id("garagedNo"));
	NoRadiobutton.click();	
	
}

public void SelectYesoption(WebDriver driver)
{
	YesRadiobutton = driver.findElement(By.id("garagedYes"));
	YesRadiobutton.click();	
	
}

public void ClickCancelbutton(WebDriver driver)
{
	Cancebutton = driver.findElement(By.id("resetVehPopup_1"));
	Cancebutton.click();	
}


public void ClickContinuebutton(WebDriver driver)
{
	AddOtherVehiclebutton = driver.findElement(By.id("next"));
	AddOtherVehiclebutton.click();	
}

public void ClickQuotebutton(WebDriver driver)
{
	Quotebutton = driver.findElement(By.id("quote_button"));
	Quotebutton.click();	
	
}
public void ClickAddNevehicleButton(WebDriver driver)
{
	AddNewVehiclebutton = driver.findElement(By.id("addNewVeh"));
	AddNewVehiclebutton.click();	
	
}

public void ClickAddtoquoteBtn(WebDriver driver)
{
	AddtoquoteButton = driver.findElement(By.id("vehicleAddToQuote_1"));
	AddtoquoteButton.click();	
	
}


public void ClickAddVehtoQuoteButton(WebDriver driver)
{
	AddVehicletoQuotebutton = driver.findElement(By.id("vehicleAddToQuote_1"));
	AddVehicletoQuotebutton.click();	
	
}


//vehicleAddToQuote_1

}