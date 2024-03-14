package RallerTestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import Raller.Usertitle;
import RallerTestBase.BaseClass;

public class TC_003UserManagements extends BaseClass
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
	}
	catch(Exception e)
	{
	Assert.fail();
	}
	}
	}
