package project1_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage 
{
	//step1
	@FindBy(xpath="//span[@class='a-declarative']")
	WebElement Editicon;
	
	@FindBy(id="editProfileNameInputId")
	WebElement Namechange;
	
	@FindBy(className="a-button-input")
	WebElement clickoncontinue;
	
	@FindBy(xpath="//div[.='Preferred department']")
	WebElement Pereferreddepartment;
	
	@FindBy(xpath="//button[@class='attribute-action']")
	WebElement Addoptionselect;
	
	@FindBy(xpath="//button[.='Men']")
	WebElement Menselect;
	
	//@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement Savebutton;
	
	//step2
	public void Edit_icon()
	{
		Editicon.click();
	}

	public void Name_change()
	{
		Namechange.sendKeys(Keys.CONTROL +"A");
		Namechange.sendKeys("reddy");
	}
	
	public void click_on_continue()
	{
		clickoncontinue.click();
	}
	
	public void Pereferred_department()
	{
		Pereferreddepartment.click();
	}
	
	public void Add_option_select()
	{
		Addoptionselect.click();
	}
	public void Men_select()
	{
		Menselect.click();
	}
	
	public void save_button()
	{
		Savebutton.click();
	}
	
	//step3
	public Profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
