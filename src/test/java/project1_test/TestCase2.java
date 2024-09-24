package project1_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import project1_source.Homepage_Amazon;
import project1_source.Loginpage_Amazon;
import utility_project1.DDT;
@Listeners(utility_project1.Listener.class)
public class TestCase2 extends Amazon_LaunchQuit
{
    @Test
    public void login() throws EncryptedDocumentException, IOException, InterruptedException
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
    	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login not successful");
    }
}
