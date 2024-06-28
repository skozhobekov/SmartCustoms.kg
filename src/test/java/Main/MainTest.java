package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.LoginPage;
import Main.Pages.MainPage;
import Main.Pages.PhotoFixationPage;
import org.junit.Test;


public class MainTest extends BaseTest {

    private final String BaseUrl = "https://devsmart.customs.gov.kg/auth/login";
    private final String username = "admin";
    private final String password = "Admin2309";
    private static LoginPage loginPage = new LoginPage();

    @Test
    public void logIn()  {
        LoginPage loginPage = new LoginPage(BaseUrl);
        loginPage.login(username, password);

    }

    @Test
    public void photoFixation() throws InterruptedException {
        logIn();
        MainPage mainPage = new MainPage();
        mainPage.navigateToCard();
        loginPage.logOut();
    }

    @Test
    public void fuiiFilling() throws InterruptedException {
        logIn();
        MainPage mainPage = new MainPage();
        PhotoFixationPage photoFixationPage = new PhotoFixationPage();
        mainPage.navigateToCard();
        photoFixationPage.fullfiling();
        Thread.sleep(2000);

    }
}