package amazon_test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit_Aug22 
{
	ChromeDriver driver;
    @BeforeMethod
    public void precondition()
    {
    	driver=new ChromeDriver();
    	driver.get("https://www.amazon.in");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @AfterMethod
    public void postcondition() throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.quit();
    }
}
  