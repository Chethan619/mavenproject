package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage_Amazon_Aug22 
{
	ChromeDriver driver;
	   //step 1
	   @FindBy(name="email")
	   WebElement username;
	   
	   @FindBy(id="continue")
	   WebElement continuebutton;
	   
	   @FindBy(id="intention-submit-button")
	   WebElement proceedbutton;
	   
	   @FindBy(id="ap_phone_number")
	   WebElement mobilenumber;
	   
	   @FindBy(id="ap_customer_name")
	   WebElement yourname;
	   
	   @FindBy(id="ap_password")
	   WebElement password;
	   
	   @FindBy(id="continue")
	   WebElement verifymobilenumber;
	   
	   //step 2
	   public void user_name()
	   {
		   username.sendKeys("8374683319");
	   }
	   
	   public void clickcontinue()
	   {
		   continuebutton.click();
	   }
	   
	   public void clickproceed() throws InterruptedException
	   {
		   proceedbutton.click();
		   Thread.sleep(500);
	   }
	   
	   public void mobile_no() throws InterruptedException
	   {
		   mobilenumber.click();;
		   Thread.sleep(500);
	   }
	   
	   public void your_name() throws InterruptedException
	   {
		   yourname.sendKeys("nr reddy");
		   Thread.sleep(500);
	   }
	   
	   public void pass_word() throws InterruptedException
	   {
		   password.sendKeys("Zxcvb^789");
		   Thread.sleep(500);
	   }
	   
	   public void verify_mobile_no() throws InterruptedException
	   {
		   verifymobilenumber.click();
		   Thread.sleep(500);
	   }
	   //step 3
	   public Registrationpage_Amazon_Aug22(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
