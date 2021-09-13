package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class ToggleBoxPage {

	WebDriver driver;
	
	public ToggleBoxPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]") WebElement TOGGLEBOX_ELEMENT;
	
	public void clickToggleBox() {
		TOGGLEBOX_ELEMENT.click();
	}
}
