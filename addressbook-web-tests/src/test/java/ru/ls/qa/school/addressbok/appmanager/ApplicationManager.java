package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.Selenide;
import ru.ls.qa.school.addressbok.model.LoginData;

public class ApplicationManager {
    private final GroupHelper groupHelper = new GroupHelper();
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private final ContactHelper contactHelper = new ContactHelper();
    private final SessionHelper sessionHelper = new SessionHelper();

    public void init() {
        Selenide.open("http://localhost/addressbook");
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
