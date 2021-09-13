package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleBoxPage;
import util.BrowserFactory;

public class ToggleBoxTest {
	WebDriver driver;

	@Test
	public void toggleBoxTest() {
		driver = BrowserFactory.init();

		ToggleBoxPage toggleBox = PageFactory.initElements(driver, ToggleBoxPage.class);
		toggleBox.clickToggleBox();
		
		BrowserFactory.tearDown();
	}
}
