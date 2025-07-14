package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.ContactData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactModificationTest extends TestBase {
    private ContactsListPage contactsPage;

    @BeforeEach
    public void precondition() {
        app.getNavigationHelper().goToContactPage();
        contactsPage = getPage.getContactsPage();
    }

    @Test
    public void testModifyContact() {

        ContactData contact = new ContactData("Имя", "+7(999)999-99-99", null);
        int before = app.getContactHelper().getContactsCount();
        contactsPage
                .editContact(0)
                .fillContactForm(contact, false)
                .updateContact()
                .returnToContacts();
        int after = app.getContactHelper().getContactsCount();
        assertThat(after).isEqualTo(before);
    }
}
