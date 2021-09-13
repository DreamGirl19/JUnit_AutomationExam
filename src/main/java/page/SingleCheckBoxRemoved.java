package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleCheckBoxRemoved {
	WebDriver driver;

	public SingleCheckBoxRemoved(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"todos-content\"]/form/ul/li[5]") WebElement SINGLE_CHECK_BOX_ELEMENT;
	
	public void clickSingleCheckBox_Element() {
		SINGLE_CHECK_BOX_ELEMENT.click();
	}
}
