package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	@FindBy(name="property(Campaign Name)")
	private WebElement cmpnNameTxtFld;
	
	@FindBy(name="property(Start Date)")
	private WebElement strtDtTxtFld;
	
	@FindBy(name="property(Expected Revenue)")
	private WebElement expRevTxtFld;
	
	@FindBy(name="property(Actual Cost)")
	private WebElement actCostTxtFld;
	
	@FindBy(name="property(Budgeted Cost)")
	private WebElement bdgtdCstTxtFld;
	
	@FindBy(name="property(Type)")
	private WebElement typDrpDwn;
	
	@FindBy(name="property(Status)")
	private WebElement statsDrpDwn;
	
	@FindBy(xpath="(//input[@Class='button'])[5]")
	private WebElement savebtn;
	
	@FindBy(name="property(Last Name)")
	private WebElement lastnametxtfld;
	
	@FindBy(name="property(Campaign Source)")
	private WebElement cmpnNameLookupIcn;
	
	@FindBy(xpath="//a[text()='hp mouse']")
	private WebElement hpmselnk;
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void campaignNameText(String campaign_Name) {
		cmpnNameTxtFld.sendKeys(campaign_Name);
	}
	
	public void campaignStartDate(String campaignStart_date) {
		strtDtTxtFld.sendKeys(campaignStart_date);
	}
	
	public void expectedRevenueTextField(String expected_Revenue) {
		expRevTxtFld.sendKeys(expected_Revenue);
	}
	
	public void actualCostTextField(String actual_cost) {
		actCostTxtFld.sendKeys(actual_cost);
	}
	
	public void budgetedCostTextField(String bugeted_cost) {
		bdgtdCstTxtFld.sendKeys(bugeted_cost);
	}

	public WebElement getTypDrpDwn() {
		return typDrpDwn;
	}

	public WebElement getStatsDrpDwn() {
		return statsDrpDwn;
	}
	
	public void saveButton() {
		savebtn.click();
	}
	
	public void lastNameTextField(String last_Name) {
		lastnametxtfld.sendKeys("last_Name");
	}
	
	public void campaignNmaeLookupIcon() {
		cmpnNameLookupIcn.click();
	}
	
	public void hpMouseLink() {
		hpmselnk.click();
	}
	

}
