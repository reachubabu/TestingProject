package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDropSelenium {
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumdrag;
	
	@FindBy(id="mycart")
	private WebElement seleniumdrop;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public DragandDropSelenium(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSeleniumdrag() {
		return seleniumdrag;
	}
	
	public WebElement getSeleniumdrop() {
		return seleniumdrop;
	}
	
	public WebElement getFacebook() {
		return facebook;
	}

	public void facbookbutton() {
		facebook.click();
	}
}
