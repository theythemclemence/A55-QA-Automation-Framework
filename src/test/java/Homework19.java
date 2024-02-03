import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {


   @Test
    public void deletePlaylist() throws InterruptedException {

       String expectedPlaylistDeletedMessage = "Deleted playlist \"Test Pro Playlist.\"";


    provideEmail("clemence.breslin@testpro.io");
    providePassword("0usTFBYn");
    clickSubmit();
    openPlaylist();
    clickDeletePlaylistBtn();
    Assert.assertEquals(getPlaylistDeletedMsg(), expectedPlaylistDeletedMessage);

   }

public void clickDeletePlaylistBtn () {
    WebElement playlist = driver.findElement(By.cssSelector(".btn-delete-playlist"));

}

public void openPlaylist() {
    WebElement playlistToOpen = driver.findElement(By.cssSelector(".playlist:nth-child(5)"));
    playlistToOpen.click();

       public void deleteConfirmation() {
           WebElement deleteConf = driver.findElement(By.cssSelector("div.success.show"));
           return deleteConfirmation.
    }

    public String getPlaylistDeletedMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText()

}
}
