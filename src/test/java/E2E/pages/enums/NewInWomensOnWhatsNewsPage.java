package E2E.pages.enums;

import lombok.Getter;

@Getter
public enum NewInWomensOnWhatsNewsPage {
    WHATS_NEWS("3"),
    WOMEN("4"),
    MEN("5"),
    GEAR("6"),
    TRAINING("7"),
    SALE("8");

    public final String clickOn;

    NewInWomensOnWhatsNewsPage(String clickOn){
        this.clickOn = "//*[text()='"+clickOn+"']";
    }
}
