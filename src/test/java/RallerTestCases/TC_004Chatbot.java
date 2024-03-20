package RallerTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import RallerPageObject.NewUserChatbot;
import RallerTestBase.BaseClass;

public class TC_004Chatbot extends BaseClass
{
@Test
public void chatsetup()
{
try
{
NewUserChatbot ch = new NewUserChatbot(driver);
ch.efield();
ch.pwdfield();
ch.login();
ch.chat();
ch.newchat();
Thread.sleep(5000);
ch.eng();
Thread.sleep(5000);
ch.question1();
Thread.sleep(5000);
ch.send();
Thread.sleep(20000);
ch.question2();
ch.send();
}
catch(Exception e)
{
Assert.fail();
}
}
}
