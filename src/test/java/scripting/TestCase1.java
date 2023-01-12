package scripting;

import java.io.IOException;

import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPages.AccountDetailsPage;
import pomPages.CampaignDetailsPage;
import pomPages.CampaignListPage;
import pomPages.ContactDetailsPage;
import pomPages.CreateAccountPage;
import pomPages.CreateCampaignPage;
import pomPages.CreateContactPage;
import pomPages.CreateLeadPage;
import pomPages.CreatePotentialPage;
import pomPages.LeadDetailsPage;
import pomPages.NewAccountPage;
import pomPages.NewContactPage;
import pomPages.NewLeadPage;
import pomPages.NewPotentialPage;
import pomPages.ZoHomePage;
import pomPages.ZoLoginPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		ZoLoginPage lg= new ZoLoginPage(driver);
		lg.userName(pdata.getData("user_Name"));
		lg.passWord(pdata.getData("passWord"));
		lg.signInButton();
		
		ZoHomePage zh=new ZoHomePage(driver);
		zh.campaignsLink();
		
		CampaignListPage cl= new CampaignListPage(driver);
		cl.newCampaignButton();
		
		CreateCampaignPage cc=new CreateCampaignPage(driver);
		cc.campaignNameText(pdata.getData("campaign_Name"));
		cc.campaignStartDate(pdata.getData("Start_date"));
		cc.expectedRevenueTextField(pdata.getData("expected_Revenue"));
		cc.actualCostTextField(pdata.getData("actual_cost"));
		cc.budgetedCostTextField(pdata.getData("bugeted_cost"));
		driverUtilities.dropDown(cc.getTypDrpDwn(), pdata.getData("type_Option"));
		driverUtilities.dropDown(cc.getStatsDrpDwn(),pdata.getData("status_Option"));
		cc.saveButton();
		
		CampaignDetailsPage cd=new CampaignDetailsPage(driver);
		zh.campaignsLink();
		cd.hpMouse();
		cd.leadsLink();
		
		NewLeadPage nl=new NewLeadPage(driver);
		nl.newLeadButton();
		
		CreateLeadPage cld=new CreateLeadPage(driver);
		driverUtilities.dropDown(cld.getPreFixDrpDwn(), pdata.getData("prefix"));
		cld.firstNameTextField(pdata.getData("first_name"));
		cld.lastNameTextField(pdata.getData("last_Name"));
		cld.companyNameTextField(pdata.getData("company_name"));
		cld.campaignLookUp();
		driverUtilities.switchWindow(driver);
		cld.hpMouseLink();
		driverUtilities.switchWindow(driver);
		cld.saveButton();
		
		LeadDetailsPage ld=new LeadDetailsPage(driver);
		ld.LeadsModuleLink();
		
		NewContactPage nc=new NewContactPage(driver);
		nc.contactsModuleLink();
		nc.newContactButton();
		
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.getPrfxDrpDn();
		ccp.FirstNameTextField(pdata.getData("first_name"));
		driverUtilities.dropDown(ccp.getPrfxDrpDn(), pdata.getData("prefix"));
		ccp.lastNameTextField(pdata.getData("last_Name"));
		driverUtilities.dropDown(ccp.getLdsrcDrpdn(), pdata.getData("Lead_source"));
		ccp.saveButton();
		
		ContactDetailsPage cdp = new ContactDetailsPage(driver);
		cdp.AccountModuleLink();
		
		NewAccountPage nap = new NewAccountPage(driver);
		nap.NewAccountLink();
		
		CreateAccountPage cap=new CreateAccountPage(driver);
		cap.accountNameTextField(pdata.getData("Account_Name"));
		driverUtilities.dropDown(cap.getRtngdrpdn(), pdata.getData("Account_value"));
		cap.accountSiteTextField(pdata.getData("Account_Site"));
		cap.saveButton();
		
		AccountDetailsPage adp = new AccountDetailsPage(driver);
		adp.accountsTab();
		adp.potentialLink();
		
		NewPotentialPage npp=new NewPotentialPage(driver);
		npp.newPotentialLink();
		
		CreatePotentialPage cpp=new CreatePotentialPage(driver);
		cpp.potentialNameTextField(pdata.getData("Potential_Name"));
		cpp.calendarIcon();
		driverUtilities.switchWindow(driver);
		cpp.selectDate();
		driverUtilities.switchWindow(driver);
		driverUtilities.dropDown(cpp.getStgdrpdn(), pdata.getData("stage"));
		cpp.accountNameLookupIcon();
		driverUtilities.switchWindow(driver);
		cpp.nextLink();
		cpp.SamAntony();
		driverUtilities.switchWindow(driver);
		cpp.campaignSourceLookupIcon();
		driverUtilities.switchWindow(driver);
		cpp.hpMouse();
		driverUtilities.switchWindow(driver);
		cpp.saveButton();
		Thread.sleep(5000);
		
	}

}
