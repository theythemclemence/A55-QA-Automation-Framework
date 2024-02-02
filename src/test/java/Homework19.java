import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

   @Test
    public void deletePlaylist() {
    navigateToPage("https://qa.koel.app/");
    provideEmail("clemence.breslin@testpro.io");
    providePassword("0usTFBYn");
    clickSubmit();
    
   }


}
