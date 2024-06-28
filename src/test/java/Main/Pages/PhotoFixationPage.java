package Main.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;


public class PhotoFixationPage {

    private final SelenideElement scrollToObject = $x("//footer[@class='pt-4 pb-4']");
    private final SelenideElement lookPhoto = $x("//button[@data-bs-target='#photo-recording-modal']");
    private final SelenideElement addNewPhoto = $x("//*[.='Добавить новый']");
    private final SelenideElement ATSNumberField = $x("//input[@name= 'chassisId']");
    private final ElementsCollection countryPick =$$x("//*[.='Выберите страну из списка']");
    private final ElementsCollection typePick =$$x("//*[.='Выберите тип из списка']");
    private final ElementsCollection modelPick =$$x("//*[.='Выберите модель из списка']");
    private final ElementsCollection cameraPick=$$x("//*[.='Выберите камеру из списка']");
    private final ElementsCollection datePick=$$x("//div[@class='input-icon-container']");
    private final ElementsCollection dayPick=$$x("//td[@class='available weekend ng-star-inserted']");
    private final ElementsCollection saveButton=$$x("//button[@type='submit']");
    private final ElementsCollection uploadImageBtn=$$x("//input-file[@class='ng-tns-c238940620-1'][1]");
    private SelenideElement testCountry = $x("//*[.='12313']");
    private SelenideElement testType = $x("//*[.='fadfa']");
    private SelenideElement carModel = $x("//*[.='Acura']");
    private SelenideElement cameraModel = $x("//*[.='bvz f']");
    private SelenideElement divid = $x("//*[@id=\"photo-recording-modal\"]/div/div/div[2]/div[1]/form/div[2]/div/div[4]/input-file[1]");



    public void fullfiling() {
        scrollToObject.scrollIntoView(true);
        lookPhoto.click();
        addNewPhoto.click();
        ATSNumberField.sendKeys("01556KG");
        countryPick.first().click();
        testCountry.click();
        typePick.first().click();
        testType.click();
        modelPick.get(1).click();
        carModel.click();
        cameraPick.get(1).click();
        cameraModel.click();
        datePick.get(0).click();
        dayPick.get(1).click();
        //uploadImageBtn.get(0).uploadFile(new File("src/test/data/stinger.jpg"));
        //divid.click();
        saveButton.get(3).click();
    }
}
