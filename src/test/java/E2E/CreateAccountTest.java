package E2E;

import E2E.pages.Create_An_Account_Page;
import E2E.pages.Home_Page;
import org.testng.annotations.Test;

public class CreateAccountTest extends Test_Base{
    Home_Page homePage;
    Create_An_Account_Page createAnAccountPage;

    @Test
    public void userCanCreateAnAccount(){
        String firstName = "Oleksandr";
        String lastName = "Shevchenko";
        String email = "rashevchenkooo@gmail.com";
        String password = "Gazmanov_1234";
        String confirmPassword = "Gazmanov_1234";

        homePage = new Home_Page(app.driver);
        homePage.clickOnCreateAnAccountButtonToCreateAcc();

        createAnAccountPage = new Create_An_Account_Page(app.driver);
        createAnAccountPage.createNewAccount(firstName,lastName,email,password,confirmPassword);

    }
}
