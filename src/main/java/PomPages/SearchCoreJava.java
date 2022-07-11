package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCoreJava {

	@FindBy(name="q")
	private WebElement searchtxbx;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SearchCoreJava(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	public void searchtextbox(String name) {
		searchtxbx.sendKeys(name);
	}
	public void searchbutton() {
		searchbtn.click();
	}
}
