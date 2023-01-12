package genericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void doubleClick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void rightClick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	
	public void scrollBar(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("+x+", "+y+");
	}
	
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchWindow(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for( String c:child) {
			driver.switchTo().window(c);
		}
		
	}
	

}
