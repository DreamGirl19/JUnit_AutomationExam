package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class AllCheckBoxesRemoved {
	WebDriver driver;
	
	public AllCheckBoxesRemoved(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@type=\"submit\"]") WebElement REMOVE_ELEMENT;
	
	public void clickRemoveElement() {
		REMOVE_ELEMENT.click();
	}
}
