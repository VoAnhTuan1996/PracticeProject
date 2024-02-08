package pages.UI;

public class MyAccountUI {
    public static String dashboardLink = "//a[contains(text(),'Dashboard')]";
    public static String orderLink = "//a[contains(text(),'Orders')]";
    public static String statusOrders = "//td[@class='order-status']";
    public static String viewButton = "//a[contains(text(),'View')]";
    public static String orderDetailTitle = "//h2[contains(text(),'Order Details')]";
    public static String customerDetailsTitle = "//header//h2";
    public static String billingAddressTitle = "//header//h3";
    public static String orderDateTxt = "//mark[@class='order-date']";
    public static String orderSttTxt = "//mark[@class='order-status']";
    public static String addressLink = "//a[contains(text(),'Addresses')]";
    public static String billingAddressText = "//h3[text()='Billing Address']";
    public static String shippingAddressText = "//h3[text()='Shipping Address']";
    public static String editShipping = "//a[@href='https://practice.automationtesting.in/my-account/edit-address/shipping']";
    public static String accountDetailsLink = "//a[contains(text(),'Account Details')]";
    public static String inputCurrentPass = "//input[@id='password_current']";
    public static String logoutBtn = "//a[contains(text(),'Sign out')]";
}
