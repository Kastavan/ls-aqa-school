package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;
import ru.ls.qa.school.addressbok.pages.GroupsListPage;

public class GroupModificationTests extends TestBase {
    private GroupsListPage groupsPage;

    @BeforeEach
    public void precondition() {
        app.getNavigationHelper().goToGroupPage();
        groupsPage = getPage.getGroupsListPage();
        if (! app.getGroupHelper().isGroupExist()){
            groupsPage.initGroupCreation().createGroup();
        }
    }

    @Test
    public void testGroupModification() {

        groupsPage.selectFirstGroup()
                .initGroupModification()
                .editForm(new GroupData("test1", "test2", "test3"))
                .submitGroupModification()
                .returnToGroups();
    }
}
