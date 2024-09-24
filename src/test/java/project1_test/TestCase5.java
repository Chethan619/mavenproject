package project1_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase5 extends Amazon_LaunchQuit
{
	@Test
	 public void searchproduct()
	 {
		Homepage_Amazon h2=new Homepage_Amazon(driver);
		h2.search_text_field();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login not successful");
	 }
}
