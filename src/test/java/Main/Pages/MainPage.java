package Main.Pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.datafaker.Faker;
import org.junit.Assert;

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

    private final ElementsCollection typeOfATS = $$x("//button[@class='btn btn-secondary rounded-pill shadow-none bg-white text-center fixed-size']");
    private final SelenideElement loadedOption = $x("//input[@title='С ГРУЗОМ']");
    private final SelenideElement numberOfATS = $x("//input[@id='vehicle-number-main']");
    private final SelenideElement saveButton = $x("/html/body/app-root/app-main-page/div/div/div/div/app-card-view/app-vehicle-details/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/button");
    private final SelenideElement photoLoading = $x("//input[@id='vehiclePhotoEntry']");
    private final SelenideElement cardStatus = $x("//p[@class = 'control-card-desc m-0 h-auto overflow-hidden text-dark']");
    private String expectedStatus = "В РАБОТЕ";


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
}
