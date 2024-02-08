import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {

    @Test
    public void renamePlaylist() throws InterruptedException {

        String updatedPlaylistSuccessMsg = "Updated playlist \"Sample Edited Playlist.\"";


        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        logintoKoel();
        Thread.sleep(2000);
        doubleClickPlaylist();
        enterNewName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(), updatedPlaylistSuccessMsg);





public String getRenamePlaylistSuccessMsg(){
    WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
    return notification.getText();
        }

    public void enterNewName() {

    }

    public void doubleClickPlaylist() {

    }
}


