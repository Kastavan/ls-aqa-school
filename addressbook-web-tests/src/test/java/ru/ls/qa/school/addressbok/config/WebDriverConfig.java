package ru.ls.qa.school.addressbok.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://localhost/addressbook/")
    String getBaseUrl();
    @Key("Browser")
    @DefaultValue("CHROME")
    Browser getBrowser();
    @Key("RemoteURL")
    @DefaultValue("http://localhost:4444")
    URL getRemoteURL();
}
