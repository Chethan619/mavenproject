package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Homepage_Amazon_Aug22;
import amazon_source.Registrationpage_Amazon_Aug22;

public class TestCase3_Aug22 extends LaunchQuit_Aug22
{
    @Test
    public void registration_amazon() throws InterruptedException
    {
    	Homepage_Amazon_Aug22 h1=new Homepage_Amazon_Aug22(driver);
    	h1.reg();
    	Registrationpage_Amazon_Aug22 r1=new Registrationpage_Amazon_Aug22(driver);
    	r1.user_name();
    	r1.clickcontinue();
    	r1.clickproceed();
    	r1.mobile_no();
    	r1.your_name();
    	r1.pass_word();
    	r1.verify_mobile_no();
    }
}
