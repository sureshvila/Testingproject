package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class B2CTests {

	public WebDriver driver;
	public WebElement SelectStatedrpdown;
	public WebElement Quotebutton;
	
	

public void selectState(WebDriver driver,String inp_Value)
{
	Select SelectStatedrpdown = new Select(driver.findElement(By.id("mic_quote_select_state")));
	SelectStatedrpdown.selectByVisibleText(inp_Value);
	
}
public void ClickQuotebutton(WebDriver driver)
{
	Quotebutton = driver.findElement(By.id("quote_button"));
	Quotebutton.click();	
	
}



}