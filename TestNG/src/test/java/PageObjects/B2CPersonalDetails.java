package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class B2CPersonalDetails {

	public WebDriver driver;
	public WebElement FirstName ;
	public WebElement LastName  ;
	public WebElement MailingAddress ;
	public WebElement ZipCode ;
	public WebElement DateofBirth; 
	public WebElement email;
	public WebElement Continuebutton;
	
	public B2CPersonalDetails(){
		PageFactory.initElements(driver, this);
		}	
	
	
public void selectState(WebDriver driver,String inp_Value)
{
	Select SelectStatedrpdown = new Select(driver.findElement(By.id("mic_quote_select_state")));
	SelectStatedrpdown.selectByVisibleText(inp_Value);
	
}
public void Continuebutton(WebDriver driver)
{
	Continuebutton = driver.findElement(By.id("welcomePageNext"));
	Continuebutton.click();	
	
}
public void setFirstName(WebDriver driver,String inp_Value)
	{
	FirstName = driver.findElement(By.id("firstName"));
	FirstName.click();	
	FirstName.sendKeys(inp_Value);
	}


public void setLastName(WebDriver driver,String inp_Value)
{
	LastName = driver.findElement(By.id("lastName"));
	LastName.click();	
	LastName.sendKeys(inp_Value);
}

public void setMailingAddress(WebDriver driver,String inp_Value)
{
	MailingAddress = driver.findElement(By.id("mailingAddress"));
	MailingAddress.click();	
	MailingAddress.sendKeys(inp_Value);
}

public void setZipCode(WebDriver driver,String inp_Value)
{
	ZipCode = driver.findElement(By.id("zip"));
	ZipCode.click();	
	ZipCode.sendKeys(inp_Value);
}

public void setDateofBirth(WebDriver driver,String inp_Value)
{
	DateofBirth = driver.findElement(By.id("dateOfBirth"));
	DateofBirth.click();	
	DateofBirth.sendKeys(inp_Value);
}

public void setemail(WebDriver driver,String inp_Value)
{
	email = driver.findElement(By.id("email"));
	email.click();	
	email.sendKeys(inp_Value);
}



}