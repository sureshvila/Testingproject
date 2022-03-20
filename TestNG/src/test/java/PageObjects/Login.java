package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	public WebElement Username;
	public WebElement Password;
	public WebElement LoginButton;
	
	
	public Login(){
		PageFactory.initElements(driver, this);
		}
	
	
	
	public void elementexisornot(WebDriver driver,String Elemnetname) {
		
		WebElement Elementexts = driver.findElement(By.xpath("//*[text()='"+Elemnetname+"']"));
		 
		if(Elementexts.isDisplayed())
		{
		System.out.println("Element found using text");
		}
		 
		else
		System.out.println("Element not found");
		driver.quit();
		}
		
	
	public void initializeLogin(WebDriver driver)
	{	
		
		Username = driver.findElement(By.id("Enter user name"));
		Password = driver.findElement(By.id("passwd"));
		LoginButton = driver.findElement(By.id("Log_On"));
		
						
	}
	
	
	public void setUsername(String inp_Value)
	{
		Username = driver.findElement(By.id("Enter user name"));
		Username.click();	
		Username.sendKeys(inp_Value);
	}

	public void setPassword(String inp_Value)
	{
		Password = driver.findElement(By.id("passwd"));
		Username.click();	
		Password.sendKeys(inp_Value);
	}
	
	public void ClickLogibutton()
	{
		LoginButton = driver.findElement(By.id("submit"));
		LoginButton.click();	
		
	}
	
	
	
	


}
