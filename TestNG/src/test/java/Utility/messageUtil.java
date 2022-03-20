 package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class messageUtil {
	WebDriver driver;
	private String message;

	// Constructor
	// @param message to be printed
	public messageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

	// add "tutorialspoint" to the message
	public String salutationMessage() {
		message = "tutorialspoint" + message;
		System.out.println(message);
		return message;
	}

	// add "www." to the message
	public String exitMessage() {
		message = "www." + message;
		System.out.println(message);
		return message;
	}
	
	public void AlertAccept() 
	{ 
		//WebDriverWait wait = new WebDriverWait(driver, 300);
		 try{   
			   driver.switchTo().alert().accept();  
			  }catch(Exception e){ 
			   System.out.println("unexpected alert not present");   
	 }
		 

	}

}
