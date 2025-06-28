package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupPage extends BasePage {

    public GroupPage editForm(GroupData groupData) {
        app.getGroupHelper()
           .fillGroupForm(groupData);
        return this;
    }

    public GroupPage submitCreation() {
        app.getGroupHelper()
           .clickSubmitGroupCreationBtn();
        return this;
    }

    public GroupsListPage returnToGroups() {
        app.getNavigationHelper()
           .returnToGroupsPageFromCreation();
        return new GroupsListPage();
    }
    //метод создан для примера, пока сохранен для наглядности
    //public GroupsListPage finishCreation() {
    //    return submitCreation()
    //            .returnToGroups();
    //}

    public GroupPage submitGroupModification() {
        app.getGroupHelper()
           .clickSubmitGroupModificationBtn();
        return this;
    }
}
