package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ProductDescriptionPage2 extends TestBase {
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']") private WebElement addSamsungGalaxy;
	
	public ProductDescriptionPage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addSamsungToCart()
	{
		addSamsungGalaxy.click();
	}
	
	

}
