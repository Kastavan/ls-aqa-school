package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        pageManager.getContactsPage().openGroupPage();
        pageManager.getGroupsListPage().selectGroup();
        pageManager.getGroupsListPage().initGroupModification();
        pageManager.getGroupPage().editForm(new GroupData("test1", "test2", "test3"));
        pageManager.getGroupPage().submitGroupModification();
        pageManager.getGroupPage().returnToGroups();
    }
}
