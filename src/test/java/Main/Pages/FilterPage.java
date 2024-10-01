package Main.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.w3c.dom.ls.LSOutput;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FilterPage {

    private String expectedStatus = "Зарегистрирован";
    private final SelenideElement burger = $x("//button[@class = 'open-main-nav text-white']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private final SelenideElement openFilters = $x("//*[contains(text(), \"Фильтрация\")]");
    private final SelenideElement registeredStatus = $x("//*[contains(text(), \"Зарегистрирован\")]");
    private final ElementsCollection statusFilter = $$x("//div[@class='ng-value-container']");
    private final ElementsCollection registeredStatusFilter = $$x("//span[@class='ng-option-label']");
    private final SelenideElement statusOfFoundCard = $x("//span[@class='content general-status-text finished']");
    private final SelenideElement automatically = $x("//div[@class='ng-option ng-option-marked']");
    private final ElementsCollection automaticallyRecordingMethod = $$x("//span[@class='ng-option-label']");


public void openFilter() {
    burger.click();
    registration.click();
    registrationCards.click();
    openFilters.click();
}

public void setStatusFilter() throws InterruptedException {
    openFilter();
    statusFilter.get(2).click();
    registeredStatusFilter.get(2).click();
    String actualStatus = statusOfFoundCard.getText();
    Assert.assertEquals(expectedStatus,actualStatus);

}
public void setRecordingMethodFilter() throws InterruptedException {
    openFilter();
    statusFilter.get(1).click();
    //automaticallyRecordingMethod.get(1).click();
    automatically.click();

    }
}
