import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong() throws InterruptedException {
        //navigateToPage();
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();
        enterAllSongs();
        selectSong();
        enterButtonPlaySong();
        Assert.assertTrue(isDisplayedPlayingSong());
    }


    public boolean isDisplayedPlayingSong() {
        WebElement songIsPlaying = driver.findElement(By.cssSelector("[data-testid = 'sound-bar-play']"));
        return songIsPlaying.isDisplayed();
    }


    public void enterButtonPlaySong() {
        WebElement buttonPlaySong = driver.findElement(By.xpath("//span[@title='Play or resume']"));
        Actions actions = new Actions(driver);
        actions.click(buttonPlaySong).perform();
    }


    public void selectSong() throws InterruptedException {
        //WebElement song = driver.findElement(By.xpath("//tr[@class='song-item']"));
        WebElement song = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='song-item']")));
        song.click();
    }


    public void enterAllSongs() throws InterruptedException {
        //WebElement allSongs = driver.findElement(By.cssSelector("a[href='#!/songs']"));
        WebElement allSongs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='#!/songs']")));
        allSongs.click();
    }
}




