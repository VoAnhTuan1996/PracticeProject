package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class BasePage {
    private long TIMEOUT = 30;
    private WebDriverWait wait;
    private Actions actions;

    public By getByXpath(String locator){return By.xpath(locator);}
    public By getById(String locator){return  By.id(locator);}
    public By getByClassName(String locator){return By.className(locator);}

    public WebElement getElementByXpath(WebDriver driver, String locator){
        return driver.findElement(getByXpath(locator));
    }

    public List<WebElement> getListElementByXpath(WebDriver driver, String locator){
        return driver.findElements(getByXpath(locator));
    }

    public WebElement getElementById(WebDriver driver, String locator){
        return driver.findElement(getById(locator));
    }

    public void clickToElementByXpath(WebDriver driver, String locator){getElementByXpath(driver, locator).click();}
    public void clickToElementById(WebDriver driver, String locator){getElementById(driver,locator).click();}
    public void clickToElementByClassname(WebDriver driver, String locator){getElementByClassName(driver,locator).click();}
    public WebElement getElementByClassName(WebDriver driver, String locator){
        return driver.findElement(getByClassName(locator));
    }
    public void sendKeyToElementByXpath(WebDriver driver, String locator, String text){
        getElementByXpath(driver,locator).sendKeys(text);
    }
    public void sendKeyToElementById(WebDriver driver, String locator, String text){
        getElementById(driver,locator).sendKeys(text);
    }

    public static String generateEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
        String[] prefixes = {"john", "jane", "alex", "emma", "david", "sarah"};

        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String domain = domains[random.nextInt(domains.length)];

        int randomNumber = random.nextInt(10000);
        String email = prefix + randomNumber + "@" + domain;

        return email;
    }

    public static String generatePassword() {
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[{]};:'\",<.>/?";

        String allChars = lowercaseChars + uppercaseChars + numberChars + specialChars;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Đảm bảo mật khẩu có ít nhất 7 kí tự
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

}