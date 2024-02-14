package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

private By submitButtonLocator = By.cssSelector("[type='submit']");
private By emailField = By.cssSelector("input[type='email']");


public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Web Elements

    By emailField = By.cssSelector("input[type='email']");

    By passwordField = By.cssSelector("input[type='password']");

    By loginBtn = By.cssSelector("button[type='submit']");

    //Helper Methods

    public LoginPage clickSubmitBtn(){
        driver.findElement(submitButtonLocator).click();
        return this;
    }

    public LoginPage provideEmail(String email){
        
    }

    public void provideEmail(String email) {
        findElement(emailField).sendKeys(email);

    }

    public void providePassword(String password) {
        findElement(emailField).sendKeys(password);
    }

        public void clickSubmit() {
            findElement(loginBtn).click();
        }

        public void login(){
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();

        }
    }



