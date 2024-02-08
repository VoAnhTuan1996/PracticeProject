package test;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.ShopPageObj;

public class ShopTest extends BaseTest {
    ShopPageObj objShop;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl;
        driver.get(url);
        objShop = new ShopPageObj(driver);
    }
    //@Test
    public void TC1() throws InterruptedException {
        // Set the minimum value for the slider
        objShop.clickShopMenu();
        WebElement max = objShop.getMaxPrice();
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(max,-28,0).perform();
        objShop.clickFilterButton();
        Thread.sleep(3500);
    }
    //@Test
    public void TC2(){
        objShop.clickShopMenu();
        objShop.clickHtmlLink();
        WebElement titleBook = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(titleBook.getText().contains("HTML"),"true");
    }
    //@Test
    public void TC3() throws InterruptedException {
        objShop.clickShopMenu();
        objShop.clickSortDropdown();
        Thread.sleep(2000);
        objShop.clickOptionPopularity();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
    }
    //@Test
    public void TC4() throws InterruptedException {
        objShop.clickShopMenu();
        objShop.clickSortDropdown();
        Thread.sleep(2000);
        objShop.clickOptionRating();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
    }
    //@Test
    public void TC5() throws InterruptedException {
        objShop.clickShopMenu();
        objShop.clickSortDropdown();
        Thread.sleep(2000);
        objShop.clickOptionNewness();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
    }
    //@Test
    public void TC6() throws InterruptedException {
        objShop.clickShopMenu();
        objShop.clickSortDropdown();
        Thread.sleep(2000);
        objShop.clickOptionLowToHigh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
    }
    //@Test
    public void TC7() throws InterruptedException {
        objShop.clickShopMenu();
        objShop.clickSortDropdown();
        Thread.sleep(2000);
        objShop.clickOptionHighToLow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
    }
    //@Test
    public void TC9() throws InterruptedException{
        objShop.clickShopMenu();
        objShop.clickBookSaleProduct1();
        Thread.sleep(2000);
        WebElement delPrice = driver.findElement(By.xpath("//p[@class='price']//del"));
        WebElement insPrice = driver.findElement(By.xpath("//p[@class='price']//ins"));
        Assert.assertTrue(delPrice.isDisplayed() && insPrice.isDisplayed(),"true");
    }
    @Test
    public void TC10() throws InterruptedException{
        objShop.clickShopMenu();
        WebElement addBasketBtn1 = driver.findElement(By.xpath("//a[@data-product_id='169']"));
        addBasketBtn1.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        WebElement viewBasketLink = driver.findElement(By.xpath("//a[@title='View Basket']"));
        viewBasketLink.click();
        String totalValue = objShop.getTotalText().getText();
        String subTotalValue = objShop.getSubTotalText().getText();
        double total = Double.parseDouble(totalValue.replace("₹", ""));
        double subTotal = Double.parseDouble(subTotalValue.replace("₹", ""));
        double x = total-subTotal;
        Assert.assertTrue(x>0,"true");
        objShop.clickProceedCheckoutBtn();
       /* String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://practice.automationtesting.in/checkout/");*/
        objShop.enterFname("Vo");
        objShop.enterLname("Anh Tuan");
        objShop.enterCompanyName("FPT Software");
        objShop.enterEmail("harrytuan540@gmail.com");
        objShop.enterPhoneNumber("0523933769");
        //js.executeScript("window.scrollBy(0,350)", "");
        objShop.clickCountryField();
        Thread.sleep(3000);
    }
}
