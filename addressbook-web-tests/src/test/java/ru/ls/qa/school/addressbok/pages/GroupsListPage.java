package ru.ls.qa.school.addressbok.pages;

public class GroupsListPage extends BasePage {

    public GroupPage initGroupCreation() {
        app.getGroupHelper()
           .initGroupCreation();
        return new GroupPage();
    }

    public GroupPage initGroupModification() {
        app.getGroupHelper()
           .initGroupModification();
        return new GroupPage();
    }

    public GroupsListPage selectFirstGroup() {
        app.getGroupHelper()
           .selectFirstGroup();
        return this;
    }

    public GroupsListPage initDeleteGroup() {
        app.getGroupHelper()
           .deleteGroup();
        return this;
    }

    public GroupsListPage deleteFirstGroup() {
        return selectFirstGroup().initDeleteGroup();
    }

    public GroupsListPage returnToGroups() {
        app.getNavigationHelper()
           .returnToGroupsPageFromCreation();
        return new GroupsListPage();
    }
}