package test;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.LoginPageObj;
import pages.Obj.MyAccountPageObj;

public class MyAccountTest extends BaseTest {
    LoginPageObj objLogin;
    MyAccountPageObj objMyAccount;
    @BeforeMethod
    public void url(){
        String url = BaseUrl;
        driver.get(url);
        objLogin = new LoginPageObj(driver);
        objMyAccount = new MyAccountPageObj(driver);
    }
    //@Test(priority = 1)
    public void Test1() throws InterruptedException {
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objMyAccount.clickDashboardLink();
        WebElement helloText = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']//p"));
        Assert.assertTrue(helloText.getText().contains("tuan1234"),"true");
        Thread.sleep(2000);
    }
    //@Test(priority = 2)
    public void Test2() throws InterruptedException{
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objMyAccount.clickOrderLink();
        String a = objMyAccount.getStatusOrders().getText();
        System.out.println(a);
        Assert.assertTrue(objMyAccount.getStatusOrders().isDisplayed(),"true");
        Thread.sleep(2000);
    }
    //@Test(priority = 3)
    public void Test3() throws InterruptedException{
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objMyAccount.clickOrderLink();
        objMyAccount.clickViewButton();
        Thread.sleep(2000);
        Assert.assertTrue(objMyAccount.getOrderDetailTitle().isDisplayed() && objMyAccount.getCustomerDetailsTitle().isDisplayed() && objMyAccount.getBillingAddressTitle().isDisplayed(),"true");
    }
    //@Test(priority = 4)
    public void Test4() throws InterruptedException{
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objMyAccount.clickOrderLink();
        objMyAccount.clickViewButton();
        Thread.sleep(2000);
        System.out.println(objMyAccount.getOrderDateText().getText());
        System.out.println(objMyAccount.getOrderStatusText().getText());
        Assert.assertTrue(objMyAccount.getOrderDateText().isDisplayed()&&objMyAccount.getOrderStatusText().isDisplayed(),"true");
    }
    //@Test(priority = 5)
    public void Test5(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objLogin.clickMyAccountMenu();
        objMyAccount.clickAddressLink();
        Assert.assertTrue(objMyAccount.getBillingAddressTxt().isDisplayed()&&objMyAccount.getShippingAddressTxt().isDisplayed(),"true");
    }
    //@Test(priority = 6)
    public void Test6() throws InterruptedException {
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objLogin.clickMyAccountMenu();
        objMyAccount.clickAddressLink();
        objMyAccount.clickEditShipping();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("shipping"),"true");
    }
    //@Test(priority = 7)
    public void Test7(){
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objLogin.clickMyAccountMenu();
        objMyAccount.clickAccountDetailsLink();
        Assert.assertTrue(objMyAccount.getInputCurrentPass().isDisplayed(),"true");
    }
    @Test(priority = 8)
    public void Test8() throws InterruptedException {
        objLogin.clickMyAccountMenu();
        objLogin.enterUsername("tuan1234@gmail.com");
        objLogin.enterPassword("Tuan@99884433");
        objLogin.clickLoginButton();
        objLogin.clickMyAccountMenu();
        objMyAccount.clickLogOutBtn();
        Thread.sleep(1000);
    }
}
