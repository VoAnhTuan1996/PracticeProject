package test;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.RegisterPageObj;

public class RegisterTest extends BaseTest {
    RegisterPageObj objRegister;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl;
        driver.get(url);
        objRegister = new RegisterPageObj(driver);
    }
    //@Test(priority = 1)
    public void TC1() throws InterruptedException {
        objRegister.clickMyAccountMenu();
        objRegister.enterRandomRegEmail();
        objRegister.enterRandomRegPass();
        objRegister.clickRegisterButton();
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("my-account"),"true");
    }
    //@Test(priority = 2)
    public void TC2(){
        objRegister.clickMyAccountMenu();
        objRegister.enterRegEmail("abc@123");
        objRegister.enterRandomRegPass();
        objRegister.clickRegisterButton();
        System.out.println(objRegister.getErrorMessage().getText());
        Assert.assertTrue(objRegister.getErrorMessage().isDisplayed(),"true");

    }
    //@Test(priority = 3)
    public void TC3() throws InterruptedException {
        objRegister.clickMyAccountMenu();
        objRegister.enterRegEmail("");
        objRegister.enterRandomRegPass();
        objRegister.clickRegisterButton();
        Thread.sleep(3000);
        System.out.println(objRegister.getErrorMessage().getText());
        Assert.assertTrue(objRegister.getErrorMessage().isDisplayed(),"true");
    }
    //@Test(priority = 4)
    public void TC4() throws InterruptedException {
        objRegister.clickMyAccountMenu();
        objRegister.enterRandomRegEmail();
        objRegister.enterRegPass("");
        objRegister.clickRegisterButton();
        Thread.sleep(3000);
        System.out.println(objRegister.getErrorMessage().getText());
        Assert.assertTrue(objRegister.getErrorMessage().isDisplayed(),"true");
    }
    @Test(priority = 5)
    public void TC5() throws InterruptedException {
        objRegister.clickMyAccountMenu();
        objRegister.enterRegEmail("");
        objRegister.enterRegPass("");
        objRegister.clickRegisterButton();
        Thread.sleep(3000);
        System.out.println(objRegister.getErrorMessage().getText());
        Assert.assertTrue(objRegister.getErrorMessage().isDisplayed(),"true");
    }
}
