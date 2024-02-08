package pages.Obj;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UI.LoginUI;
import pages.UI.ShopUI;

import java.time.Duration;

public class ShopPageObj extends BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public ShopPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public void clickShopMenu() {
        clickToElementByXpath(driver, ShopUI.shopMenu);
    }

    public WebElement getMinPrice() {
        return getElementByXpath(driver, ShopUI.minPriceField);
    }

    public WebElement getMaxPrice() {
        return getElementByXpath(driver, ShopUI.maxPriceField);
    }

    public void clickFilterButton() {
        clickToElementByXpath(driver, ShopUI.filterButton);
    }

    //public WebElement getHtmlLink(){return getElementByXpath(driver,ShopUI.htmlLink);}
    public void clickHtmlLink() {
        clickToElementByXpath(driver, ShopUI.htmlLink);
    }

    public void clickSortDropdown() {
        clickToElementByClassname(driver, ShopUI.sortDropdown);
    }

    public void clickOptionPopularity() {
        clickToElementByXpath(driver, ShopUI.optionPopularity);
    }

    public void clickOptionRating() {
        clickToElementByXpath(driver, ShopUI.optionRating);
    }

    public void clickOptionNewness() {
        clickToElementByXpath(driver, ShopUI.optionNewness);
    }

    public void clickOptionLowToHigh() {
        clickToElementByXpath(driver, ShopUI.optionLowToHigh);
    }

    public void clickOptionHighToLow() {
        clickToElementByXpath(driver, ShopUI.optionHighToLow);
    }

    public void clickBookSaleProduct1() {
        clickToElementByXpath(driver, ShopUI.bookSaleProduct1);
    }

    public WebElement getSubTotalText() {
        return getElementByXpath(driver, ShopUI.subTotalText);
    }

    public WebElement getTotalText() {
        return getElementByXpath(driver, ShopUI.totalText);
    }

    public void clickProceedCheckoutBtn() {
        clickToElementByXpath(driver, ShopUI.proceedCheckoutButton);
    }

    public void enterFname(String fname) {
        sendKeyToElementById(driver, ShopUI.fNameField, fname);
    }

    public void enterLname(String lname) {
        sendKeyToElementById(driver, ShopUI.lNameField, lname);
    }

    public void enterCompanyName(String cpnName){
        sendKeyToElementById(driver,ShopUI.companyField,cpnName);
    }

    public void enterEmail(String email){
        sendKeyToElementById(driver,ShopUI.emailField,email);
    }

    public void enterPhoneNumber(String phone){
        sendKeyToElementById(driver,ShopUI.phoneNumber,phone);
    }

    public void clickCountryField(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ShopUI.countryField)));
        countryField.click();
        //clickToElementById(driver,ShopUI.countryField);
    }
}
