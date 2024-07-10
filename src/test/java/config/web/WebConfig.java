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

    @DefaultValue("firefox")
    Browser browser();

    @DefaultValue("https://javarush.com/")
    String baseUrl();

    @DefaultValue("127.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("eager")
    String pageLoadStrategy();

    @DefaultValue("false")
    Boolean isRemote();

    @DefaultValue("https://javarush.com/")
    String remoteUrl();
}