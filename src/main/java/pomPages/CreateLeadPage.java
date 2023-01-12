package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	
	@FindBy(name="property(saltName)")
	private WebElement preFixDrpDwn;
	
	@FindBy(name="property(First Name)")
	private WebElement frstname;
	
	@FindBy(name="property(Last Name)")
	private WebElement lstNmeTxtFld;
	
	@FindBy(name="property(Company)")
	private WebElement cmpnynametxtfld;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campgnsrclookupicn;
	
	@FindBy(xpath="//a[text()='hp mouse']")
	private WebElement hpMoslnk;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement savbtn;
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPreFixDrpDwn() {
		return preFixDrpDwn;
	}
	
	public void firstNameTextField(String firstName) {
		frstname.sendKeys(firstName);
	}
	
	public void lastNameTextField(String lastName) {
		lstNmeTxtFld.sendKeys(lastName);
	}
	
	public void companyNameTextField(String companyName) {
		cmpnynametxtfld.sendKeys(companyName);
	}
	
	public void campaignLookUp() {
		campgnsrclookupicn.click();
	}
	
	public void hpMouseLink() {
		hpMoslnk.click();
	}
	
	public void saveButton() {
		savbtn.click();
	}

}
