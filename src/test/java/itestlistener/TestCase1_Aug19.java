package itestlistener;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(itestlistener.ProgramOne_Aug19.class)
public class TestCase1_Aug19 extends ProgramOne_Aug19
{
	 @Test
	    public void Amazon_Launch() throws InterruptedException, IOException
	    {
	    	
	    	driver=new ChromeDriver();
	    	driver.get("https://www.amazon.in");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);
	    	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    	search.sendKeys("Shoes");
	    	search.sendKeys(Keys.ENTER);
	    }
}
