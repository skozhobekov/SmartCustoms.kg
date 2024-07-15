package Main.Ancestors;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


public abstract class BaseTest {
  public void setUp() {
      WebDriverManager.chromedriver().setup();
      Configuration.browser = "chrome";
      Configuration.browserSize = "1920x1080";
      Configuration.headless = false;
  }

      @Before
      public void init() {
          setUp();

      }

      @After
      public void tearDown() {
          Selenide.closeWebDriver();
      }

  }

//    protected final String password = "qweQWE123!@#";
//    protected final String username = "417INS1111";
//    public static Playwright playwright = Playwright.create();
//    public static Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//
//
//    @Before
//    public void beforeAll() {
//
//
//    }
//    @BeforeEach
//    public void beforeEach() {
//
//    }
//
//    @AfterEach
//    public void afterEach() {
//
//    }
//
//    @After
//public void afterAll(){
//
//    }



