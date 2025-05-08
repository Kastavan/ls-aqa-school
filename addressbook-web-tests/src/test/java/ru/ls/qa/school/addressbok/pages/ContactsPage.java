package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class ContactsPage extends BasePage{
    public ContactsPage(ApplicationManager app) {
        super(app);
    }
    public ContactsPage openGroupPage(){
        app.getNavigationHelper().gotoGroupPage();
        return this;
    }
    public ContactsPage addNewContact(){
        app.getContactHelper().addNewContactPage();
        return this;
    }
}
