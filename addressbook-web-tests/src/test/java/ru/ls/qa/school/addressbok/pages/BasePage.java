package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class BasePage {
    protected static ApplicationManager app;

    public BasePage() {
        this.app = new ApplicationManager();
    }

    public GroupsListPage gotoGroups(){
        app.getNavigationHelper().goToGroupPage();
        return new GroupsListPage();
    }
}