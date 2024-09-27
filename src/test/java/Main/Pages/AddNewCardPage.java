package Main.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.File;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AddNewCardPage {

    private final SelenideElement scrollToObject = $x("//button[text()=\"Сохранить\"]");
    private final SelenideElement burger = $x("//button[@class = 'open-main-nav text-white']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private SelenideElement createNewCard = $x("//li[@class='create-card-btn']");
    private SelenideElement personalNumberField = $x("//input[@id='personalINN']");
    private SelenideElement CountryField = $x("/html/body/app-root/app-main-page/div/div/div/div/app-card-view/div[2]/app-vehicle-registration/div[2]/div[1]/app-driver-form/form/div/div[1]/input-select/ng-select/div/div/div[2]/input");
    private SelenideElement testCountryKG = $x("//div[@class='ng-value-label ng-star-inserted']");
    private ElementsCollection searchButton1 = $$x("//button[@class= 'btn btn-primary']");
    private ElementsCollection saveButton = $$x("//button[@class='btn btn-primary']");
    private ElementsCollection saveButton1 = $$x("//button[@class = 'btn btn-primary']");
    private SelenideElement numberField = $x("//input[@id= 'vehicleNumber']");
    private SelenideElement vinCodeField = $x("//input[@id= 'vin']");
    private ElementsCollection searchButton2 = $$x("//button[@class= 'btn btn-primary'][1]");
    private SelenideElement avatarField = $x("//input[@class = 'form-control d-none']");
    //private SelenideElement countryField1 = $x("//input[@aria-controls = 'ac756d846ae2']");
    private ElementsCollection countryField1 = $$x("//*[.='Выберите страну']");
    private SelenideElement vehicleNumberMain = $x("//input[@id = 'vehicle-number-main']");
    private ElementsCollection mainSaveButton = $$x("//div[@class = 'p-0 w-auto']");
    private ElementsCollection IDtype = $$x("//div[@class='ng-input']");


    public void createNewDriver()  {
        burger.click();
        registration.click();
        registrationCards.click();
        createNewCard.click();
        personalNumberField.sendKeys("22309199600900");
        CountryField.click();
        CountryField.sendKeys("Кыргызстан");
        //testCountryKG.sendKeys(Keys.RETURN);
        testCountryKG.click();
        //searchButton1.first().click();
        saveButton.get(0).click();
        //IDtype.get(0).click();
    }

    public void createNewVehicle(String vehicleNumber)  {
        numberField.sendKeys(vehicleNumber);
        searchButton2.get(1).click();
        saveButton.get(0).click();
        avatarField.uploadFile(new File("src/test/data/stinger.jpg"));
        saveButton1.get(1).click();
        vehicleNumberMain.sendKeys("2222");
        mainSaveButton.get(4).click();
//        countryField1.get(5).click();
        //testCountry.click();
    }
}
