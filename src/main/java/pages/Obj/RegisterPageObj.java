package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.UI.LoginUI;
import pages.UI.RegisterUI;

public class RegisterPageObj extends BasePage {
    WebDriver driver;
    public RegisterPageObj(WebDriver driver){this.driver = driver;}
    public void clickMyAccountMenu(){clickToElementByXpath(driver, LoginUI.myAccountMenu);}
    public void enterRandomRegEmail(){sendKeyToElementById(driver, RegisterUI.regEmail,generateEmail());}
    public void enterRegEmail(String text){sendKeyToElementById(driver,RegisterUI.regEmail,text);}
    public void enterRandomRegPass(){sendKeyToElementById(driver, RegisterUI.regPass,generatePassword());}
    public void enterRegPass(String text){sendKeyToElementById(driver,RegisterUI.regPass,text);}
    public void clickRegisterButton(){clickToElementByXpath(driver,RegisterUI.regButton);}
    public void clickSignOut(){clickToElementByXpath(driver,RegisterUI.signOut);}
    public WebElement getErrorMessage(){return getElementByXpath(driver,LoginUI.errorMessage);}
}
