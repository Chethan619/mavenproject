package project1_test;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Cartpage_Amazon;
import project1_source.Homepage_Amazon;
import project1_source.Searchresultpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase9 extends Amazon_LaunchQuit
{
	@Test
	public void cartpage() throws InterruptedException
	{
	Homepage_Amazon h2=new Homepage_Amazon(driver);
	h2.search_text_field();
	Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
	s1.shoe2_search();
	s1.Goto_childid(driver);
	Cartpage_Amazon c1=new Cartpage_Amazon(driver);
	c1.add_to_cart();
	c1.go_to_cart();
	String s2 = driver.getTitle();
	Assert.assertEquals(s2.contains("Cart"), true, "Incorrect");
	}
}
