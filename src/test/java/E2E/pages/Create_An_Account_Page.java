package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_An_Account_Page extends Home_Page {
    public Create_An_Account_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-ui-id='page-title-wrapper']")
    WebElement header;
    @FindBy(xpath = "//*[@id='firstname']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@id='lastname']")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@id='email_address']")
    WebElement emailInput;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id='password-confirmation']")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//*[@class='action submit primary']")
    WebElement createAccButton;

    public void createNewAccount(String firstName,String lastName,String email,String password,String confirmPassword){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(confirmPassword);
        createAccButton.click();


    }



}

