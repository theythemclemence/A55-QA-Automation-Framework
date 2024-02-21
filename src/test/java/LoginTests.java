import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {

        //navigateToPage();
        //Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
            @Test
            public void loginValidEmailPassword() throws InterruptedException {
                //navigateToPage(String, url);
                provideEmail("clemence.breslin@testpro.io");
                providePassword("0usTFBYn");
                clickSubmit();

                WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
                Assert.assertTrue(avatarIcon.isDisplayed());

            }
            @Test
            public void loginInvalidEmailPassword() {
                //navigateToPage("https://qa.koel.app/");
                //provideEmail("invalid@class.com");
                //providePassword("te$t$tudent");
                //clickSubmit();
                driver.quit();

                //Assert.assertEquals(driver.getCurrentUrl(), url);
            }


        //Login with Valid email Test using the Page Object Model
    @Test
public void loginValidEmailValidPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("clemence.breslin@testpro.io");
        loginPage.providePassword("0usTFBYn");
        loginPage.submitButtonLocator.click();
        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());


    }
}

