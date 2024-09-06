package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Homepage_Amazon_Aug22;
import amazon_source.Loginpage_Amazon_Aug22;

public class TestCase2_Aug22 extends LaunchQuit_Aug22
{
    @Test
    public void searchingtheproduct_amazon()
    {
    	Homepage_Amazon_Aug22 h1=new Homepage_Amazon_Aug22(driver);
    	h1.search();
    }
}
