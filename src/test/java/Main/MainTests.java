package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.AddNewCardPage;
import Main.Pages.LoginPage;
import Main.Pages.MainPage;
import Main.Pages.PhotoFixationPage;
import org.junit.Test;

public class MainTests extends BaseTest {

        private static final String BASE_URL = "https://devsmart.customs.gov.kg/";
        private String username = "417INS1111";
        private String password = "qweQWE123!@#";

        private static final String vehicleNumber = "2222";

        @Test
        public void auth() {
                LoginPage loginPage = new LoginPage(BASE_URL);
                loginPage.login(username, password);

        }

        @Test
        public void CardFilling()  {
                auth();
                MainPage mainPage = new MainPage();
                mainPage.navigateToCard();
        }

        @Test
        public void photoFixation()  {
                CardFilling();
                PhotoFixationPage photoFixationPage = new PhotoFixationPage();
                photoFixationPage.fullfiling();
        }



        @Test
        public void createNewCard() throws InterruptedException {
                auth();
                AddNewCardPage addNewCardPage = new AddNewCardPage();
                addNewCardPage.createNewDriver(vehicleNumber);
                addNewCardPage.createNewVehicle(vehicleNumber);
                Thread.sleep(5000);

        }
}
