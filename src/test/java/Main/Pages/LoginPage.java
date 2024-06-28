package Main.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {
    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
    private final SelenideElement loginField = $x("//input[@id='username']");
        private final SelenideElement passwordField= $x("//input[@id='password']");
        private final SelenideElement loginButton= $x("//button[@class='btn btn-primary w-100']");

        private final ElementsCollection mainButtons = $$x("//fa-icon[@class='ng-fa-icon']");
        private final ElementsCollection settingsButtons = $$x("//a[@class='dropdown-item']");

        public LoginPage(String url) {
            Selenide.open(url);
        }

        public LoginPage() {

        }
        public void login (String username, String password) {
            loginField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
        }


        public void logOut() {
            mainButtons.first().click();
            mainButtons.get(2).click();
            settingsButtons.get(1).click();

        }

}
