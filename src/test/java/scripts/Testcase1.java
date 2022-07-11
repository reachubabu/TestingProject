/*Test Case-1:
	� Open the browser
	� Enter the URL of  https://skillrary.com/
	� Click on Gears
	� Click on Skillrary Demo App
	� Switch the control to Skillrary Demo App
	� Mouse hover on course
	� Click on Selenium Training
	� Double click on + button
	� Click on Add to Cart
	� Switch the control to alert popup 
	� Click on Ok */
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
