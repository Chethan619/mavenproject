package project1_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_project1.DDT;

public class Loginpage_Amazon extends DDT
{
	ChromeDriver driver;
	   //step 1
	   @FindBy(name="email")
	   WebElement username;
	   
	   @FindBy(id="continue")
	   WebElement continuebutton;
	   
	   @FindBy(id="ap_password")
	   WebElement password;
	   
	   @FindBy(id="signInSubmit")
	   WebElement signin_button;
	   
	   //step 2
	   public void un()
	   {
		   username.sendKeys(email);
	   }
	   
	   public void incorrectun()
	   {
		   username.sendKeys("abc@gmail.com");
	   }
	   
	   public void clickcontinue()
	   {
		   continuebutton.click();
	   }
	   
	   public void pwd()
	   {
		   password.sendKeys(pass);
	   }
	   
	   public void incorrectpwd()
	   {
		   password.sendKeys("abc@123");
	   }
	   
	   public void clicksubmit()
	   {
		   signin_button.click();
	   }
	   
	   //step 3
	   public Loginpage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
