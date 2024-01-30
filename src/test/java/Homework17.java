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
    public void addSongToPlaylist() {

        String actual_text = "Added 1 song into \"Test";
        String expected_text = "Added 1 song into \"Test";

        // 1. Navigate to Koel
       launchBrowser();

        // 2. Login with valid credentials




        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("0usTFBYn");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // 3. Search for a song

        WebElement searchBar = driver.findElement(By.cssSelector("div#searchForm input[type='search']"));
        searchBar.clear();
        searchBar.sendKeys("Dark Days");

        // 4. Click 'View All' button
        WebElement viewAll = driver.findElement(By.cssSelector("//button[@data-test='view-all-songs-btn']"));
        submit.click();

        // 5. Click on first result
        WebElement firstResult = driver.findElement(By.xpath(driver.findElement(By.xpath((//section[@id='songResultsWrapper']//tr[@class='song-item'][1]');
        submit.click();

        //6. Click 'Add To' button
        WebElement addToBtn = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        addToBtn.click();
        //submit.click();

        //7. Add song to existing playlist
        WebElement addPlaylist = driver.findElement(By.cssSelector("button[class= 'playlist'>Test]"));
        submit.click();

        //8. Verify that notification appears confirming song was added to Playlist
        Assert.assertEquals(actual_text, expected_text);

        driver.quit();
    }


// Helper Methods

    public void clickAddToBtn() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addToBtn = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
    addToBtn.click();


}
}

