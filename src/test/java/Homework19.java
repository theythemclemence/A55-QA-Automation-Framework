import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

    String expectedPlaylistDeletedMessage = "Deleted Playlist \"Test Pro Playlist.\"";

   @Test
    public void deletePlaylist() {
    navigateToPage("https://qa.koel.app/");
    provideEmail("clemence.breslin@testpro.io");
    providePassword("0usTFBYn");
    clickSubmit();
    clickPlaylist();
    playlistDelete();
    deleteConfirmation();
    


   }

public void clickPlaylist () {
    WebElement playlist = driver.findElement(By.xpath("//section[@id='playlists']//li[contains(text(),'Test Pro Playlist')]"));
    playlist.click();

    // "//[@id="playlists"]/ul/li[4]/a/text(), 'Test Pro Playlist']"
    // "//[@id="playlists"]/ul/li[4]/a/text()]"
}

public void playlistDelete() {
       WebElement deleteBtn = driver.findElement(By.xpath("//[@id='playlist-Wrapper']/header/div[3]/span/button[2]"));
       deleteBtn.click();

       public void deleteConfirmation() {
           WebElement deleteConf = driver.findElement(By.xpath())
                   // "//[div[3]/div/div/nav/button[2]]"
    }

    }

    public String getPlaylistDeletedMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();

}
}
