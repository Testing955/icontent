package RallerTestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import RallerPageObject.Usertitle;
import RallerTestBase.BaseClass;

public class TC_003Usertitles extends BaseClass
{

	@Test
	public void usersetups()
	{
	try
	{
	Usertitle ut = new Usertitle(driver);
	ut.efield();
	ut.pwdfield();
	ut.login();
	Thread.sleep(5000);
	ut.createusers();
	Thread.sleep(5000);
	ut.addusers();
	ut.usernames(randomString().toUpperCase());
	ut.useremmails(randomString()+"@yopmail.com");
	ut.saves();
	Thread.sleep(5000);
	ut.nextpage();
	ut.rolechange();
	ut.nextbutton();
	Thread.sleep(10000);
	String lastAddedUserEmail = ut.getLastAddedUserEmail();
	Thread.sleep(5000);
	ut.updaterole();

    // Perform password reset with the last added user's email
    ut.lout();
    ut.fpwd();
    ut.resetemail(lastAddedUserEmail);
    ut.rpwd();
    Thread.sleep(5000);
    ut.back();
    ut.backlogin();
    ut.efield();
    ut.pwdfield();
    ut.login();
    ut.list();

	}
	catch(Exception e)
	{
	Assert.fail("InterruptedException occurred: " + e.getMessage());
    }
	}
	}
