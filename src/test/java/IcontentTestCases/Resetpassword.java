package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentPageObject.Forgotpassword;
import IcontentTestBase.Baseclass;

public class Resetpassword extends Baseclass
{
@Test
public void verify_resetpassword() throws InterruptedException
{
Forgotpassword fpwd = new Forgotpassword(driver);
Thread.sleep(5000);
fpwd.forgotpwd();
fpwd.vemail();
Thread.sleep(10000);
fpwd.buttonverification();
}

{

}
}
