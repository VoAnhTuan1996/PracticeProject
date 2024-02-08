package pages.UI;

import core.BasePage;

public class ShopUI {
    public static String shopMenu = "//a[contains(text(),'Shop')]";
    public static String minPriceField = "//div[@class='price_slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[1]";
    public static String maxPriceField = "//div[@class='price_slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[2]";
    public static String filterButton = "//button[contains(text(),'Filter')]";
    public static String htmlLink = "//a[contains(text(),'HTML')]";
    public static String sortDropdown = "orderby";
    public static String optionPopularity = "//option[contains(text(),'Sort by popularity')]";
    public static String optionRating = "//option[@value='rating']";
    public static String optionNewness = "//option[@value='date']";
    public static String optionLowToHigh = "//option[@value='price']";
    public static String optionHighToLow = "//option[@value='price-desc']";
    public static String bookSaleProduct1 = "//a[@href='https://practice.automationtesting.in/product/android-quick-start-guide/']//img";
    public static String subTotalText = "//td[@data-title='Subtotal']//span[@class='woocommerce-Price-amount amount']";
    public static String totalText = "//td[@data-title='Total']//strong//span[@class='woocommerce-Price-amount amount']";
    public static String proceedCheckoutButton = "//a[contains(text(),'Proceed to Checkout')]";
    public static String fNameField = "billing_first_name";
    public static String lNameField = "billing_last_name";
    public static String companyField = "billing_company";
    public static String emailField = "billing_email";
    public static String phoneNumber = "billing_phone";

    public static String countryField = "select2-drop";
}
