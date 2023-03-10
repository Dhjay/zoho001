package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignListPage {
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcmpnbtn;
	
	
	
	public CampaignListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newCampaignButton() {
		newcmpnbtn.click();
	}
	
	

}
