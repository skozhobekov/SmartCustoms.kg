package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.LoginPage;
import Main.Pages.MainPage;
import org.junit.Test;


public class Main extends BaseTest {
    static LoginPage loginPage = new LoginPage();
    static MainPage mainPage = new MainPage();

    @Test
    public void authenticate() {
      loginPage.auth(username, password);
    }

    @Test
    public void photoFixation() throws InterruptedException {
        loginPage.auth(username, password);
        mainPage.photoFixation();
        Thread.sleep(5000);
    }
}