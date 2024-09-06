package project1_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Searchresultpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase8 extends Amazon_LaunchQuit
{
	@Test
	public void productsortpage() throws InterruptedException
	{
	Homepage_Amazon h2=new Homepage_Amazon(driver);
	h2.search_text_field();
	Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
	s1.sort_by_brand();
	Thread.sleep(1000);
	s1.sort_by_price();
	Thread.sleep(1000);
	s1.sort_by_rating();
	Thread.sleep(1000);
	}
}
