package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import ru.ls.qa.school.addressbok.config.WebDriverConfig;
import ru.ls.qa.school.addressbok.model.LoginData;

public class ApplicationManager {
    private final WebDriverConfig config;
    private final GroupHelper groupHelper = new GroupHelper();
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private final ContactHelper contactHelper = new ContactHelper();
    private final SessionHelper sessionHelper = new SessionHelper();

    //уточнить корректность на Q&A
    public ApplicationManager() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public void init() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser().name().toLowerCase();
        Selenide.open("/");
        getSessionHelper().login(new LoginData("admin", "secret"));
    }

    public void stop() {
        getSessionHelper().logout();
        Selenide.closeWebDriver();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
