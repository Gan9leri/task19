package tests;

import config.ConfigReader;
import config.ProjectConfiguration;
import config.web.WebConfig;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    private static final WebConfig webConfig = ConfigReader.Instance.read();

    @BeforeAll
    static void beforeAll() {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(webConfig);
        projectConfiguration.webConfig();
    }
}