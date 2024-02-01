import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong() throws InterruptedException {
        navigateToPage();
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();
        clickPlay();
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());
    }

    public boolean isSongPlaying() {
        WebElement soundBar = driver.findElement(By.xpath("//div/[data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();
    }

    public void clickPlay() {
        WebElement playNextBtn = driver.findElement(By.xpath("//i[data-testid='play-next-btn]"));
        WebElement playBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        playNextBtn.click();
        playBtn.click();
    }
}