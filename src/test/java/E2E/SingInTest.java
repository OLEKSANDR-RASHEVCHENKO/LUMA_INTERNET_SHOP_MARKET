package E2E;

import E2E.pages.Home_Page;
import E2E.pages.SignInPage;
import E2E.pages.enums.Menu;
import E2E.pages.womenPage.Top50Page;
import E2E.pages.womenPage.WomenPage;
import org.testng.annotations.Test;

public class SingInTest extends Test_Base {
    Home_Page homePage;
    SignInPage signInPage;

    WomenPage womenPage;
    Top50Page top50Page;

    @Test
    public void userCanSingIn() {
        String email = "rashevchenkooo@gmail.com";
        String password = "Gazmanov_1234";

        homePage = new Home_Page(app.driver);
        homePage.clickOnSignInButton();

        signInPage = new SignInPage(app.driver);
        signInPage.signIn(email, password);
        homePage.openMenu(Menu.WOMEN);
        womenPage = new WomenPage(app.driver);
        womenPage.top50Click();
        top50Page = new Top50Page(app.driver);
        top50Page.selectAntoniaRacer();

    }
}
