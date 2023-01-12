package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement ldlink;
	
	public LeadDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LeadsModuleLink() {
		ldlink.click();
	}
}
