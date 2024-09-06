package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_Amazon_Aug22 
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
		   username.sendKeys("chethanr36@gmail.com");
	   }
	   
	   public void clickcontinue()
	   {
		   continuebutton.click();
	   }
	   
	   public void pwd()
	   {
		   password.sendKeys("Kushalreddy@01");
	   }
	   
	   public void clicksubmit()
	   {
		   signin_button.click();
	   }
	   
	   //step 3
	   public Loginpage_Amazon_Aug22(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
