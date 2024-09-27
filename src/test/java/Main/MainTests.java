package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.AddNewCardPage;
import Main.Pages.LoginPage;
import Main.Pages.MainPage;
import Main.Pages.PhotoFixationPage;
import net.datafaker.Faker;
import org.junit.Ignore;
import org.junit.Test;

//https://roufid.com/no-compiler-is-provided-in-this-environment/#2-_refer_the_java_home_to_a_jdk


public class MainTests extends BaseTest {

        private static final String BASE_URL = "https://devsmart.customs.gov.kg";
        private String username = "21007197601010";
        private String password = "1007";
        private static final String vehicleNumber = "2222";

        @Test
        public void auth() {
                LoginPage loginPage = new LoginPage(BASE_URL);
                loginPage.login(username, password);
        }

        @Test
        public void CardFilling() throws InterruptedException {
                auth();
                MainPage mainPage = new MainPage();
                mainPage.navigateToCard();
                mainPage.cardFilling();
                Thread.sleep(4000);
        }

        @Test
        public void createNewCard() throws InterruptedException {
                auth();
                AddNewCardPage addNewCardPage = new AddNewCardPage();
                addNewCardPage.createNewDriver();
                //addNewCardPage.createNewVehicle(vehicleNumber);
                Thread.sleep(5000);
        }
}
