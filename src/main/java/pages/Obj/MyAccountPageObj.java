package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.UI.LoginUI;
import pages.UI.MyAccountUI;

public class MyAccountPageObj extends BasePage {
    WebDriver driver;
    public MyAccountPageObj(WebDriver driver){this.driver = driver;}
    public void clickDashboardLink(){clickToElementByXpath(driver, MyAccountUI.dashboardLink);}
    public void clickOrderLink(){clickToElementByXpath(driver,MyAccountUI.orderLink);}
    public WebElement getStatusOrders(){return getElementByXpath(driver,MyAccountUI.statusOrders);}
    public void clickViewButton(){clickToElementByXpath(driver,MyAccountUI.viewButton);}
    public WebElement getOrderDetailTitle(){return getElementByXpath(driver,MyAccountUI.orderDetailTitle);}
    public WebElement getCustomerDetailsTitle(){return getElementByXpath(driver,MyAccountUI.customerDetailsTitle);}
    public WebElement getBillingAddressTitle(){return getElementByXpath(driver,MyAccountUI.billingAddressTitle);}
    public WebElement getOrderDateText(){return getElementByXpath(driver,MyAccountUI.orderDateTxt);}
    public WebElement getOrderStatusText(){return getElementByXpath(driver,MyAccountUI.orderSttTxt);}
    public void clickAddressLink(){clickToElementByXpath(driver,MyAccountUI.addressLink);}
    public WebElement getBillingAddressTxt(){return getElementByXpath(driver,MyAccountUI.billingAddressText);}
    public WebElement getShippingAddressTxt(){return getElementByXpath(driver,MyAccountUI.shippingAddressText);}
    public void clickEditShipping(){clickToElementByXpath(driver,MyAccountUI.editShipping);}
    public void clickAccountDetailsLink(){clickToElementByXpath(driver,MyAccountUI.accountDetailsLink);}
    public WebElement getInputCurrentPass(){return getElementByXpath(driver,MyAccountUI.inputCurrentPass);}
    public void clickLogOutBtn(){clickToElementByXpath(driver,MyAccountUI.logoutBtn);}
}
