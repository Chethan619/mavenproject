package amazon_test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import amazon_source.Homepage_Amazon_Aug22;
import amazon_source.Productdescriptionpage_Amazon_Aug22;
import amazon_source.Searchresultpage_Amazon_Aug22;

public class TestCase4_Aug22 extends LaunchQuit_Aug22
{
    @Test
    public void search_addtowishlist_amazon() throws InterruptedException
    {
        	Homepage_Amazon_Aug22 h1=new Homepage_Amazon_Aug22(driver);
        	h1.search();
        	Searchresultpage_Amazon_Aug22 s1=new Searchresultpage_Amazon_Aug22(driver);
        	s1.shoe_search();
        	Set<String> ids=driver.getWindowHandles(); 
        	Iterator<String> id=ids.iterator();
        	String parentid=id.next();
        	String childid=id.next();
        	//driver.close();
        	driver.switchTo().window(childid);
        	Thread.sleep(500);
        	Productdescriptionpage_Amazon_Aug22 p1=new Productdescriptionpage_Amazon_Aug22(driver);
        	p1.add_to_wishlist();
    }
}
