package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatNewsPage extends Home_Page {
    public WhatNewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-ui-id='page-title-wrapper']")
    WebElement header;
    @FindBy(xpath = "//*[text()='Shop New Yoga']")
    WebElement shopNewYogaButton;
    @FindBy(xpath = "//*[text()='Performance Fabrics']")
    WebElement performanceFabricsButton;
    @FindBy(xpath = "//*[text()='Shop Eco Friendly ']")
    WebElement shopEcoFriendlyButton;

public ShopNewYogaPage openshopNewYogaPage(){
    shopNewYogaButton.click();
    return new ShopNewYogaPage(driver);
}
public PerformanceFabricsPage openPerformanceFabricsPage(){
    performanceFabricsButton.click();
    return new PerformanceFabricsPage(driver);
}
public ShopEcoFriendlyPage openShopEcoFriendlyPage(){
    shopEcoFriendlyButton.click();
    return new ShopEcoFriendlyPage(driver);
}

}

