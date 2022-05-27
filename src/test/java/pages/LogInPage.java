package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LogInPage {

    By button = By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By check = By.cssSelector(".login-form .login-form__title");
    By eposta = By.cssSelector(".login-form__radio-buttons--first-label .login-form__radio-buttons--input");
    By giris = By.cssSelector(".login-form .login-form__title");
    By epostacheck = By.cssSelector(".login-form__radio-buttons--first-label .login-form__radio-buttons--span");
    By telcheck = By.cssSelector(".login-form__radio-buttons--second-label .login-form__radio-buttons--span");
    By epostaText = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[2]/input");
    By passwordText = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[3]/div/input");
    By pwIcon = By.cssSelector(".login-form__show-password-icon .login-form__show-password-icon--img");
    By rememberText = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[4]/label/span");
    By forgotPasswordText = By.cssSelector(".login-form__remember-me .login-form__forgot-password-link");
    By loginButton = By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By buttonTel = By.cssSelector(".login-form__radio-buttons--second-label .login-form__radio-buttons--input");
    By phoneBox = By.id("phone");
    By mailError = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[2]/div");
    By passwordError = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[3]/div/div");
    By mail = By.cssSelector("#login > div > div > div > div > form > div.input-container > input");
    By password = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[3]/div/input");
    By error = By.xpath("//*[@id=\"login\"]/div/div/div/div/div/p");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void textCheck(){wait.until(ExpectedConditions.presenceOfElementLocated(button));}
    public void checkLoginPage(){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        wait.until(ExpectedConditions.presenceOfElementLocated(check));
    }
    public void clickEposta(String button){elementHelper.click(eposta);}
    public void checkGirisYap(String string){wait.until(ExpectedConditions.presenceOfElementLocated(giris));}
    public void checkButton(String button){
        wait.until(ExpectedConditions.presenceOfElementLocated(epostacheck));
        wait.until(ExpectedConditions.presenceOfElementLocated(telcheck));
    }
    public void checkEpostaText(String string){wait.until(ExpectedConditions.presenceOfElementLocated(epostaText));}
    public void checkPasswordText(String string){ wait.until(ExpectedConditions.presenceOfElementLocated(passwordText));}
    public void checkIcon(){driver.findElement(pwIcon);}
    public void checkRememberMe(String string){wait.until(ExpectedConditions.presenceOfElementLocated(rememberText));}
    public void checkForgotPassword(String string){wait.until(ExpectedConditions.presenceOfElementLocated(forgotPasswordText));}
    public void checkLoginButton(String string){driver.findElement(loginButton);}
    public void clickTel(String button){elementHelper.click(buttonTel);}
    public void checkPhoneBox(){ wait.until(ExpectedConditions.presenceOfElementLocated(phoneBox));}
    public void clickLoginButton(){ driver.findElement(loginButton).click();}
    public void checkMail(){elementHelper.findElement(mailError);}
    public void checkPassword(){elementHelper.findElement(passwordError);}
    public void mail(String string){elementHelper.sendKey(mail,string);}
    public void password(String string) {elementHelper.sendKey(password, string);}
    public boolean checkEmptyMail(){
        try {
            if (driver.findElement(mailError).isDisplayed()) {
                return false;
            }
        }
        catch(Exception e) {
            return true;
        }
        return true;
    }
    public boolean checkEmptyPassword(){
        try {
            if (driver.findElement(passwordError).isDisplayed()) {
                return false;
            }
        }
        catch(Exception e) {
            return true;
        }
        return true;
    }
    public void wrongMail(String string){elementHelper.sendKey(mail,string);
        clickLoginButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkMailMessage(){elementHelper.findElement(mailError);}
    public void falseLogin(String string1, String string2){
        elementHelper.sendKey(mail,string1);
        elementHelper.sendKey(password,string2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickLoginButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void error(){
        elementHelper.checkElementVisible(error);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






}

