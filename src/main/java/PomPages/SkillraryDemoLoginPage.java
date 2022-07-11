package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	@FindBy(id="course")
	private WebElement coursebtn;
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement testing;
	
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//for mouse hover, generate getter method
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	
	public WebElement getTesting() {
		return testing;
	}
}
