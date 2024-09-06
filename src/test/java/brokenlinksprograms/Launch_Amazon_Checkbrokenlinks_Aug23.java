package brokenlinksprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Amazon_Checkbrokenlinks_Aug23 
{
	@Test
	public void amazon_launch() throws InterruptedException, IOException
    {
    	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement w1=links.get(i);
		String url=w1.getAttribute("href");
		System.out.println(url);
		verify_each_link(url);
		}
    }
    static void verify_each_link(String url) throws IOException
    {
    	try{
    		URL u1=new URL(url);
    	HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
    	if(h1.getResponseCode()==200)
    	{
    		System.out.println("It is a valid link" + "  Response message is -> " +h1.getResponseMessage() + "  Response status code is -> " +h1.getResponseCode());
    	}
    	else
    	{
    		System.out.println("It is not a valid link" + "  Response message is -> " + h1.getResponseMessage() + "  Response status code is -> " +h1.getResponseCode());

    	}
    } catch(MalformedURLException m1)
    {
    	System.out.println("There was a exception we handled it");
    }
}
}