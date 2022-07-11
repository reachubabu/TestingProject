/*Test Case-1:
	Ø Open the browser
	Ø Enter the URL of  https://skillrary.com/
	Ø Click on Gears
	Ø Click on Skillrary Demo App
	Ø Switch the control to Skillrary Demo App
	Ø Mouse hover on course
	Ø Click on Selenium Training
	Ø Double click on + button
	Ø Click on Add to Cart
	Ø Switch the control to alert popup 
	Ø Click on Ok */
package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.AddtoCartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass {

	@Test
	public void tc1() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		driverutilities.doubleclick(driver,a.getPlustbtn());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
		
	}
}
