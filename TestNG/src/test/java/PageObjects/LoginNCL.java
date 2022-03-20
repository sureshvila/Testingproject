package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginNCL {
	
	public WebDriver driver;
	public WebElement Username;
	public WebElement Password;
	public WebElement LoginButton;
	public WebElement AgreeCheckBox;
	public WebElement Newquote;
	public WebElement SelectLOB;// micpct-1074360006-overlays
	
	public LoginNCL(){
		PageFactory.initElements(driver, this);
		}
	
	/*public void initializeLogin(WebDriver driver)
	{	
		
		Username = driver.findElement(By.id("Enter user name"));
		Password = driver.findElement(By.id("passwd"));
		LoginButton = driver.findElement(By.id("Log_On"));
		
						
	}*/
	
		
	public void setUsername(WebDriver driver,String inp_Value)
	{
		Username = driver.findElement(By.name("username"));//.xpath("//*[@id=\"username\"]"));
		Username.clear();
		//Username.click();	
		Username.sendKeys(inp_Value);
	}

	public void setPassword(WebDriver driver,String inp_Value)
	{
		Password = driver.findElement(By.name("password"));//.xpath("//*[@id=\"password\"]"));
		Password.clear();
		//Password.click();	
		Password.sendKeys(inp_Value);
	}
	
	
	public void AgreeChecboxselect(WebDriver driver) {
		AgreeCheckBox = driver.findElement(By.name("cookieConsent"));////*[@id="cookieConsent"];
		AgreeCheckBox.click();	
	}
	public void ClickLogibutton(WebDriver driver)
	{
		LoginButton = driver.findElement(By.name("submit"));//.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[5]/div[1]/span/input"));
		LoginButton.click();	
		
	}
	
	public void newquote(WebDriver driver)
	{
		Newquote = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div[2]/div[3]/div/input"));
		Newquote.click();
		
		//Newquote = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div[2]/div[3]/div/input"))
		///html/body/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div[2]/div[3]/div/input	
	}
	
	public void Selectlob(WebDriver driver)
	{
		
		
		
		SelectLOB = driver.findElement(By.id("micpct-1074360006-overlays"));
		SelectLOB.click();
	}
		

	


}
