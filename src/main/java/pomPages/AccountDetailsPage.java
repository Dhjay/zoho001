package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {
	
	@FindBy(id="Accountstab")
	private WebElement acntlnk;
	
	@FindBy(xpath = "//a[text()='Potentials']")
	private WebElement ptnllnk;
	
	public AccountDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void accountsTab() {
		acntlnk.click();
	}
	
	public void potentialLink() {
		ptnllnk.click();
	}

}
