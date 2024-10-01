package Main.Pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.datafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final ElementsCollection buttons = $$x("//h2//a");
    private final SelenideElement burger = $x("//button[@class = 'open-main-nav text-white']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private final SelenideElement searchCard = $x("//input[@placeholder='Поиск по гос номеру']");
    private final ElementsCollection list = $$x("//div//div[@class = 'card-body']");
    private final SelenideElement addNew = $x("//li[@class='create-card-btn']");
    private final SelenideElement changeViewToList = $x("//button[@class='switch-view-mode-btn']");
    private final ElementsCollection typeOfATS = $$x("//button[@class='btn btn-secondary rounded-pill shadow-none bg-white text-center fixed-size']");
    private final SelenideElement loadedOption = $x("//input[@title='С ГРУЗОМ']");
    private final SelenideElement numberOfATS = $x("//input[@id='vehicle-number-main']");
    private final SelenideElement saveButton = $x("/html/body/app-root/app-main-page/div/div/div/div/app-card-view/app-vehicle-details/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/button");
    private final SelenideElement photoLoading = $x("//input[@id='vehiclePhotoEntry']");
    private final SelenideElement cardStatus = $x("//p[@class = 'control-card-desc m-0 h-auto overflow-hidden text-dark']");
    private String expectedStatus = "В РАБОТЕ";
    private final SelenideElement openFilterButton = $x("//button[@class='fields-list-filter']");
    private final SelenideElement oneMoreField = $x("//*[contains(text(), \"Изменен\")]");
    private final ElementsCollection numberofATSinFilter = $$x("//*[contains(text(), \"Номер АТС\")]");
    private final ElementsCollection showFIeldsButton = $$x("//button[@class='btn btn-primary']");
    private final SelenideElement resetButton = $x("//*[contains(text(), \"Сброс\")]");
    //fields

    private final ElementsCollection exitDate = $$x("//*[contains(text(), \"Время выезда\")]"); //get(1)
    private final ElementsCollection enterDate = $$x("//*[contains(text(), \"Время заезда\")]"); //get(1)
    private final SelenideElement tamOtdel = $x("//*[contains(text(), \"Таможенный отдел\")]"); //get(1)
    private final SelenideElement registrEnding = $x("//*[contains(text(), \"Завершения регистрации\")]"); //get(1)
    private final SelenideElement registrBeginning = $x("//*[contains(text(), \"Начало регистрации\")]"); //get(1)
    private final ElementsCollection RecordingCapability = $$x("//*[contains(text(), \"Способ записи\")]"); //get(1)
    private final ElementsCollection updated = $$x("//*[contains(text(), \"Обновлено\")]"); //get(1)
    private final ElementsCollection decisionToEntry = $$x("//*[contains(text(), \"Решение на въезд\")]"); //get(1)



    public void navigateToCard()  {
    burger.click();
    registration.click();
    registrationCards.click();
    addNew.click();
    }


    public void cardFilling() throws InterruptedException {
    typeOfATS.get(0).click();
    loadedOption.click();
    photoLoading.uploadFile(new File("src/test/data/stinger.jpg"));
    Faker faker = new Faker();
    String fakeNumber = faker.name().fullName();
    numberOfATS.sendKeys(fakeNumber);
    saveButton.click();
        //Проверка
    String status = cardStatus.getText();
    Assert.assertEquals(status, expectedStatus);
    }

    public void addNewColumn() throws InterruptedException{
        burger.click();
        registration.click();
        registrationCards.click();
        changeViewToList.click();
        changeViewToList.scrollTo();
        Thread.sleep(1000);
        openFilterButton.click();
        oneMoreField.click();
        //numberofATSinFilter.get(1).click();
        showFIeldsButton.get(0).click();

    }

    public void removeOneColumn() throws InterruptedException {
        burger.click();
        registration.click();
        registrationCards.click();
        changeViewToList.click();
        changeViewToList.scrollTo();
        Thread.sleep(1000);
        openFilterButton.click();
        numberofATSinFilter.get(1).click();
        showFIeldsButton.get(0).click();
    }

    public void resetColumns() {
        openFilterButton.click();
        resetButton.click();
    }

    public void leaveThreeColumns() throws InterruptedException {
        burger.click();
        registration.click();
        registrationCards.click();
        changeViewToList.click();
        changeViewToList.scrollTo();
        Thread.sleep(1000);
        openFilterButton.click();
        exitDate.get(1).click();
        enterDate.get(1).click();
        tamOtdel.click();
        RecordingCapability.get(1).click();
        decisionToEntry.get(0).click();
        registrEnding.click();
        registrBeginning.click();
        //resetButton.click();
        showFIeldsButton.get(0).click();
    }
}
