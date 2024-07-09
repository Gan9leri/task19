package config;

import com.codeborne.selenide.Configuration;
import config.web.WebConfig;

public class ProjectConfiguration {
    private final WebConfig webConfig;

    public ProjectConfiguration(WebConfig webConfig) {
        this.webConfig = webConfig;
    }

    public void webConfig() {
        Configuration.browser = webConfig.browser().toString();
        Configuration.baseUrl = webConfig.baseUrl();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
        Configuration.pageLoadStrategy = webConfig.pageLoadStrategy();
        Configuration.holdBrowserOpen = webConfig.holdBrowserOpen();
        if(webConfig.isRemote()){
            Configuration.remote = webConfig.remoteUrl();
        }
    }
}