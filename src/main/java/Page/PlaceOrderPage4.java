package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class PlaceOrderPage4 extends TestBase {
	@FindBy(xpath = "//button[text()='Place Order']") private WebElement PlaceOrderButton;
	
	public PlaceOrderPage4()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyPlaceOrder() throws Exception
	{
		PlaceOrderButton.click();
		Thread.sleep(5000);
	}

}
