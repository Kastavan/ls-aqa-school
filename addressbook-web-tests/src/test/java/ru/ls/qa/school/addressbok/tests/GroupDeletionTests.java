package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        pageManager.getContactsPage().openGroupPage();
        pageManager.getGroupsListPage().selectGroup();
        pageManager.getGroupsListPage().deleteGroup();
        pageManager.getGroupPage().returnToGroups();
    }

}
