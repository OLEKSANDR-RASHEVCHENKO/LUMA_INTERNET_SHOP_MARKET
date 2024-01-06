package E2E.pages;

import E2E.pages.enums.Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage{
    public Home_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='header content']")
    WebElement header;
    @FindBy(xpath = "//*[@id='search']")
    WebElement search;
    @FindBy(xpath = "//*[@class='panel header']//*[text()='Create an Account']")
    WebElement createAccountButton;
    @FindBy(xpath = "//*[@class='panel header']//*[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")
    WebElement signInButton;


    public void openMenu(Menu menuTab){
        driver.findElement(By.xpath("//*[@id='ui-id-"+menuTab.value+"']")).click();
    }

    public void clickOnCreateAnAccountButtonToCreateAcc(){
        createAccountButton.click();
    }
    public void clickOnSignInButton(){
        signInButton.click();
    }
}
