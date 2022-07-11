/*Test Case 2:
	� Open the browser
	� Enter the URL of Skillrary.com
	� Click on Gears
	� Click on Skillrary Demo App
	� Switch the control to Skillrary App
	� Select Testing from the drop down
	� Drag and drop the Selenium course
	� Scroll the page till Facebook icon
	� Click on facebook */
package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.DragandDropSelenium;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage t=new SkillraryDemoLoginPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.dropDown(t.getTesting(),pdata.getPropertyfile("course"));
		
		DragandDropSelenium d=new DragandDropSelenium(driver);
		driverutilities.draganddrop(driver,d.getSeleniumdrag(),d.getSeleniumdrop());
		Point loc=d.getFacebook().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollbar(driver,x,y);
		d.facbookbutton();
	}
}
