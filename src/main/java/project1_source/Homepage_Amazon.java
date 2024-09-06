package project1_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Amazon 
{
	ChromeDriver driver;
	   //step 1
	
	   @FindBy(xpath="//span[@class='nav-line-2 ']")
	   WebElement Hoverover;
	
	   @FindBy(xpath="//button[.='Manage Profiles']")
	   WebElement Manageprofile;
	
	   @FindBy(linkText="View")
	   WebElement viewbutton;
	
	   @FindBy(id="nav-link-accountList")
	   WebElement accountandlist;
	   
	   @FindBy(linkText="Start here.")
	   WebElement starthere;
	   
	   @FindBy(xpath="//span[.='Sign in']")
	   WebElement signinbutton;
	   
	   @FindBy(id="twotabsearchtextbox")
	   WebElement searchtextfield;
	   
	   //step 2
	   
	   public void hover_over(WebDriver driver)
		{
			Actions h1=new Actions(driver);
			h1.moveToElement(Hoverover).perform();
		}
		
		public void manage_profile()
		{
			Manageprofile.click();
		}
		
		public void view_button()
		{
			
			viewbutton.click();
			
		}
		
	   public void account_and_list(ChromeDriver driver)
	   {
		   Actions a1=new Actions(driver);
		   a1.moveToElement(accountandlist).perform();
	   }
	   
	   public void start_here()
	   {
		   starthere.click();
	   }
	   
	   public void signin()
	   {
		   signinbutton.click();
	   }
	   
	   public void search_text_field()
	   {
		   searchtextfield.sendKeys("shoes" + Keys.ENTER);
	   }
	   
	   //step 3
	   public Homepage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
