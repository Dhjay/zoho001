package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	@FindBy(name="property(Account Name)")
	private WebElement acntnme;
	
	@FindBy(xpath="//select[@name='property(Rating)']")
	private WebElement rtngdrpdn;
	
	@FindBy(name="property(Account Site)")
	private WebElement acntnmtxtfld;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement svbtn;
	
	@FindBy(xpath="//a[text()='Potentials']")
	private WebElement ptnllnk;
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void accountNameTextField(String Account_Name) {
		acntnme.sendKeys(Account_Name);
	}

	public WebElement getRtngdrpdn() {
		return rtngdrpdn;
	}
	
	public void accountSiteTextField(String Account_Site) {
		acntnmtxtfld.sendKeys(Account_Site);
	}
	
	public void saveButton() {
		svbtn.click();
	}
	
	public void potentialModuleLInk() {
		ptnllnk.click();
	}
	

}
