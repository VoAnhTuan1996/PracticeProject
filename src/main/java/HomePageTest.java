import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Set;

public class HomePageTest {
    static WebDriver driver;
    @BeforeClass
    public void initBrowser() {
        String url = "http://practice.automationtesting.in/";
        String browser = "Chrome";
        switch (browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Chưa chọn browser");
                break;
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void refresh(){
        driver.navigate().refresh();
    }

    //@Test(priority = 1)
    public void Test_TC01(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test1();
        }else {
            getUrl();
            clickShopMenuLink();
            Test1();
        }
    }
    //@Test(priority = 2)
    public void Test_TC02(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test2();
        }else {
            getUrl();
            clickShopMenuLink();
            Test2();
        }
    }
    //@Test(priority = 3)
    public void Test_TC03(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test3();
        }else {
            getUrl();
            clickShopMenuLink();
            Test3();
        }
    }
    //@Test(priority = 4)
    public void Test_TC04(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test4();
        }else {
            getUrl();
            clickShopMenuLink();
            Test4();
        }
    }
    //@Test(priority = 5)
    public void Test_TC05(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test5();

        }else {
            getUrl();
            clickShopMenuLink();
            Test5();
        }
    }
    //@Test(priority = 6)
    public void Test_TC06(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test6();
        }else {
            getUrl();
            clickShopMenuLink();
            Test6();
        }
    }
    //@Test(priority = 7)
    public void Test_TC07(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test7();
        }else {
            getUrl();
            clickShopMenuLink();
            Test7();
        }
    }
    //@Test(priority = 8)
    public void Test_TC08(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test8();
        }else {
            getUrl();
            clickShopMenuLink();
            Test8();
        }
    }
    //@Test(priority = 9)
    public void Test_TC09(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test9();
        }else {
            getUrl();
            clickShopMenuLink();
            Test9();
        }
    }
    //@Test(priority = 10)
    public void Test_TC10(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test10();
        }else {
            getUrl();
            clickShopMenuLink();
            Test10();
        }
    }
    //@Test(priority = 11)
    public void Test_TC11(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test11();
        }else {
            getUrl();
            clickShopMenuLink();
            Test11();
        }
    }
    //@Test(priority = 12)
    public void Test_TC12(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test12();
        }
        else{
            getUrl();
            clickShopMenuLink();
            Test12();
        }
    }
    //@Test(priority = 13)
    public void Test_TC13(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test13();
        }
        else{
            getUrl();
            clickShopMenuLink();
            Test13();
        }
    }
    //@Test(priority = 14)
    public void Test_TC14(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test14();
        }
        else {
            getUrl();
            clickShopMenuLink();
            Test14();
        }
    }
    //@Test(priority = 15)
    public void Test_TC15(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test15();
        }
        else {
            getUrl();
            clickShopMenuLink();
            Test15();
        }
    }
    //@Test(priority = 16)
    public void Test_TC16(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test16();
        }
        else {
            getUrl();
            clickShopMenuLink();
            Test16();
        }
    }
    @Test(priority = 17)
    public void Test_TC17(){
        clickShopMenuLink();
        if(driver.getCurrentUrl().contains("shop")){
            Test17();
        }
        else{
            getUrl();
            clickShopMenuLink();
            Test17();
        }
    }
    public void Test1(){
        clickHomeMenuBtn();
        int sliderCount = driver.findElements(By.className("n2-ss-slide-background")).size();
        Assert.assertEquals(sliderCount,3);
    }
    public void Test2(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
    }
    public void Test3(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickFirstImg();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("product/selenium-ruby"),"true");
    }
    public void Test4(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickFirstImg();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("product/selenium-ruby"),"true");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        String descText = getTextDescription().getText();
        System.out.println(descText);
        Assert.assertTrue(getTextDescription().isDisplayed(),"true");
    }
    public void Test5(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickFirstImg();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("product/selenium-ruby"),"true");
        clickTabReview();
        String rev = getReviews().getText();
        if(!rev.isEmpty()){
            System.out.println("There are reviews regarding the book the user clicked on.");
            System.out.println("Reviews: " + rev);
        }
        else {
            System.out.println("There are no reviews regarding the book the user clicked on.");
        }
    }
    public void Test6(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.getCurrentUrl().contains("product/thinking-in-html/"),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
    }
    public void Test7(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.getCurrentUrl().contains("product/thinking-in-html/"),"true");
        sendKeyQuantityInput("10");
        clickAddBasketButton();
    }
    public void Test8(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        sendKeyQuantityInput("5");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).isDisplayed(),"true");
    }
    public void Test9(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).isDisplayed(),"true");
        applyCoupon();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='woocommerce-error']//li")));
        Assert.assertTrue(item.isDisplayed(),"true");
    }
    public void Test10(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickThirdImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        sendKeyQuantityInput("3");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).isDisplayed(),"true");
        applyCoupon();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Coupon code applied successfully.')]")));
        Assert.assertTrue(item.isDisplayed(),"true");
    }
    public void Test11(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickThirdImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        sendKeyQuantityInput("2");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).isDisplayed(),"true");
        clickToRemoveItem();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='woocommerce-message']")));
        Assert.assertTrue(item.isDisplayed(),"true");
    }

    public void Test12(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickThirdImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).isDisplayed(),"true");
        sendKeyQuantityInput("2");
        clickUpdateBasketButton();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-message")));
        Assert.assertEquals(message.getText(),"Basket updated.");
    }

    public void Test13(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickThirdImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        sendKeyQuantityInput("4");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickViewBasketButton();
        Assert.assertTrue(getProductName().isDisplayed() && getProductPrice().isDisplayed(),"true");
        clickItemCheckout();
        Assert.assertTrue(getTotalPrice().isDisplayed(),"true");
    }
    public void Test14(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickViewBasketButton();
        Assert.assertTrue(getProductName().isDisplayed() && getProductPrice().isDisplayed(),"true");
        clickItemCheckout();
        sendKeyQuantityInput("2");
        Assert.assertTrue(getUpdateBasketButton().isEnabled(),"true");
        clickUpdateBasketButton();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-message")));
        Assert.assertEquals(message.getText(),"Basket updated.");
    }
    public void Test15(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        String totalValue = getTotalText().getText();
        String subTotalValue = getSubtotalText().getText();
        double total = Double.parseDouble(totalValue.replace("₹", ""));
        double subTotal = Double.parseDouble(subTotalValue.replace("₹", ""));
        double x = total-subTotal;
        Assert.assertTrue(x>0,"true");
    }
    public void Test16(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        String totalValue = getTotalText().getText();
        String subTotalValue = getSubtotalText().getText();
        double total = Double.parseDouble(totalValue.replace("₹", ""));
        double subTotal = Double.parseDouble(subTotalValue.replace("₹", ""));
        double x = total-subTotal;
        Assert.assertTrue(x>0,"true");
        clickProceedCheckoutButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://practice.automationtesting.in/checkout/");
    }
    public void Test17(){
        clickHomeMenuBtn();
        int arrivalsCount = driver.findElements(By.className("products")).size();
        Assert.assertEquals(arrivalsCount,3);
        clickSecondImg();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),"true");
        clickAddBasketButton();
        Assert.assertTrue(getMessageBasket().getText().contains("added to your basket"),"true");
        clickItemCheckout();
        String totalValue = getTotalText().getText();
        String subTotalValue = getSubtotalText().getText();
        double total = Double.parseDouble(totalValue.replace("₹", ""));
        double subTotal = Double.parseDouble(subTotalValue.replace("₹", ""));
        double x = total-subTotal;
        Assert.assertTrue(x>0,"true");
        clickProceedCheckoutButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://practice.automationtesting.in/checkout/");
        WebElement billingDetails = driver.findElement(By.xpath("//h3[text()='Billing Details']"));
        WebElement orderDetails = driver.findElement(By.xpath("//h3[text()='Your order']"));
        WebElement additionDetails = driver.findElement(By.xpath("//h3[text()='Additional Information']"));
        Assert.assertTrue(billingDetails.isDisplayed()&&orderDetails.isDisplayed()&& additionDetails.isDisplayed(),"true");
        enterBillingForm();
    }

    public void getUrl(){
        driver.get("http://practice.automationtesting.in/");
    }
    public void clickShopMenuLink(){
        WebElement shopMenu = driver.findElement(By.linkText("Shop"));
        shopMenu.click();
    }
    public void clickHomeMenuBtn(){
        WebElement homeMenuBtn = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        homeMenuBtn.click();
    }
    public void clickFirstImg(){
        WebElement firstImg = driver.findElement(By.cssSelector("img[title='Selenium Ruby']"));
        firstImg.click();
    }
    public void clickSecondImg(){
        WebElement secondImg = driver.findElement(By.cssSelector("img[title='Thinking in HTML']"));
        secondImg.click();
    }
    public void clickThirdImg(){
        WebElement thirdImg = driver.findElement(By.cssSelector("img[title='Mastering JavaScript']"));
        thirdImg.click();
    }
    public void clickTabDescription(){
        WebElement tabDesc = driver.findElement(By.linkText("Description"));
        tabDesc.click();
    }
    public WebElement getTextDescription(){
        return driver.findElement(By.xpath("//div[@id='tab-description']//p"));
    }
    public void clickTabReview(){
        WebElement tabReview = driver.findElement(By.xpath("//a[contains(text(),'Reviews ')]"));
        tabReview.click();
    }
    public WebElement getReviews(){
        return driver.findElement(By.xpath("//div[@id='comments']//p"));
    }
    public void clickAddBasketButton(){
        WebElement btnAdd = driver.findElement(By.xpath("//button[@type='submit']"));
        btnAdd.click();
    }
    public WebElement getMessageBasket(){
        return driver.findElement(By.xpath("//div[@class=\"woocommerce-message\"]"));
    }
    public void sendKeyQuantityInput(String count){
        WebElement quantity = driver.findElement(By.xpath("//div[@class='quantity']//input"));
        quantity.clear();
        quantity.sendKeys(count);
    }
    public void clickItemCheckout(){
        WebElement itemCheckout = driver.findElement(By.xpath("//a[@class='wpmenucart-contents']"));
        itemCheckout.click();
    }

    public void applyCoupon(){
        WebElement txtCoupon = driver.findElement(By.id("coupon_code"));
        txtCoupon.sendKeys("krishnasakinala");
        WebElement btnApply = driver.findElement(By.xpath("//input[@type='submit' and @value='Apply Coupon']"));
        btnApply.click();
    }
    public void clickToRemoveItem(){
        WebElement removeIcon = driver.findElement(By.xpath("//a[contains(text(),'×')]"));
        removeIcon.click();
    }
    public WebElement getUpdateBasketButton(){
        return driver.findElement(By.xpath("//input[@value='Update Basket']"));
    }
    public void clickUpdateBasketButton(){
        WebElement btn = getUpdateBasketButton();
        btn.click();
    }
    public void clickViewBasketButton(){
        WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'View Basket')]"));
        btn.click();
    }
    public WebElement getProductName(){
        return driver.findElement(By.xpath("//td[@class='product-name']//a"));
    }
    public WebElement getProductPrice(){
        return driver.findElement(By.xpath("//td[@class='product-price']//span[@class='woocommerce-Price-amount amount']"));
    }
    public WebElement getTotalPrice(){
        return driver.findElement(By.xpath("//tbody/tr[3]/td[1]/strong[1]/span[1]"));
    }
    public void clickProceedCheckoutButton(){
        WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]"));
        btn.click();
    }
    public WebElement getSubtotalText(){
        return driver.findElement(By.xpath("//td[@data-title='Subtotal']//span[@class='woocommerce-Price-amount amount']"));
    }
    public WebElement getTotalText(){
        return driver.findElement(By.xpath("//td[@data-title='Total']//strong//span[@class='woocommerce-Price-amount amount']"));
    }
    public void enterBillingForm(){
        WebElement firstNameField = driver.findElement(By.id("billing_first_name"));
        firstNameField.sendKeys("Phan");
        WebElement lastNameField = driver.findElement(By.id("billing_last_name"));
        lastNameField.sendKeys("Hai");
        WebElement companyField = driver.findElement(By.id("billing_company"));
        companyField.sendKeys("FPT");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        WebElement emailField = driver.findElement(By.xpath("//input[@id='billing_email']"));
        emailField.sendKeys("john.doe@gmail.com");
        WebElement phoneField = driver.findElement(By.id("billing_phone"));
        phoneField.sendKeys("0334567890");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='select2-drop-mask']")));
        countryField.click();
        //WebElement countrySearch = driver.findElement(By.id("s2id_autogen1_search"));
        //countrySearch.sendKeys("Vietnam");
        //WebElement countryItem = driver.findElement(By.id("select2-result-label-533"));
        //countryItem.click();
        /*WebElement addressField = driver.findElement(By.id("billing_address_1"));
        WebElement postCodeField = driver.findElement(By.id("billing_postcode"));*/
        /*addressField.sendKeys("10 Nguyen Hue");
        postCodeField.sendKeys("70000");*/
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
