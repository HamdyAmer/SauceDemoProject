package sauce_demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//button[normalize-space()='Open Menu']")
	WebElement listItems;
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutLink;
	
	public void testLogout() {
		
		click(listItems);
		click(logoutLink);
		
	}

}
