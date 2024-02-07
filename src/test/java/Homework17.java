import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String expectedSongAddedMessage = "Added 1 song into \"Test Pro Playlist.\"";

        navigateToPage("https://qa.koel.app/");
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();
        //Thread.sleep(2000);
        searchSong("Dark Days");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        //Thread.sleep(2000);
        choosePlaylist();
        //Thread.sleep(2000);
        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessage);
    }

    // Helper Methods

    public void clickViewAllBtn() throws InterruptedException {
        //WebElement viewAll = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        WebElement viewAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='view-all-songs-btn']")));
        viewAll.click();
    }
    public void selectFirstSongResult() throws InterruptedException {
       // WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        WebElement firstSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]")));
        firstSong.click();
    }
    public String getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();
    }
    public void choosePlaylist() throws InterruptedException {
        //WebElement playlist = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test Pro Playlist')]"));
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test Pro Playlist')]")));
        playlist.click();
    }

    public void searchSong(String name) throws InterruptedException {
        //WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type='search']"));
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#searchForm input[type='search']")));
        searchField.sendKeys(name);
    }
    public void clickAddToBtn() {
        WebElement addToButton = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        addToButton.click();

        }
    }
