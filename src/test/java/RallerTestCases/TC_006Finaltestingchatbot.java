package RallerTestCases;

import org.testng.annotations.Test;

import RallerPageObject.FinalTesting;
import RallerTestBase.BaseClass;

public class TC_006Finaltestingchatbot extends BaseClass
{
@Test
public void finalsetup() throws InterruptedException
{
FinalTesting ft = new FinalTesting(driver);
ft.efield();
ft.pwdfield();
ft.login();
Thread.sleep(15000);
ft.chatb();
ft.existuser();
Thread.sleep(5000);
ft.que1();
ft.sendans();
Thread.sleep(10000);
ft.newchat();
ft.nor();
ft.norques1();
ft.sendingnor();
Thread.sleep(10000);
ft.norques2();
Thread.sleep(10000);
ft.sendingnor();
Thread.sleep(10000);
ft.signoutbtn();
}
}
