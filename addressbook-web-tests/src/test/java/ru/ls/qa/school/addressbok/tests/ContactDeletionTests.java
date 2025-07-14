package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

import static com.codeborne.selenide.Selenide.confirm;
import static org.assertj.core.api.Assertions.assertThat;

public class ContactDeletionTests extends TestBase{
    private ContactsListPage contactsPage;

    @BeforeEach
    public void precondition() {
        app.getNavigationHelper().goToContactPage();
        contactsPage = getPage.getContactsPage();
        if (! app.getContactHelper().isContactExist()){
            contactsPage.addNewContact().createContact();
        }
    }

    @Test
    public void testDeleteContact() {

        int before = app.getContactHelper().getContactsCount();
        contactsPage
                .selectContactByIndex(0)
                .initDeleteContact();
                confirm();
        app.getNavigationHelper().goToContactPage();
        int after = app.getContactHelper().getContactsCount();
        assertThat(after).isEqualTo(before - 1);
    }
}
