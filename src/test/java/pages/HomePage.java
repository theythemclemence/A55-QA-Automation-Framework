package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Web Elements
    @FindBy(css = "img.avatar")
    private WebElement userAvatarIcon;


    //Helper Methods

    public WebElement getUserAvatar(){
        return findElement(userAvatarIcon);
    }
}
