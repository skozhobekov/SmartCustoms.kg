package Main.Pages;

import Main.Ancestors.BasePage;
import com.microsoft.playwright.*;
import org.junit.experimental.theories.Theories;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class LoginPage extends BasePage {
    Locator usernameField = page.locator("//input[@id='username']");
     Locator passwordField = page.locator("//input[@id='password']");
     Locator submit = page.locator("//button[@class='btn btn-primary w-100']");



public LoginPage auth(String username, String password) {
    usernameField.click();
    usernameField.type(username);
    passwordField.click();
    passwordField.type(password);
    submit.click();
    String message = submit.textContent();
    System.out.println("text of submit button is: " + message);
    return this;
    }


}
