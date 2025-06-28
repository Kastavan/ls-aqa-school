package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.model.ContactData;

public class ContactPage extends BasePage{

    public ContactPage fillContactForm(ContactData contactData){
        app.getContactHelper().fillContactForm(contactData);
        return this;
    }
    public ContactPage submitNewContact() {
        app.getContactHelper().clickSubmitContactBtn();
        return this;
    }
}
