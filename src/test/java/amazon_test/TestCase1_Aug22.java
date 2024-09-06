package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Homepage_Amazon_Aug22;
import amazon_source.Loginpage_Amazon_Aug22;

public class TestCase1_Aug22 extends LaunchQuit_Aug22
{
	@Test
	public void login_to_amazon()
	{
	Homepage_Amazon_Aug22 h1=new Homepage_Amazon_Aug22(driver);
	h1.accountlist(driver);
	h1.signin();
	
	Loginpage_Amazon_Aug22 l1=new Loginpage_Amazon_Aug22(driver);
	l1.un();
	l1.clickcontinue();
	l1.pwd();
	l1.clicksubmit();
	}
}
