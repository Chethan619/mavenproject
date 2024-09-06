package project1_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Loginpage_Amazon;
import project1_source.Profilepage;
import utility_project1.DDT;
@Listeners(utility_project1.Listener.class)
public class TestCase4 extends Amazon_LaunchQuit
{
    @Test
    public void editprofile() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	Homepage_Amazon h2=new Homepage_Amazon(driver);
    	h2.account_and_list(driver);
    	h2.signin();
    	DDT d1=new DDT();
 	    d1.credentials();
    	Loginpage_Amazon l1=new Loginpage_Amazon(driver);
    	l1.un();
    	l1.clickcontinue();
    	l1.pwd();
    	l1.clicksubmit();
    	
    	h2.hover_over(driver);
    	h2.manage_profile();
    	h2.view_button();
    	Thread.sleep(1000);
    	
    	Profilepage p1=new Profilepage(driver);
    	p1.Edit_icon();
    	Thread.sleep(1000);
    	p1.Name_change();
    	Thread.sleep(1000);
    	p1.click_on_continue();
    	Thread.sleep(1000);
    	p1.Pereferred_department();
    	Thread.sleep(1000);
    	p1.Add_option_select();
    	p1.Men_select();
    	Thread.sleep(1000);
    	p1.save_button();
    	Thread.sleep(1000);
    }
}
