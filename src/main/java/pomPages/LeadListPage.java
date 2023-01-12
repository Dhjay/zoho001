package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadListPage {
	
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newLeadbtn;
	
	public LeadListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void leadLinkButton() {
		newLeadbtn.click();
	}

}
