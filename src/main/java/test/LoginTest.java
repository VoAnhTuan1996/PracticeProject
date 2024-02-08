package test;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.LoginPageObj;
import pages.Obj.RegisterPageObj;
import pages.UI.LoginUI;

public class LoginTest extends BaseTest {
    LoginPageObj objLogin;
    @BeforeMethod
    public void url(){
        String url = BaseUrl;
        driver.get(url);
        objLogin = new LoginPageObj(driver);
    }
    //@Test(priority = 1)
    public void Testcase1(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("my-account"),"true");
    }
    //@Test(priority = 2)
    public void Testcase2(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan111@gmail.com");
        objLogin.enterPassword("123456789");
        objLogin.clickLoginButton();
        System.out.println(objLogin.getErrorMessage().getText());
        Assert.assertTrue(objLogin.getErrorMessage().isDisplayed(),"true");
    }
    //@Test(priority = 3)
    public void Testcase3(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("");
        objLogin.clickLoginButton();
        System.out.println(objLogin.getErrorMessage().getText());
        Assert.assertTrue(objLogin.getErrorMessage().isDisplayed(),"true");
    }
    //@Test(priority = 4)
    public void Testcase4(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        System.out.println(objLogin.getErrorMessage().getText());
        Assert.assertTrue(objLogin.getErrorMessage().isDisplayed(),"true");
    }
    //@Test(priority = 5)
    public void Testcase5(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("");
        objLogin.enterPassword("");
        objLogin.clickLoginButton();
        System.out.println(objLogin.getErrorMessage().getText());
        Assert.assertTrue(objLogin.getErrorMessage().isDisplayed(),"true");
    }
    //@Test(priority = 6)
    public void Testcase6(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("ABC12345");
        String passValue = objLogin.getPasswordInput().getAttribute("value");
        Assert.assertEquals(passValue,"ABC12345");
    }
    //@Test(priority = 7)
    public void  Testcase7(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("USERNAME");
        objLogin.enterPassword("PASSWORD");
        objLogin.clickLoginButton();
        System.out.println(objLogin.getErrorMessage().getText());
        Assert.assertTrue(objLogin.getErrorMessage().isDisplayed(),"true");
    }
    @Test(priority = 8)
    public void  Testcase8() throws InterruptedException {
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        Thread.sleep(3000);
        objLogin.clickSignOut();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("my-account"),"true");
    }
}
