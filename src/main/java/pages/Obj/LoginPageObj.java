package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.UI.LoginUI;
import pages.UI.RegisterUI;

public class LoginPageObj extends BasePage {
    WebDriver driver;
    public LoginPageObj(WebDriver driver){this.driver = driver;}
    public void clickMyAccountMenu(){clickToElementByXpath(driver, LoginUI.myAccountMenu);}
    public void enterUsername(String text){sendKeyToElementById(driver,LoginUI.inputUsername,text);}
    public WebElement getPasswordInput(){return getElementById(driver,LoginUI.inputPassword);}
    public void enterPassword(String text){sendKeyToElementById(driver,LoginUI.inputPassword,text);}
    public void clickLoginButton(){clickToElementByXpath(driver,LoginUI.loginButton);}
    public WebElement getErrorMessage(){return getElementByXpath(driver,LoginUI.errorMessage);}
    public void clickSignOut(){clickToElementByXpath(driver, RegisterUI.signOut);}
}
