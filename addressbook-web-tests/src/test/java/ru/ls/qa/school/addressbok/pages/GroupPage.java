package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupPage extends BasePage {

    public GroupPage editForm(GroupData groupData) {
        app.getGroupHelper()
           .fillGroupForm(groupData);
        return this;
    }

    public GroupPage submitCreation() {
        app.getGroupHelper()
           .submitGroupCreation();
        return this;
    }

    public GroupsListPage returnToGroups() {
        app.getNavigationHelper()
           .returnToGroupsPageFromCreation();
        return new GroupsListPage();
    }

    public GroupsListPage finishCreation() {
        return submitCreation()
                .returnToGroups();
    }

    public GroupPage submitGroupModification() {
        app.getGroupHelper()
           .submitGroupModification();
        return this;
    }
}
