package IcontentTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Loginfunctionality;
import IcontentTestBase.Baseclass;

public class Login extends Baseclass
{
@Test
public void verify_login()
{
try
{
Loginfunctionality lf = new Loginfunctionality(driver);
lf.emaif();
lf.passwordf();
lf.loginf();
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
Assert.fail();
}
}
}




