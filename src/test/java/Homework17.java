import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String actual_text = "Added 1 song into \"Test\"";
        String expected_text = "Added 1 song into \"Test\"";

        // 1. Navigate to Koel
        navigateToPage();

        // 2. Login with valid credentials
        Thread.sleep(2000);
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();

        // 3. Search for a song
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type='search']"));
        searchField.sendKeys("Dark Days");
        clickSubmit();

        // 4. Click 'View All' button
        Thread.sleep(2000);
        WebElement viewAllBtn = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        clickSubmit();

        // 5. Click on first result
        Thread.sleep(2000);
        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        clickSubmit();

        //6. Click 'Add To' button
        Thread.sleep(2000);
        WebElement addToBtn = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        clickSubmit();

        //7. Add song to existing playlist
        Thread.sleep(2000);
        WebElement addPlaylist = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test')]"));
        clickSubmit();

        //8. Verify that notification appears confirming song was added to Playlist
        Thread.sleep(2000);
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));

        Assert.assertEquals(actual_text, expected_text);

        driver.quit();


    }

    // Helper Methods

    public void clickAddToBtn() {
        WebElement addToBtn = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        addToBtn.click();
    }
}

// The test seems to be failing around the AddToPlaylist step and I can't figure out why. @HW team, please offer some help so I can retry and resubmit. Thanks!






