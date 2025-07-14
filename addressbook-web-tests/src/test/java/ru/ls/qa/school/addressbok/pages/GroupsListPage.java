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

    public GroupsListPage selectGroupByIndex(int index) {
        app.getGroupHelper()
           .selectGroupByIndex(index);
        return this;
    }

    public GroupsListPage initDeleteGroup() {
        app.getGroupHelper()
           .clickDeleteGroupBtn();
        return this;
    }
    public GroupsListPage returnToGroups() {
        app.getNavigationHelper()
           .returnToGroupsPageFromCreation();
        return this;
    }
}