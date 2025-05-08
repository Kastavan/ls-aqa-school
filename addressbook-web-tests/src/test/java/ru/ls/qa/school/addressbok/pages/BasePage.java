package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class BasePage {
    protected ApplicationManager app;

    public BasePage(ApplicationManager app) {
        this.app = app;
    }
}
