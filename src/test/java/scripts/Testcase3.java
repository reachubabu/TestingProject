/*Test Case 3:
	Ø Open the browser
	Ø Enter the URL of Skillrary.com
	Ø Type core java for selenium
	Ø Click on search
	Ø Click on core java for selenium course
	Ø Switch the control to frame
	Ø Click on Play button
	Ø Click on pause button
	Ø Switch the control out the frame
	Ø Click on Add to Wish list */
package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.ClickCoreJava;
import PomPages.PlayCoreJava;
import PomPages.SearchCoreJava;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass {

	@Test
	public void tc3() throws IOException {
	SearchCoreJava s=new SearchCoreJava(driver);
	s.searchtextbox(pdata.getPropertyfile("coursename"));
	s.searchbutton();
	
	ClickCoreJava c=new ClickCoreJava(driver);
	c.corejavaclick();
	
	PlayCoreJava p=new PlayCoreJava(driver);
	p.cookieaccept();
	driverutilities.switchtoframe(driver);
	p.playbutton();
	p.pausebutton();
	driverutilities.switchback(driver);
	p.addtowishlist();
	}
}
