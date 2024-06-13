package Main.Ancestors;

import com.microsoft.playwright.*;

import static Main.Ancestors.BaseTest.browser;


public abstract class BasePage {

    public static BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1792,948));
    public static Page page = browserContext.newPage();
}
