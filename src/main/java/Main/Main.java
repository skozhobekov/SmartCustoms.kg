package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.LoginPage;
import Main.Pages.MainPage;
import org.junit.Test;


public class Main extends BaseTest {

    private final String BaseUrl = "https://devsmart.customs.gov.kg/auth/login";
    private final String username = "admin";
    private final String password = "Admin2309";

    @Test
    public void authenticate() throws InterruptedException{
        LoginPage loginPage = new LoginPage(BaseUrl);
        loginPage.login(username,password);
        Thread.sleep(5000);
    }

    @Test
    public void photoFixation() throws InterruptedException {
    authenticate();
    MainPage mainPage = new MainPage();
    mainPage.navigateToCard();
Thread.sleep(3000);

    }
}