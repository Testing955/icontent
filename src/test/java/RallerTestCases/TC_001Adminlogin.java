package RallerTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Raller.Superadminlogin;
import RallerTestBase.BaseClass;

public class TC_001Adminlogin extends BaseClass
{
@Test
public void verifylogin()
{
try
{
Superadminlogin al = new Superadminlogin(driver);
Thread.sleep(5000);
al.efield();
al.pwdfield();
al.login();
al.signoutbtn();
}
catch(Exception e)
{
Assert.fail();
}
}
}
