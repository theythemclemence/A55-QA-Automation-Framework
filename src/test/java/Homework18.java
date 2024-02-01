import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong() {
        navigateToPage();
        provideEmail("clemence.breslin@testpro.io");
        providePassword("0usTFBYn");
        clickSubmit();
        WebElement PlayNext = driver.findElement(By.xpath("//button[@data-test='play-btn']"));
        clickSubmit();
        Assert.assertEquals();




        public void verifyPause() {
            WebElement pauseButton = driver.findElement(By.xpath("//button[@data-test='pause-btn']"));
        }






        }


    }