package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

public class GroupModificationTests extends TestBase {
    private ContactsListPage contactPage;

    @BeforeEach
    public void precondition() {
        contactPage = getPage.getContactsPage();
    }

    @Test
    public void testGroupModification() {

        contactPage.gotoGroups()
                .selectFirstGroup()
                .initGroupModification()
                .editForm(new GroupData("test1", "test2", "test3"))
                .submitGroupModification()
                .returnToGroups();
    }
}
