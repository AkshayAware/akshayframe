package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage1 extends TestBase {
	
	//Object Repository
	@FindBy(xpath="//a[@class='navbar-brand']") private WebElement upperMainLogo;
	@FindBy(xpath= "(//div[@class='caption']//h4)[3]") private WebElement lowerMainLogo;
	@FindBy(xpath="//a[text()='Samsung galaxy s7']") private WebElement SamsungGalaxy;
	
	public HomePage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyupperlogo()
	{
		return upperMainLogo.isDisplayed();
	}
	
	public boolean verifylowerlogo() 
	{
		return lowerMainLogo.isDisplayed();
	}
	
	public void verifySamsungGalaxy()
	{
		SamsungGalaxy.click();
	}
	
	
	
	
}
