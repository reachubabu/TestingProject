/*Test Case 2:
	Ø Open the browser
	Ø Enter the URL of Skillrary.com
	Ø Click on Gears
	Ø Click on Skillrary Demo App
	Ø Switch the control to Skillrary App
	Ø Select Testing from the drop down
	Ø Drag and drop the Selenium course
	Ø Scroll the page till Facebook icon
	Ø Click on facebook */
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
