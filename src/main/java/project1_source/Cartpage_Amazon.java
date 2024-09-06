package project1_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage_Amazon 
{
	ChromeDriver driver;
	//step 1
	
	   @FindBy(xpath="//input[@id='add-to-cart-button']")
	   WebElement addtocart;
	   
	   @FindBy(xpath="//input[@id='add-to-cart-button']")
	   WebElement addtocart1;
	   
	   @FindBy(xpath="//a[@data-csa-c-content-id='sw-gtc_CONTENT']")
	   WebElement gotocart;
	   
	   @FindBy(xpath="(//input[@value='Delete'])[1]")
	   WebElement delete;
	   
	   @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	   WebElement proceedtobuy;
	   
	//step 2
	   public void add_to_cart()
	   {
		   addtocart.click();
	   }
	   
	   public void add_to_cart1()
	   {
		   addtocart1.click();
	   }
	   
	   
	   public void go_to_cart()
	   {
		   gotocart.click();
	   }
	   
	   public void del_ete()
	   {
		   delete.click();
	   }
	   
	   public void proceed_to_buy()
	   {
		   proceedtobuy.click();
	   }
	   
	//step 3
	   public Cartpage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
