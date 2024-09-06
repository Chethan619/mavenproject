package project1_test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Productdetailspage_Amazon;
import project1_source.Searchresultpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase7 extends Amazon_LaunchQuit
{
	@Test
	public void productdetailspage() throws InterruptedException
	{
	Homepage_Amazon h2=new Homepage_Amazon(driver);
	h2.search_text_field();
	Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
	s1.shoe2_search();
	s1.Goto_childid(driver);
	Productdetailspage_Amazon p1=new Productdetailspage_Amazon(driver);
	p1.product_price();
	Thread.sleep(2000);
	p1.product_description_page(driver);
	Thread.sleep(2000);
	p1.product_review(driver);
	Thread.sleep(2000);
	}
}
