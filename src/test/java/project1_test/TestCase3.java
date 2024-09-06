package project1_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Loginpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase3 extends Amazon_LaunchQuit
{
   @Test//(retryAnalyzer=utility_project1.Retry.class)
   public void login_incorrect() throws EncryptedDocumentException, IOException
   {
	   Homepage_Amazon h1=new Homepage_Amazon(driver);
	    h1.account_and_list(driver);
	    h1.signin();
	    Loginpage_Amazon l1=new Loginpage_Amazon(driver);
	   l1.incorrectun();
	   l1.clickcontinue();
	   l1.incorrectpwd();
	   l1.clicksubmit();
   }
}
