package project1_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchresultpage_Amazon 
{
	ChromeDriver driver;
	//step 1
	   @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
	   WebElement sortbybrand;
	   
	   @FindBy(xpath="//span[.='Category']")
	   WebElement category;
	   
	   @FindBy(id="n/1983550031")
	   WebElement mensrunningshoes;
	   
	   @FindBy(xpath="(//input[@class='s-range-input'])[2]")
	   WebElement pricerangeslider;
	   
	   @FindBy(xpath="//input[@aria-label='Go - Submit price range']")
	   WebElement pricerangesubmit;
	   
	   @FindBy(id="s-result-sort-select")
	   WebElement sortbyprice;
	   
	   @FindBy (xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
	   WebElement sortbyrating;
	   
	   @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	   WebElement shoe2search;
	   
	   @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]")
	   WebElement shoe5search;
	   
	//step 2
	   public void sort_by_brand() throws InterruptedException
	   {
		   sortbybrand.click();
		   sortbybrand.isSelected();
		   Thread.sleep(1000);
	   }
	   
	   public void cate_gory() throws InterruptedException
	   {
		   category.click(); 
		   Thread.sleep(1000);
	   }
	   
	   public void mens_running_shoes() throws InterruptedException
	   {
		   mensrunningshoes.click();
		   Thread.sleep(1000);
	   }
	   
	   public void price_range_slider() throws InterruptedException
	   {
		   for (int i=0;i<10;i++)
			{
			   pricerangeslider.sendKeys(Keys.ARROW_LEFT);
			   Thread.sleep(1000);
			}
	   }
	   
	   public void price_range_submit() throws InterruptedException
	   {
		   pricerangesubmit.click();
		   Thread.sleep(1000);
	   }
	   
	   public void sort_by_price() throws InterruptedException
	   {
		   Select s1=new Select(sortbyprice);
		   s1.selectByVisibleText("Price: Low to High");
		   Thread.sleep(1000);
	   }
	   
	   public void sort_by_rating()
	   {
	   	sortbyrating.click();
	   }
	   
	   public void shoe2_search()
	   {
		   shoe2search.click();
	   }
	   
	   public void shoe5_search()
	   {
		   shoe5search.click();
	   }
	   
	   public void Goto_childid(ChromeDriver driver)
	   {
	   	String parentid1=driver.getWindowHandle();
	   	Set<String> parentandchildid= driver.getWindowHandles();
	   	Iterator<String> pc= parentandchildid.iterator();
	   	String parentid= pc.next();
	   	String childid= pc.next();
	   	driver.switchTo().window(childid); 		
	   }
	   
	   public void Go_childid_new(ChromeDriver driver)
	   {
	   	String parentid1=driver.getWindowHandle();
	   	Set<String> parentandchildid= driver.getWindowHandles();
	   	System.out.println(parentandchildid);
	   	Iterator<String> pc= parentandchildid.iterator();
	   	String parentid= pc.next();
	   	String childid= pc.next();
	   	String childid1= pc.next();
	   	System.out.println(parentid);
	   	System.out.println(childid);
	   	driver.switchTo().window(childid1);		
	   }
	   
	   public void Return_parentid(ChromeDriver driver)
	   {
	   	
	   	Set<String> parentandchildid= driver.getWindowHandles();
	   	Iterator<String> pc= parentandchildid.iterator();
	   	String parentid= pc.next();
	   	String childid= pc.next();
	   	driver.switchTo().window(parentid);
	   }
	   
	//step 3
	   public Searchresultpage_Amazon(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
