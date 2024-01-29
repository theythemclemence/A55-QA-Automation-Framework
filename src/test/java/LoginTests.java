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

    public static class Homework16 extends LoginTests {
        @Test
        public void registrationNavigation() {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            WebDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://qa.koel.app/";
            driver.get(url);

            WebElement submit = driver.findElement(By.cssSelector("[href='registration']"));
            submit.click();

            Assert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/registration");

            driver.quit();
        }
    }
}

// I was getting an error message when I had my homework saved as a separate Class file so I refactored and added it into LoginTests and that seems to have worked. Please explain