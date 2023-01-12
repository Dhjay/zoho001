package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZoLoginPage {
	
	@FindBy(id="userName")
	private WebElement loginTxtField;
	
	@FindBy(id="passWord")
	private WebElement pwdTxtField;
	
	@FindBy(xpath="//input[@alt='Sign In']")
	private WebElement signInBtn;
	
	public ZoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String user_Name) {
		loginTxtField.sendKeys(user_Name);
	}
	
	public void passWord(String passWord) {
		pwdTxtField.sendKeys(passWord);
	}
	
	public void signInButton() {
		signInBtn.click();
	}

}
