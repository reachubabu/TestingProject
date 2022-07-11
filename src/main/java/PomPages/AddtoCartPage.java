package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plustbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbtn() {
		addtocart.click();
	}
	//for double click, generate getters method
	public WebElement getPlustbtn() {
		return plustbtn;
	}
	
	
}
