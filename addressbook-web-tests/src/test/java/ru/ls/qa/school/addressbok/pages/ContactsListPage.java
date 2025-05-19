package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class ContactsListPage extends BasePage{

    public ContactPage addNewContact(){
        app.getContactHelper().initCreationContact();
        return new ContactPage();
    }
}