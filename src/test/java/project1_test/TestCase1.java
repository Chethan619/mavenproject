package project1_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Registrationpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase1 extends Amazon_LaunchQuit
{
   @Test(retryAnalyzer=utility_project1.Retry.class)
   public void registration() throws InterruptedException
   {
	   Homepage_Amazon h1=new Homepage_Amazon(driver);
	   h1.account_and_list(driver);
	   h1.start_here();
	   Registrationpage_Amazon r1=new Registrationpage_Amazon(driver);
	   //r1.user_name();
	   //r1.clickcontinue();
	   //r1.clickproceed();
	   //r1.mobile_no();
	   r1.your_name();
	   Thread.sleep(1000);
	   r1.mobile_no();
	   Thread.sleep(1000);
	   r1.pass_word();
	   Thread.sleep(1000);
	   r1.verify_mobile_no();
   }
}
