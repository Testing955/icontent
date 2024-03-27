package IcontentTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Loginfunctionality;
import IcontentTestBase.Baseclass;

public class Login extends Baseclass
{
@Test
public void verify_login()
{
logger.info("***starting of the testcase***");
try
{

Loginfunctionality lf = new Loginfunctionality(driver);
lf.emaif();
logger.info("Clicked on account email link");
lf.passwordf();
logger.info("Clicked on account password link");
lf.loginf();
logger.info("Clicked on loginbutton link");
lf.insurred();
lf.ainsurred();
lf.fname(randomString().toUpperCase());
lf.lname(randomString().toLowerCase());
lf.efield(randomString().toLowerCase()+"@yopmail.com");
lf.inumber(randomNumber());
lf.sub();
Thread.sleep(50000);
}
catch(Exception e)
{
logger.error("test failed...");	
Assert.fail();
}
}
}






