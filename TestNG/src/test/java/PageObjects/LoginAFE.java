package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginAFE {
	public WebDriver driver;
	public WebElement Username;
	public WebElement Password;
	public WebElement LoginButton;
	public WebElement AgreeCheckBox;
	public WebElement Newquote;
	public WebElement SelectLOB;// micpct-1074360006-overlays
	
	public LoginAFE(){
		PageFactory.initElements(driver, this);
		}
	
	/*public void initializeLogin(WebDriver driver)
	{	
		
		Username = driver.findElement(By.id("Enter user name"));
		Password = driver.findElement(By.id("passwd"));
		LoginButton = driver.findElement(By.id("Log_On"));
		
						
	}*/
	
	//@Test	
	  public void LoginwithGivenCrediantials() throws Exception {
		
 		
		setUsername(driver,"AGTCA");
		setPassword(driver,"Password1");
		ClickLogibutton(driver);
	}
	
	
	
	
	public void setUsername(WebDriver driver,String UserID) //,String inp_Valu
	
	{
		Username = driver.findElement(By.id("j_username"));//.xpath("//*[@id=\"username\"]"));
		//Username= driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
		//Username.clear();
		Username.click();	
		Username.sendKeys(UserID);
			
	}

	public void setPassword(WebDriver driver,String UserPass) //,String inp_Value
	{
		Password = driver.findElement(By.id("passwordText"));//.xpath("//*[@id=\"password\"]"));
		//Password.clear();
		Password.click();	
		Password.sendKeys(UserPass);
	}
	
		
	public void ClickLogibutton(WebDriver driver)
	{
		LoginButton = driver.findElement(By.id("loginBtn"));//.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[5]/div[1]/span/input"));
		LoginButton.click();	
		
	}
	
	
		

}
