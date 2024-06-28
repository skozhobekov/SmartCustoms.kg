package Main.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {
    private final SelenideElement loginField = $x("//input[@id='username']");
    private final SelenideElement passwordField= $x("//input[@id='password']");
    private final SelenideElement loginButton= $x("//button[@class='btn btn-primary w-100']");

    public LoginPage(String url) {
        Selenide.open(url);
    }

    public void login (String username, String password) {
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
