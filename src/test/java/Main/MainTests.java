package Main;

import Main.Ancestors.BaseTest;
import Main.Pages.*;
import com.mifmif.common.regex.Main;
import net.datafaker.Faker;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

//https://roufid.com/no-compiler-is-provided-in-this-environment/#2-_refer_the_java_home_to_a_jdk


public class MainTests extends BaseTest {

        private static final String BASE_URL = "https://devsmart.customs.gov.kg";
        private String username = "21007197601010";
        private String username1 = "23010200100100";
        private String password = "1007";
        private String password1 = "2111";
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

        @Test
        public void addNewColumn() throws InterruptedException {
                auth();
                ColumnsFIlterPage columnsFIlterPage = new ColumnsFIlterPage();
                columnsFIlterPage.addNewColumn();
                Thread.sleep(4000);

        }

        @Test
        public void removeOneColumn() throws InterruptedException {
                auth();
                ColumnsFIlterPage columnsFIlterPage = new ColumnsFIlterPage();
                columnsFIlterPage.removeOneColumn();
                Thread.sleep(2000);
        }

        @Test
        public void resetColumns() throws InterruptedException {
                auth();
                ColumnsFIlterPage columnsFIlterPage = new ColumnsFIlterPage();
                columnsFIlterPage.removeOneColumn();
                columnsFIlterPage.resetColumns();
        }
        @Test
        public void leave3Columns() throws InterruptedException {
                auth();
                ColumnsFIlterPage columnsFIlterPage = new ColumnsFIlterPage();
                columnsFIlterPage.leaveThreeColumns();
                Thread.sleep(5000);

        }

        @Test
        public void filterByStatus() throws InterruptedException{
                auth();
                FilterPage filterPage = new FilterPage();
                filterPage.setStatusFilter();
                Thread.sleep(2000);

        }
        @Test
        public void filterByRecordingMethod() throws InterruptedException {
                auth();
                FilterPage filterPage = new FilterPage();
                filterPage.setRecordingMethodFilter();

        }
}
