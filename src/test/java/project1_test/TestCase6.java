package project1_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_source.Homepage_Amazon;
import project1_source.Searchresultpage_Amazon;
@Listeners(utility_project1.Listener.class)
public class TestCase6 extends Amazon_LaunchQuit
{
    @Test
    public void searchwithfilters() throws InterruptedException
    {
    	Homepage_Amazon h2=new Homepage_Amazon(driver);
		h2.search_text_field();
		Searchresultpage_Amazon s1=new Searchresultpage_Amazon(driver);
		s1.cate_gory();
		s1.mens_running_shoes();
		s1.sort_by_brand();
		s1.price_range_slider();
		s1.price_range_submit();
		String s2=driver.getCurrentUrl();
		Assert.assertEquals(s2.contains("shoes"), true, "Incorrect");
    }
}
