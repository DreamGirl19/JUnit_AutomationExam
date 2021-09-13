package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AllCheckBoxesRemoved;
import page.ToggleBoxPage;
import util.BrowserFactory;

public class AllCheckBoxRemovedTest {
	WebDriver driver;
	
	ToggleBoxPage toggleBox = new ToggleBoxPage(driver);
	
	@Test
	public void AllCheckBoxRemoved() {
		driver = BrowserFactory.init();

		ToggleBoxPage toggleBox = PageFactory.initElements(driver, ToggleBoxPage.class);
		toggleBox.clickToggleBox();
		
		AllCheckBoxesRemoved allCheckBoxes = PageFactory.initElements(driver, AllCheckBoxesRemoved.class);
		allCheckBoxes.clickRemoveElement();
		
		BrowserFactory.tearDown();
	}
	

}
