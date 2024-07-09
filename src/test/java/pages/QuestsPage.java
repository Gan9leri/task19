package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class QuestsPage {

    SelenideElement educationButton = $(byTagAndText("div","Курс")),
                    questsMap = $(".tabs__button");

    public QuestsPage openPage(){
        open("");
        return this;
    }

    public QuestsPage goToQuestsPage(){
        educationButton.click();
        return this;
    }

    public QuestsPage checkCurrentFrameUrl(String value){
        webdriver().shouldHave(currentFrameUrl(value));
        return this;
    }

    public QuestsPage checkQuestsMapButton(String value){
        questsMap.shouldHave(Condition.text(value));
        return this;
    }
}