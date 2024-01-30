import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Navigate to Koel
        String url = "https://qa.koel.app/";
        driver.get(url);

        // 2. Login with valid credentials
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys("clemence.breslin@testpro.io");

        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("0usTFBYn");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // 3. Search for a song

        WebElement searchBar = driver.findElement(By.cssSelector("input[type=search]"));
        searchBar.clear();
        searchBar.sendKeys("Dark Days");

        // 4. Click 'View All' button
        WebElement viewAll = driver.findElement(By.cssSelector("button[type='view all']"));
        submit.click();

        //5. Click on first song in search results




        //6. Click 'Add To' button

        //7. Add song to existing playlist

        //8. Verify that notification appears confirming song was added to Playlist
    }

    }
