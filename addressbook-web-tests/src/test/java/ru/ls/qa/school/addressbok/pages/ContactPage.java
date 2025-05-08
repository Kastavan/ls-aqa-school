package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbok.model.ContactData;

public class ContactPage extends BasePage{
    public ContactPage(ApplicationManager app) {
        super(app);
    }
    public ContactPage fillContactForm(ContactData contactData){
        app.getContactHelper().fillContactForm(contactData);
        return this;
    }
    public ContactPage submitNewContact() {
        app.getContactHelper().submitNewContact();
        return this;
    }
}
