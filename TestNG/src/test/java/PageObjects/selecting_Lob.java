package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class selecting_Lob {
	
	public WebDriver driver;
	public WebElement Company;
	public WebElement LineOfBusiness;
	public WebElement Programe;
	public WebElement Submitbutton;
	
	
	public selecting_Lob(){
		PageFactory.initElements(driver, this);
		}
	
	/*public void initializeLogin(WebDriver driver)
	{	
		
		Username = driver.findElement(By.id("Enter user name"));
		Password = driver.findElement(By.id("passwd"));
		LoginButton = driver.findElement(By.id("Log_On"));
		
						
	}*/
	
	@Test	
	public void SelectCompany(WebDriver drivere,String Companyname) //,String inp_Valu
	
	{
		Company = driver.findElement(By.id("company"));//.xpath("//*[@id=\"username\"]"));
		//Username= driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
		//Username.clear();
		Company.click();	
		Company.sendKeys(Companyname);
	
		
	}

	public void SelectLineOfBusiness(WebDriver driver,String Lob) //,String inp_Value
	{
		LineOfBusiness = driver.findElement(By.id("lineofBusiness"));//.xpath("//*[@id=\"password\"]"));
		//Password.clear();
		LineOfBusiness.click();	
		LineOfBusiness.sendKeys(Lob);
	}
	
	
	public void SelctPrograme(WebDriver driver,String Programename) //,String inp_Value
	{
		Programe = driver.findElement(By.id("program"));//.xpath("//*[@id=\"password\"]"));
		//Password.clear();
		Programe.click();	
		Programe.sendKeys(Programename);
	}
	
	
	public void ClickSubmitbutton(WebDriver driver)
	{
		Submitbutton = driver.findElement(By.id("submitPopupButton"));//.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[5]/div[1]/span/input"));
		Submitbutton.click();	
		
	}
	
	
	public void Select_101_Lob(WebDriver driver) {
		SelectCompany(driver,"MAPFRE INSURANCE COMPANY");
		SelectLineOfBusiness(driver,"AUTOMOBILE");
		SelctPrograme(driver,"ROAD AMERICA AUTO ASSIST PLUS");
		ClickSubmitbutton(driver);
			
	}
	
	
	public void Select_104_Lob(WebDriver driver) {
		SelectCompany(driver,"COMMERCE WEST INSURANCE COMPANY");
		SelectLineOfBusiness(driver,"AUTOMOBILE");
		SelctPrograme(driver,"CA PROTECTION AUTO");
		ClickSubmitbutton(driver);
		
			
	}
	public void Select_105_Lob(WebDriver driver) {
		SelectCompany(driver,"COMMERCE WEST INSURANCE COMPANY");
		SelectLineOfBusiness(driver,"AUTOMOBILE");
		SelctPrograme(driver,"CA GROUP AUTO");
		ClickSubmitbutton(driver);
			
	}
	
	
	
}
