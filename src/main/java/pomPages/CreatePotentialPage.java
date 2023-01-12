package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePotentialPage {
	
	@FindBy(xpath="//input[@name='property(Potential Name)']")
	private WebElement ptnlnm;
	
	@FindBy(xpath = "//img[@title='Calendar']")
	private WebElement clndricn;
	
	@FindBy(xpath = "//a[text()='31']")
	private WebElement sltdt;
	
	@FindBy(name="property(Stage)")
	private WebElement stgdrpdn;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement acntlkup;
	
	@FindBy(xpath = "//a[text()='Next']")
	private WebElement nxtlnk;
	
	@FindBy(xpath="//a[text()='Sam_Antony']")
	private WebElement samantny;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement cmnsrclkup;
	
	@FindBy(xpath = "//a[text()='hp mouse']")
	private WebElement hpms;
	
	@FindBy(xpath = "(//input[@value='Save'])[2]")
	private WebElement svbtn;
	
	public CreatePotentialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void potentialNameTextField(String Potential_Name) {
		ptnlnm.sendKeys(Potential_Name);
	}
	
	public void calendarIcon() {
		clndricn.click();
	}
	
	public void selectDate() {
		sltdt.click();
	}
	
	public WebElement getStgdrpdn() {
		return stgdrpdn;
	}

	public void accountNameLookupIcon() {
		acntlkup.click();
	}
	
	public void nextLink() {
		nxtlnk.click();
	}
	
	public void SamAntony() {
		samantny.click();
	}
	
	public void campaignSourceLookupIcon() {
		cmnsrclkup.click();
	}
	
	public void hpMouse() {
		hpms.click();
	}
	
	public void saveButton() {
		svbtn.click();
	}

}
