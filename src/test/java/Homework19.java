import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {


   @Test
    public void deletePlaylist() throws InterruptedException {

       String expectedPlaylistDeletedMesg = "Deleted playlist \"Test Pro Playlist.\"";


    provideEmail("clemence.breslin@testpro.io");
    providePassword("0usTFBYn");
    clickSubmit();
    openPlaylist();
    clickDeletePlaylistBtn();
    Assert.assertEquals(getDeletedPlaylistMsg(), expectedPlaylistDeletedMesg);

   }

public void clickDeletePlaylistBtn () {
    WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
    deletePlaylist.click();

}

public void openPlaylist() {
    WebElement playlistToOpen = driver.findElement(By.cssSelector(".playlist:nth-child(4)"));
    playlistToOpen.click();
}

    public String getDeletedPlaylistMsg() {
        WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        return notificationMsg.getText();

}
}
