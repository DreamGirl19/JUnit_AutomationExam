package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.SingleCheckBoxRemoved;
import util.BrowserFactory;

public class SingleCheckBoxRemovedTest {
	
	WebDriver driver;
	
	@Test
	public void SingleCheckBoxTest() {
		driver = BrowserFactory.init();

		SingleCheckBoxRemoved singleCheckBox = PageFactory.initElements(driver, SingleCheckBoxRemoved.class);
		singleCheckBox.clickSingleCheckBox_Element();
		
		BrowserFactory.tearDown();
	}

}
