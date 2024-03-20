package RallerTestCases;

import org.testng.annotations.Test;

import RallerPageObject.Existinguserchat;
import RallerTestBase.BaseClass;

public class TC_005Existuserchat extends BaseClass
{
@Test
public void existuserchatt() throws InterruptedException
{
Existinguserchat ec = new Existinguserchat(driver);
ec.efield();
ec.pwdfield();
ec.login();
ec.chatb();
Thread.sleep(5000);
ec.existuser();
ec.que1();
ec.sendans();
Thread.sleep(20000);
ec.que2();
ec.sendans();
Thread.sleep(10000);
ec.que3();
ec.sendans();
Thread.sleep(10000);
ec.que4();
ec.sendans();
Thread.sleep(25000);
ec.que5();
ec.sendans();
Thread.sleep(10000);
ec.que6();
ec.sendans();
Thread.sleep(15000);
ec.que7();
ec.sendans();
Thread.sleep(10000);
ec.que8();
ec.sendans();
Thread.sleep(10000);
ec.que9();
ec.sendans();
Thread.sleep(10000);
ec.que10();
ec.sendans();
Thread.sleep(10000);
ec.que10();
ec.sendans();
Thread.sleep(10000);
ec.que11();
ec.sendans();
Thread.sleep(10000);
ec.que12();
ec.sendans();
Thread.sleep(10000);
ec.que13();
ec.sendans();
Thread.sleep(15000);
ec.que14();
ec.sendans();
}

}
