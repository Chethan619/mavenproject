package amazon_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultpage_Amazon_Aug22 
{
	ChromeDriver driver;
	//step 1
	   @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	   WebElement shoesearch;
	   
	//step 2
	   public void shoe_search()
	   {
		   shoesearch.click();
	   }
	   
	//step 3
	   public Searchresultpage_Amazon_Aug22(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
