package project1_test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Cartpage_Amazon;
import project1_source.Homepage_Amazon;
import project1_source.Searchresultpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase10 extends Amazon_LaunchQuit
{
	@Test
	public void updatingcartpage() throws InterruptedException
	{
	Homepage_Amazon h2=new Homepage_Amazon(driver);
	h2.search_text_field();
	Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
	s1.shoe2_search();
	s1.Goto_childid(driver);
	Cartpage_Amazon c1=new Cartpage_Amazon(driver);
	c1.add_to_cart();
	Thread.sleep(1000);
	s1.Return_parentid(driver);
	Thread.sleep(1000);
	s1.shoe5_search();
	Thread.sleep(1000);
	s1.Go_childid_new(driver);
	Thread.sleep(1000);
	c1.add_to_cart1();
	c1.go_to_cart();
	Thread.sleep(1000);
	c1.del_ete();
	Thread.sleep(1000);
    WebElement proceedtobuy= driver.findElement(By.name("proceedToRetailCheckout"));
	Assert.assertEquals(proceedtobuy.isDisplayed(), true, "Incorrect");
	}
}
