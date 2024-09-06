package project1_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressSelectpage_Amazon 
{
	ChromeDriver driver;
	//step 1
	
	   @FindBy(xpath="(//input[@class='a-button-input'])[6]")
	   WebElement addressselect;
	   
	   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	   WebElement creditcard;
	   
	   @FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	   WebElement entercarddetail;
		
	   @FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	   WebElement iframe;
		
	   @FindBy(xpath="//input[@name='addCreditCardNumber']")
	   WebElement creditcardnumber;
	   
	   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	   WebElement netbanking;
	   
	   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	   WebElement otherupiapps;
	   
	   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	   WebElement emi;
	   
	   @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	   WebElement cashondelivery;
	   
	   @FindBy(xpath="(//input[@name='ppw-claimCode'])")
	   WebElement couponcode;
	  
	//step 2
	   public void address_select()
	   {
		   addressselect.click();
	   }
	   
	   public void credit_card()
	   {
		   creditcard.click();
	   }
	   
	   public void enter_card_detail()
		{
			entercarddetail.click();
		}
	   
	   public void i_frame(ChromeDriver driver)
		{
			driver.switchTo().frame(iframe);	
		}
	   
	   public void credit_card_number()
		{
		   creditcardnumber.sendKeys("44657848884" + Keys.ENTER);	
		}
	   
	   public void net_banking()
	   {
		   netbanking.click();
	   }
	   
	   public void other_upi_apps()
	   {
		   otherupiapps.click();
	   }
	   
	   public void e_m_i()
	   {
		   emi.click();
	   }
	   
	   public void cash_on_delivery()
	   {
		   cashondelivery.click();
	   }
	   
	   public void coupon_code()
	   {
		   couponcode.sendKeys("dfkgrkl" + Keys.ENTER);
	   }
	   
	//step 3
	   public AddressSelectpage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
