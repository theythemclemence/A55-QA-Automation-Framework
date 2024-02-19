package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(css = "[type='submit']")
    private WebElement submitButtonLocator;

    @FindBy(css = "input[type='email']")
    private WebElement emailField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordField;

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public LoginPage clickSubmitBtn(){
        findElement(submitButtonLocator).click();
        return this;
    }

    public LoginPage provideEmail(String email){
        findElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage providePassword(String password){
        findElement(passwordField).sendKeys(password);
        return this;
    }
        }



