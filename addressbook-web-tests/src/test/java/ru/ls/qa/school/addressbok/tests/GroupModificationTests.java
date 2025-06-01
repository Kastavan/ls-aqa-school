package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;
import ru.ls.qa.school.addressbok.pages.GroupPage;
import ru.ls.qa.school.addressbok.pages.GroupsListPage;

public class GroupModificationTests extends TestBase {
    ContactsListPage contactPage;
    GroupsListPage groupsPage;
    GroupPage groupEditPage;

    @Test
    public void testGroupModification() {
        contactPage = getPage.contacts();
        groupsPage = getPage.getGroupsListPage();
        groupEditPage = getPage.getGroupPage();

        contactPage.gotoGroups();
        groupsPage.selectFirstGroup()
                  .initGroupModification();
        groupEditPage.editForm(new GroupData("test1", "test2", "test3"))
                     .submitGroupModification()
                     .returnToGroups();
    }
}
