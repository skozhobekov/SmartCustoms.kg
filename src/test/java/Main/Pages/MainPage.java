package Main.Pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final ElementsCollection buttons = $$x("//h2//a");
    private final SelenideElement burger = $x("//span[@class='open-main-nav']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private final SelenideElement searchCard = $x("//input[@placeholder='Транспорт номери боюнча издөө']");
    private final ElementsCollection list = $$x("//div//div[@class = 'card-body']");

    public void navigateToCard() throws InterruptedException {
    burger.click();
    registration.click();
    registrationCards.click();
    searchCard.sendKeys("TEST123");
    list.first().click();

    }
}
