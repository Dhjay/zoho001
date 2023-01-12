package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage {
	@FindBy(xpath="//a[text()='Accounts']")
	private WebElement acntmdllnk;
	
	public ContactDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AccountModuleLink() {
		acntmdllnk.click();
	}

}
