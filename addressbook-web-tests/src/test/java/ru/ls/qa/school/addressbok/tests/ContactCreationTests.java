package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.ContactData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

public class ContactCreationTests extends TestBase {

    private ContactsListPage contactsPage;

    @BeforeEach
    public void precondition() {
        contactsPage = getPage.getContactsPage();
    }

    @Test
    public void newTest() {

        ContactData contact = new ContactData("Имя", "+7(999)999-99-99");

        contactsPage
                .addNewContact()
                .fillContactForm(contact)
                .submitNewContact();
    }
}