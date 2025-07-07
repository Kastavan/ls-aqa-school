package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.ContactData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

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

        contactsPage
                .editContact()
                .fillContactForm(contact, false)
                .updateContact();
    }
}
