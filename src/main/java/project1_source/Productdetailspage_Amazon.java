package project1_source;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetailspage_Amazon 
{
	ChromeDriver driver;
	//step 1
	
	   @FindBy(xpath="//h3[.=' About this item ']")
	   WebElement productdescriptionpage;
	   
	   @FindBy(xpath="(//input[@class='a-button-input'])[19]")
	   WebElement productreview;
	   
	   @FindBy(xpath="//span[@class='a-price-whole']")
	   WebElement productprice;
	   
	//step 2
	   
	   public void product_description_page(ChromeDriver driver)
	   {
		   Actions a1=new Actions(driver);
			a1.moveToElement(productdescriptionpage).perform();
	   }

	   public void product_review(ChromeDriver driver)
	   {
		    //Point p1=productreview.getLocation();
      		//int x=p1.getX();
			//int y=p1.getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i=0;i<=120;i++)
			{
			js.executeScript("window.scrollBy(0,30)");
			}
	   }
	   
	   public void product_price()
	   {
		   String p1=productprice.getText();
		  System.out.println("The price is -> "+p1);
	   }
	   
	//step 3
	   public Productdetailspage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
