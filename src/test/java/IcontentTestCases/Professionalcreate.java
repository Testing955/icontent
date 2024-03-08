package IcontentTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Icontent.Createprofessional;
import IcontentTestBase.Baseclass;
public class Professionalcreate extends Baseclass
{
@Test
public void verif_professional()
{
try
{
Createprofessional cp = new Createprofessional(driver);
cp.emaif();
cp.passwordf();
cp.loginf();
cp.profeesionaldashboard();
cp.addnewprofessional();
cp.useremail(randomString().toLowerCase()+"@yopmail.com");
cp.generatecode();
Thread.sleep(5000);
cp.sendinvitation();
}
catch(Exception e)
{
Assert.fail();
}
}
}
