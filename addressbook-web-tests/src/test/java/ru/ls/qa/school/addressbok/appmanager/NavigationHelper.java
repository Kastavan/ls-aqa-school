package ru.ls.qa.school.addressbok.appmanager;

public class NavigationHelper extends HelperBase {
    public void gotoGroupPage() {
        click(".admin > a");
    }

    public void returnToGroupsPageFromCreation() {
        click("i > a");
    }
}