package project1_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.AddressSelectpage_Amazon;
import project1_source.Cartpage_Amazon;
import project1_source.Homepage_Amazon;
import project1_source.Loginpage_Amazon;
import project1_source.Productdetailspage_Amazon;
import project1_source.Searchresultpage_Amazon;
import utility_project1.DDT;
@Listeners(utility_project1.Listener.class)
public class TestCase13 extends Amazon_LaunchQuit
{
	@Test
	public void applycouponcode() throws InterruptedException, EncryptedDocumentException, IOException
	{
	Homepage_Amazon h1=new Homepage_Amazon(driver);
	h1.account_and_list(driver);
    h1.signin();
    DDT d1=new DDT();
	d1.credentials();
	Loginpage_Amazon l1=new Loginpage_Amazon(driver);
	l1.un();
	l1.clickcontinue();
	l1.pwd();
	l1.clicksubmit();
	Homepage_Amazon h2=new Homepage_Amazon(driver);
	h2.search_text_field();
	Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
	s1.shoe2_search();
	s1.Goto_childid(driver);
	Productdetailspage_Amazon p1=new Productdetailspage_Amazon(driver);
	Cartpage_Amazon c1=new Cartpage_Amazon(driver);
	c1.add_to_cart();
	Thread.sleep(1000);
	c1.go_to_cart();
	Thread.sleep(1000);
	c1.proceed_to_buy();
	Thread.sleep(1000);
	AddressSelectpage_Amazon a1=new AddressSelectpage_Amazon(driver);
	a1.address_select();
	Thread.sleep(1000);
	a1.coupon_code();
	Thread.sleep(1000);
	}
}
