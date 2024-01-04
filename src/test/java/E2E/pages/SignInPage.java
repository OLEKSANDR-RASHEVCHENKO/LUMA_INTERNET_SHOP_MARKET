package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-ui-id='page-title-wrapper']")
    WebElement header;
    @FindBy(xpath = "//*[@id='email']")
    WebElement emailInput;
    @FindBy(xpath = "//*[@id='pass']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id='send2']")
    WebElement signInButton;

    public void signIn(String email ,String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }


}
