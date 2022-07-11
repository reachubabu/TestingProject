/*Test Case 3:
	� Open the browser
	� Enter the URL of Skillrary.com
	� Type core java for selenium
	� Click on search
	� Click on core java for selenium course
	� Switch the control to frame
	� Click on Play button
	� Click on pause button
	� Switch the control out the frame
	� Click on Add to Wish list */
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
