import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
    }



public String getRenamePlaylistSuccessMsg(){
    WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
    return notification.getText();
        }

    public void enterNewName() {
    WebElement playListInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
    playListInputField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE ));
    playListInputField.sendKeys(newPlaylistName);
    playListInputField.sendKeys(Keys.ENTER);

    }

    public void displayAllSongs() {
            List<WebElement> songList = driver.findElements(By.cssSelector("section#playlistWrapper td.title"));
            System.out.println("Number of Songs found: "+ countSongs());
            for (WebElement e: songList){
                System.out.println(e.getText());
            }
        }

    public void doubleClickPlaylist() {
    WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
    actions.doubleClick(playlistElement).perform();

    public String getPlaylistDetails() {
                return driver.findElement(By.cssSelector("span.meta.text-secondary span.meta")).getText();
            }




