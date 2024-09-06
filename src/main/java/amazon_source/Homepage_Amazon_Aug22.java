package amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Amazon_Aug22 
{
   ChromeDriver driver;
   //step 1
   @FindBy(id="nav-link-accountList")
   WebElement accountandlist;
   
   @FindBy(xpath="//span[.='Sign in']")
   WebElement signinbutton;
   
   @FindBy(id="twotabsearchtextbox")
   WebElement searchtextfield;
   
   @FindBy(linkText="Start here.")
   WebElement starthere;
   
   //step 2
   public void accountlist(ChromeDriver driver)
   {
	   Actions a1=new Actions(driver);
	   a1.moveToElement(accountandlist).perform();
   }
   
   public void signin()
   {
	   signinbutton.click();
   }
   
   public void search()
   {
	   searchtextfield.sendKeys("shoes" + Keys.ENTER);
   }
   
   public void reg()
   {
	   starthere.click();
   }
   //step 3
   public Homepage_Amazon_Aug22(ChromeDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
