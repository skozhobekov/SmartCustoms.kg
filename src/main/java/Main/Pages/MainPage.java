package Main.Pages;

import Main.Ancestors.BasePage;
import Main.Main;
import com.microsoft.playwright.Locator;

import java.util.Locale;

public class MainPage extends BasePage {
    Locator menuBar = page.locator("span[class='open-main-nav']");
    Locator registrationBtn = page.locator("//span[contains(text(), 'Регистрация')]");
    Locator registrCards = page.locator("//span[contains(text(), 'Карточки')]");
    Locator addRegistrCard = page.locator("//button[@class='form-control custom-button-add']");
    Locator openFixations = page.locator("//button[@data-bs-target='#photo-recording-modal']");
    Locator addNew = page.locator("//button[contains(text(), 'Добавить новый')]");
    Locator ATCnumber = page.locator("//input[@placeholder='Введите номер АТС']");
    Locator country = page.locator("Страна");


    public MainPage photoFixation() {
        menuBar.click();
        registrationBtn.click();
        registrCards.click();
        addRegistrCard.click();
        openFixations.click();
        addNew.click();
        ATCnumber.type("7747");
        country.type("КЫРГЫЗСТАН");
        return this;
    }
}
