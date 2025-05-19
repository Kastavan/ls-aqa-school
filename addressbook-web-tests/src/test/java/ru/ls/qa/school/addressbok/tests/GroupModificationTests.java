package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        getPage.contacts().gotoGroups();
        getPage.getGroupsListPage().selectFirstGroup();
        getPage.getGroupsListPage().initGroupModification();
        getPage.getGroupPage().editForm(new GroupData("test1", "test2", "test3"));
        getPage.getGroupPage().submitGroupModification();
        getPage.getGroupPage().returnToGroups();
    }
}
