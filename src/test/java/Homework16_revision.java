import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16_revision extends LoginTests {

    @Test
        public void registrationNavigation() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. Navigate to Koel
        String url = "https://qa.koel.app/";
        driver.get(url);

        //2. Click on 'Registration' button
        WebElement submit = driver.findElement(By.cssSelector("[href='registration']"));
        submit.click();

        //3. Confirm registration page appears
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/registration");

        driver.quit();
    }
    }

