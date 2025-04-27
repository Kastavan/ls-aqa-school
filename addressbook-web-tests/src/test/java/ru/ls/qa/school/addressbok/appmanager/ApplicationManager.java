package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.Selenide;

public class ApplicationManager {
    //private final GroupHelper groupHelper = new GroupHelper();
    //private final NavigationHelper navigationHelper = new NavigationHelper();
    //private final ContactHelper contactHelper = new ContactHelper();
    //private final SessionHelper sessionHelper = new SessionHelper();

    public static void init() {
        Selenide.open("http://localhost/addressbook");
        SessionHelper.login("admin", "secret");
    }
    public static void stop() {
        SessionHelper.logout();
        Selenide.closeWebDriver();
    }



}
