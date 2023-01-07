package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage3;
import Page.HomePage1;
import Page.PlaceOrderPage4;
import Page.PopUpPage5;
import Page.ProductDescriptionPage2;

public class PopUpPage5Test extends TestBase{
	
	HomePage1 login;
	ProductDescriptionPage2 descrip;
	CartPage3 cart;
	PlaceOrderPage4 order;
	PopUpPage5 enterData;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initialization();
		login = new HomePage1();
		descrip = new ProductDescriptionPage2();
		cart = new CartPage3();
		order = new PlaceOrderPage4();
		enterData = new PopUpPage5();
	}
	
	/*@Test
	public void TestClickCart() throws Exception
	{
		login.verifySamsungGalaxy();
		descrip.addSamsungToCart();
		cart.CartButton();
		order.VerifyPlaceOrder();
	} */
	
	@Test
	public void TestPopUp() throws Exception 
	{
		login.verifySamsungGalaxy();
		descrip.addSamsungToCart();
		cart.CartButton();
		order.VerifyPlaceOrder();
		enterData.ClickToPlaceOrder();
		enterData.TypeName();
//		enterData.TypeCountry();
//		enterData.TypeCity();
//		enterData.TypeCard();
//		enterData.TypeMonth();
//		enterData.TypeYear();
//		enterData.ClicktoPurchaseButton();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


}
