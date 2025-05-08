package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test
    public void newTest() {

        pageManager.getContactsPage().addNewContact();
        pageManager.getContactPage().fillContactForm(new ContactData("Имя", "Адрес", "+7(999)999-99-99", "First@mail.com", "1980"));
        pageManager.getContactPage().submitNewContact();
    }

}

