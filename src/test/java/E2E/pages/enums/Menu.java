package E2E.pages.enums;

import lombok.Getter;

@Getter
public enum Menu {
    WHATS_NEWS("3"),
    WOMEN("4"),
    Jeans("11"),
    MEN("5"),
    GEAR("6"),
    TRAINING("7"),
    SALE("8");

    public final String value;

    Menu(String value){
        this.value = value;
    }

}
