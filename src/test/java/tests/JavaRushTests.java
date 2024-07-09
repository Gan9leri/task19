package tests;

import org.junit.jupiter.api.Test;
import pages.QuestsPage;

public class JavaRushTests extends TestBase{

    @Test
    void GoToQuestsTest(){
        QuestsPage step = new QuestsPage();
        step.openPage()
                .goToQuestsPage()
                .checkCurrentFrameUrl("https://javarush.com/quests")
                .checkQuestsMapButton("Карта квестов");
    }
}