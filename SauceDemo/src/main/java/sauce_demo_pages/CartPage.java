package sauce_demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage  {

	public CartPage(WebDriver driver) {
		super(driver);
		
	}

	 @FindBy(partialLinkText = "CHECKO")
	    private WebElement checkoutButton;
	 

	    public void proceedToCheckout() {
	        checkoutButton.click();
	    }
}
