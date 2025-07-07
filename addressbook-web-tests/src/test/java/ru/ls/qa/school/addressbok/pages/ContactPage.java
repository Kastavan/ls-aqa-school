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
}
