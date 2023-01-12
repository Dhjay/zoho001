package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLeadPage {
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement nwldbtn;
	
	public NewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newLeadButton() {
		nwldbtn.click();
	}

}
