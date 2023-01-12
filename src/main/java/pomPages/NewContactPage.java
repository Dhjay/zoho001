package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactPage {
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement cntLink;
	
	@FindBy(xpath="//input[@value='New Contact']")
	private WebElement nwcntbtn;
	
	public NewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void contactsModuleLink() {
		cntLink.click();
	}
	
	public void newContactButton() {
		nwcntbtn.click();
	}
	

}
