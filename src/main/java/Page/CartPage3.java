package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage3 extends TestBase{
	@FindBy(xpath = "//a[text()='Cart']\r\n") private WebElement addToCartButton;
	
	public CartPage3()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CartButton()
	{
		addToCartButton.click();
	}
	

}
