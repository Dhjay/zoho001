package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPotentialPage {
	
	@FindBy(xpath="//input[@value='New Potential']")
	private WebElement nwptnllnk;
	
	public NewPotentialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newPotentialLink() {
		nwptnllnk.click();
	}

}
