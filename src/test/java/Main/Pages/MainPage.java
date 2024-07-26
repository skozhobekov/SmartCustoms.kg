package Main.Pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final ElementsCollection buttons = $$x("//h2//a");
    private final SelenideElement burger = $x("//button[@class = 'open-main-nav text-white']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private final SelenideElement searchCard = $x("//input[@placeholder='Поиск по гос номеру']");
    private final ElementsCollection list = $$x("//div//div[@class = 'card-body']");

    public void navigateToCard()  {
    burger.click();
    registration.click();
    registrationCards.click();
    searchCard.sendKeys("2222");
    list.first().click();

    }
}
