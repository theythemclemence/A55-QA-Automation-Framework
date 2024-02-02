import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
        // test changes
    }
            @Test
            public void loginValidEmailPassword() {
                //navigateToPage();
                provideEmail("clemence.breslin@testpro.io");
                providePassword("0usTFBYn");
                clickSubmit();

                WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
                Assert.assertTrue(avatarIcon.isDisplayed());
            }
            @Test
            public void loginInvalidEmailPassword() {
                //navigateToPage();
                provideEmail("invalid@class.com");
                providePassword("te$t$tudent");
                clickSubmit();

                //Assert.assertEquals(driver.getCurrentUrl(), url);
            }
        }

