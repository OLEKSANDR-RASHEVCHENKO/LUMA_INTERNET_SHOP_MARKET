package E2E.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Top50Page extends WomenPage{
    public Top50Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-ui-id='page-title-wrapper']")
    WebElement header;
    @FindBy(xpath = "//*[@class='item product product-item']//*[@alt='Antonia Racer Tank']")
    WebElement antoniaRacer;//Create Enums Class

    public void selectAntoniaRacer(){
        antoniaRacer.click();
    }
}
