package RallerTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import RallerPageObject.Superadminlogin;
import RallerTestBase.BaseClass;

public class TC_001Adminlogin extends BaseClass
{
@Test
public void verifylogin()
{
logger.info("**** Starting TC_001Adminlogin ****");
try
{
Superadminlogin al = new Superadminlogin(driver);
Thread.sleep(5000);
al.efield();
logger.info("***** login userfield *****");
al.pwdfield();
logger.info("***** login passwordfield *****");
al.login();
//al.signoutbtn();
logger.info("***** End TC_001Adminlogin *****");
}
catch(Exception e)
{
Assert.fail();
}
}
}
