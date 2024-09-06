package amazon_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdescriptionpage_Amazon_Aug22 
{
	ChromeDriver driver;
	//step 1
	   @FindBy(id="wishListMainButton")
	   WebElement addtowishlist;
	   
	//step 2
	   public void add_to_wishlist()
	   {
		   addtowishlist.click();
	   }
	   
	//step 3
	   public Productdescriptionpage_Amazon_Aug22(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
