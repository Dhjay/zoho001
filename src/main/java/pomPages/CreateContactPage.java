package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	@FindBy(xpath="//select[@name='property(saltName)']")
	private WebElement prfxDrpDn;
	
	@FindBy(name="property(First Name)")
	private WebElement frstNmtxtfld;
	
	@FindBy(xpath="//select[@name='property(Lead Source)']")
	private WebElement ldsrcDrpdn;
	
	@FindBy(xpath="//input[@name='property(Last Name)']")
	private WebElement lstnam;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement savbtn;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrfxDrpDn() {
		return prfxDrpDn;
	}
	
	public void FirstNameTextField(String first_name) {
		frstNmtxtfld.sendKeys(first_name);
	}

	public WebElement getLdsrcDrpdn() {
		return ldsrcDrpdn;
	}
	
	public void lastNameTextField(String last_Name) {
		lstnam.sendKeys(last_Name);
	}
	
	public void saveButton() {
		savbtn.click();
	}

}
