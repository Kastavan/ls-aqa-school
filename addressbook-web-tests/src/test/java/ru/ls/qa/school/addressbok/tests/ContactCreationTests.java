package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.ContactData;
import ru.ls.qa.school.addressbok.pages.ContactsListPage;

public class ContactCreationTests extends TestBase {

    ContactsListPage contactsPage;

    @Test //TODO выстроить прочие методы в работу через цепочки, по аналогии с этим тестом
    public void newTest() {

        ContactData contact = new ContactData("Имя", "Адрес", "+7(999)999-99-99", "First@mail.com", "1980");

        contactsPage = getPage.contacts();



        contactsPage
                .addNewContact()
                .fillContactForm(contact)
                .submitNewContact();
    }
}