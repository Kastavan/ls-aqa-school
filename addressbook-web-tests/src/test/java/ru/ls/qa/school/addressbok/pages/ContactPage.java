package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.model.ContactData;

public class ContactPage extends BasePage{

    public ContactPage fillContactForm(ContactData contactData, boolean creation){
        app.getContactHelper().fillContactForm(contactData, creation);
        return this;
    }
    public ContactPage submitNewContact() {
        app.getContactHelper().clickSubmitContactBtn();
        return this;
    }
    public ContactPage updateContact() {
        app.getContactHelper().clickUpdateContactBtn();
        return this;
    }
    public ContactsListPage returnToContacts() {
        app.getNavigationHelper()
                .returnToContactsPageFromCreation();
        return new ContactsListPage();
    }
    public ContactsListPage createContact(){
        return fillContactForm(new ContactData("Имя", "+7(999)999-99-99", "test1"), true)
                .submitNewContact()
                .returnToContacts();
    }
}
