package E2E.pages.womenPage;


import E2E.pages.Home_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Home_Page {
    public WomenPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-ui-id='page-title-wrapper']")
    WebElement header;
    @FindBy(xpath = "//*[@class='item home']")
    WebElement homeButton;
    @FindBy(xpath = "//*[@class='item']//*[text()='Tops']")
    WebElement top50;
    @FindBy(xpath = "//*[@class='item']//*[text()='Bottoms']")
    WebElement bottoms;
    @FindBy(xpath = "//*[@class='item']//*[text()='Hoodies & Sweatshirts']")
    WebElement hoodiesSweatshirts;
    @FindBy(xpath = "//*[@class='item']//*[text()='Jackets']")
    WebElement jackets;
    @FindBy(xpath = "//*[@class='item']//*[text()='Tees']")
    WebElement tees;
    @FindBy(xpath = "//*[@class='item']//*[text()='Bras & Tanks']")
    WebElement brasTanks;
    @FindBy(xpath = "//*[@class='item']//*[text()='Pants']")
    WebElement pants;
    @FindBy(xpath = "//*[@class='item']//*[text()='Shorts']")
    WebElement shorts;

    public void top50Click(){
        top50.click();
    }
}
