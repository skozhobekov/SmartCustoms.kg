package Main.PI.Pages;

import Main.Ancestors.BaseTest;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private SelenideElement loginField = $x("//input[@name='username']");
    private SelenideElement passwordField = $x("//input[@name='current-password']");
    private SelenideElement submitButton = $x("//input[@name='username']");


}
