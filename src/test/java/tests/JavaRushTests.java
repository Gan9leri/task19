package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.QuestsPage;

@DisplayName("UI тесты")
@Tag("ui")
public class JavaRushTests extends TestBase{

    @DisplayName("Тест открытия курсов")
    @Tag("GoToQuestsTest")
    @Test
    void GoToQuestsTest(){
        QuestsPage step = new QuestsPage();
        step.openPage()
                .goToQuestsPage()
                .checkCurrentFrameUrl("https://javarush.com/quests")
                .checkQuestsMapButton("Карта квестов");
    }
}