package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class BasePage {
    protected ApplicationManager app;

    public BasePage() {
        this.app = PageManager.app;
    }

    public GroupsListPage gotoGroups(){
        app.getNavigationHelper().gotoGroupPage();
        return new GroupsListPage();
    }
}