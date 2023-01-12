package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	
	@FindBy(xpath="(//a[text()='hp mouse'])[2]")
	private WebElement hpMse; 
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement ldsBtn;
	
	
	public CampaignDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void hpMouse() {
		hpMse.click();
	}
	
	public void leadsLink() {
		ldsBtn.click();
	}
}


