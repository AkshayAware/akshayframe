package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class PopUpPage5 extends TestBase{
@FindBy(xpath = "//button[text()='Place Order']") private WebElement PlaceOrderButton;
@FindBy(xpath = "//div[@class='modal-content']//div[@class='form-group']//input[@id='name']") private WebElement Name;
@FindBy(xpath = "//input[@id='country']") private WebElement Country;
@FindBy(xpath = "//input[@id='city']") private WebElement City;
@FindBy(xpath = "//input[@id='card']") private WebElement Card;
@FindBy(xpath = "//input[@id='month']") private WebElement Month;
@FindBy(xpath = "//input[@id='year']") private WebElement Year;
@FindBy(xpath = "//button[text()='Purchase']") private WebElement PurchaseButton;
	
	public PopUpPage5()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickToPlaceOrder() throws Exception
	{
		PlaceOrderButton.click();
		Thread.sleep(2000);
	}
	
	public void TypeName() throws Exception
	{
		Name.sendKeys("akshay");
		Thread.sleep(2000);
//		Name.sendKeys(ReadData.readExcelFile(0, 0));
	}
	
	public void TypeCountry() throws Exception
	{
		Country.sendKeys("India");
		Thread.sleep(2000);
//		Country.sendKeys(ReadData.readExcelFile(0, 1));
	}
	
	public void TypeCity() throws Exception
	{
		City.sendKeys("Nagpur");
		Thread.sleep(2000);
//		City.sendKeys(ReadData.readExcelFile(0, 2));
	}
	
	public void TypeCard() throws Exception
	{
		Card.sendKeys("123456");
		Thread.sleep(2000);
//		Card.sendKeys(ReadData.readExcelFile(0, 3));
	}
	
	public void TypeMonth() throws Exception
	{
		Month.sendKeys("November");
		Thread.sleep(2000);
//		Month.sendKeys(ReadData.readExcelFile(0, 4));
	}
	
	public void TypeYear() throws Exception
	{
		Year.sendKeys("2022");
		Thread.sleep(2000);
//		Year.sendKeys(ReadData.readExcelFile(0, 5));
	}
	
	public void ClicktoPurchaseButton() throws Exception
	{
		PurchaseButton.click();
		Thread.sleep(2000);
	}
	

}
