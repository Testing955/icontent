package RallerTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import RallerPageObject.UserManagement;
import RallerTestBase.BaseClass;

public class TC_002UserManagement extends BaseClass
{
@Test
public void usersetup()
{
try
{
UserManagement um = new UserManagement(driver);
um.efield();
um.pwdfield();
um.login();
Thread.sleep(5000);
um.createuser();
Thread.sleep(5000);
um.adduser();
um.username(randomString().toUpperCase());
um.useremmail(randomString()+"@yopmail.com");
um.save();
Thread.sleep(5000);
um.logoutbtn();
um.forgotpawd();
um.useremailid();
Thread.sleep(5000);
um.resetbutton();
um.backbutton();
um.efield();
um.pwdfield();
um.login();
}
catch(Exception e)
{
Assert.fail();
}
}
}
