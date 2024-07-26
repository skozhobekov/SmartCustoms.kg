package Main.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AddNewCardPage {

    private final SelenideElement burger = $x("//button[@class = 'open-main-nav text-white']");
    private final SelenideElement registration = $x("//span[contains(text(), 'Регистрация')]");
    private final SelenideElement registrationCards = $x("//span[contains(text(), 'Карточки')]");
    private SelenideElement createNewCard = $x("//button[@class = 'form-control custom-button-add']");
    private SelenideElement personalNumberField = $x("//input[@title = 'Персональный номер']");
    private SelenideElement CountryField = $x("//div[@class= 'ng-input']");
    private SelenideElement testCountry = $x("//*[.='12313']");
    private ElementsCollection searchButton1 = $$x("//button[@class= 'btn btn-primary']");
    private SelenideElement saveButton = $x("//div[@class= 'd-inline-block ms-2 ng-star-inserted'][1]");
    private ElementsCollection saveButton1 = $$x("//button[@class = 'btn btn-primary']");

    private SelenideElement numberField = $x("//input[@id= 'vehicleNumber']");
    private SelenideElement vinCodeField = $x("//input[@id= 'vin']");
    private ElementsCollection searchButton2 = $$x("//button[@class= 'btn btn-primary'][1]");
    private SelenideElement avatarField = $x("//input[@class = 'form-control d-none']");
    //private SelenideElement countryField1 = $x("//input[@aria-controls = 'ac756d846ae2']");

    private ElementsCollection countryField1 = $$x("//*[.='Выберите страну']");
    private SelenideElement vehicleNumberMain = $x("//input[@id = 'vehicle-number-main']");
    private ElementsCollection mainSaveButton = $$x("//div[@class = 'p-0 w-auto']");


    public void createNewDriver(String vehicleNumber)  {
        burger.click();
        registration.click();
        registrationCards.click();
        createNewCard.click();
        personalNumberField.sendKeys("2222");
        CountryField.click();
        testCountry.click();
        searchButton1.first().click();
        saveButton.click();

    }

    public void createNewVehicle(String vehicleNumber)  {
        numberField.sendKeys("2222");
        searchButton2.get(1).click();
        saveButton.click();
        avatarField.uploadFile(new File("src/test/data/stinger.jpg"));
        saveButton1.get(1).click();
        vehicleNumberMain.sendKeys("2222");
        mainSaveButton.get(4).click();
//        countryField1.get(5).click();
        //testCountry.click();


    }
}
