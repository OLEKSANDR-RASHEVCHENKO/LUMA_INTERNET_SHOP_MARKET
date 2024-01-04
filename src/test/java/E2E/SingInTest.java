package E2E;

import E2E.pages.Home_Page;
import E2E.pages.SignInPage;
import org.testng.annotations.Test;

public class SingInTest extends Test_Base{
    Home_Page homePage;
    SignInPage signInPage;
    @Test
    public void userCanSingIn(){
        String email = "rashevchenkooo@gmail.com";
        String password = "Gazmanov_1234";

        homePage = new Home_Page(app.driver);
        homePage.clickOnSignInButton();

        signInPage = new SignInPage(app.driver);
        signInPage.signIn(email,password);
    }
}
