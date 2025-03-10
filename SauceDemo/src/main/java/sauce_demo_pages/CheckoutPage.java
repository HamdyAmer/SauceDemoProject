package sauce_demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {


	
	   public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "first-name")
	    private WebElement firstNameField;

	    @FindBy(id = "last-name")
	    private WebElement lastNameField;

	    @FindBy(id = "postal-code")
	    private WebElement postalCodeField;

	    @FindBy(partialLinkText  = "CANCEL")
	    private WebElement cancelButton;

	    public void fillCheckoutForm(String firstName, String lastName, String postalCode) {
	        firstNameField.sendKeys(firstName);
	        lastNameField.sendKeys(lastName);
	        postalCodeField.sendKeys(postalCode);
	    }

	    public void cancelCheckout() {
	        cancelButton.click();
	    }

}
