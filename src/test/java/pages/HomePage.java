package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class HomePage {
    By topHeader = By.cssSelector(".header__top  .header-marketing-management");
    By login = By.cssSelector("[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle .dropdown-label");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(topHeader));
    }

    public void clickLoginButton(String button){
        driver.findElement(login).click();

    }

}
