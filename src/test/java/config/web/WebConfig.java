package config.web;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
        "file:~/${env}.properties",
        "file:./${env}.properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    Browser browser();

    @Key("baseUrl")
    String baseUrl();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("pageLoadStrategy")
    String pageLoadStrategy();

    @Key("holdBrowserOpen")
    Boolean holdBrowserOpen();

    @Key("isRemote")
    Boolean isRemote();

    @Key("remoteUrl")
    String remoteUrl();
}