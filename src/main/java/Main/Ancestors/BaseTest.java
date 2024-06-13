package Main.Ancestors;

import com.microsoft.playwright.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import javax.naming.Context;
import java.awt.*;
import java.util.List;

import static Main.Ancestors.BasePage.page;



public abstract class BaseTest {
    protected final String password = "qweQWE123!@#";
    protected final String username = "417INS1111";
    public static Playwright playwright = Playwright.create();
    public static Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


    @Before
    public void beforeAll() {
        page.navigate("https://devsmart.customs.gov.kg/");

    }
    @BeforeEach
    public void beforeEach() {

    }

    @AfterEach
    public void afterEach() {

    }

    @After
public void afterAll(){

    }


}
