package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayCoreJava {

	@FindBy(xpath="//button[text()='Accept']")
	private WebElement cookie;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
		
	public PlayCoreJava(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void cookieaccept() {
		cookie.click();
	}
	
	public void playbutton() {
		playbtn.click();
	}
	
	public void pausebutton() {
		pausebtn.click();
	}
	
	public void addtowishlist() {
		wishlistbtn.click();
	} 
}
