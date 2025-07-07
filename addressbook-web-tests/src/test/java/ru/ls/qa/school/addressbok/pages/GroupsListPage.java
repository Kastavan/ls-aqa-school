package ru.ls.qa.school.addressbok.pages;

public class GroupsListPage extends BasePage {

    public GroupPage initGroupCreation() {
        app.getGroupHelper()
           .clickCreateGroupBtn();
        return new GroupPage();
    }

    public GroupPage initGroupModification() {
        app.getGroupHelper()
           .clickModificationGroupBtn();
        return new GroupPage();
    }

    public GroupsListPage selectFirstGroup() {
        app.getGroupHelper()
           .selectFirstGroup();
        return this;
    }

    public GroupsListPage initDeleteGroup() {
        app.getGroupHelper()
           .clickDeleteGroupBtn();
        return this;
    }

    public GroupsListPage deleteFirstGroup() {
        return selectFirstGroup().initDeleteGroup();
    }

    public GroupsListPage returnToGroups() {
        app.getNavigationHelper()
           .returnToGroupsPageFromCreation();
        return this;
    }
}