package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZoHomePage{
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement cmpgnlnk;
	
	public ZoHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void campaignsLink() {
		cmpgnlnk.click();
	}

}
